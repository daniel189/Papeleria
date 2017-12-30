/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import papeleriafarfarela.Cuenta;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import MODELO.Conexion;
import VistasUsuarios.UsuariosDelete;
import VistasUsuarios.UsuariosNew;

/**
 *
 * @author Crispin
 */
public class QueryUsuario {
    PreparedStatement sentencia;
    ResultSet resul;
    Connection cone;
    
    public ArrayList<String> getcuenta(String parametroCuenta){
            ArrayList<String> cuenta = new ArrayList<>();
            Connection cone = Conexion.getConexion();
            String sql="SELECT * FROM cuenta WHERE cue_cuenta = '"+ parametroCuenta +"'";
        try {
            Statement st = cone.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cuenta.add(rs.getString(1));
                cuenta.add(rs.getString(2));
                cuenta.add(rs.getString(3));
                cuenta.add(rs.getString(4));
                cuenta.add(rs.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al traer las Cuentas", "Error DB", JOptionPane.ERROR_MESSAGE);
        }
        return cuenta;
    }
    public ArrayList<Cuenta> getCuentas(){
        ArrayList<Cuenta> listado = new ArrayList();
        Cuenta cuen;
        cone = Conexion.getConexion();
        try{
            sentencia = cone.prepareStatement("SELECT * FROM cuenta");
            resul= sentencia.executeQuery();
            while(resul.next()){
                cuen = new Cuenta("","",0,0,"");
                cuen.setCuenta(resul.getString(1));
                cuen.setEmp_id(resul.getInt(2));
                cuen.setPass(resul.getString(3));
                cuen.setNivel(resul.getInt(4));
                cuen.setHabilitado(resul.getString(5));
                //agregamos a la ARRAYLIST
                listado.add(cuen);
            }
        }catch(SQLException ex){
            Logger.getLogger(QueryUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    
    public void setCuenta(Cuenta cue){
        Connection cone = Conexion.getConexion();
        try {
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            PreparedStatement sentencia = cone.prepareStatement("INSERT INTO cuenta VALUES (?,?,?,?,?)");
            sentencia.setString(1, cue.getCuenta());
            sentencia.setInt(2, cue.getEmp_id());
            sentencia.setString(3, cue.getPass());
            sentencia.setInt(4, cue.getNivel());
            sentencia.setString(5, cue.getHabilitado());
            //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
            int res=sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS GUARDADOS");
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EliminarRegistro(String cuenta){
        Connection cone= Conexion.getConexion();
        try {
            PreparedStatement sentencia = cone.prepareStatement("DELETE FROM cuenta WHERE cue_cuenta = '"+ cuenta +"'");
            int res = sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS ELIMINADOS");
                UsuariosDelete obj = new UsuariosDelete();
                obj.txtUsuario.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS O DATOS RELACIONADOS CON MAS ELEMENTOS");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Fallo, Los datos no han podido ser eliminados puesto a que este usuario tiene registros asociados");
            Logger.getLogger(QueryUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateCuenta(ArrayList<String> lista){
        Connection cone = Conexion.getConexion();
        int n = Integer.parseInt(lista.get(1));
        try{
            PreparedStatement sentencia = cone.prepareStatement("UPDATE cuenta SET cue_nivel = '"+ n +"' WHERE cue_cuenta = '"+ lista.get(0) +"'");
            //si guarda bien o no
            int res=sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS EDITADOS");
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR, FALLO: "+ex);
        }
    }
    
    public void resetCuenta(String cuenta, String pass){
        Connection cone = Conexion.getConexion();
        try{
            PreparedStatement sentencia = cone.prepareStatement("UPDATE cuenta SET cue_pass = '"+ pass +"' WHERE cue_cuenta = '"+ cuenta +"'");
            //si guarda bien o no
            int res=sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, CONTRASEÑA EDITADA.");
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR, FALLO: "+ex);
        }
    }
}
