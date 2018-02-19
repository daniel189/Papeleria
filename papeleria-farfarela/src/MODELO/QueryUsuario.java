/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import PapeleriaFarfarela.Account;
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
            Connection cone = Conexion.getConnection();
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
    public ArrayList<Account> getCuentas(){
        ArrayList<Account> listado = new ArrayList();
        Account cuen;
        cone =  Conexion.getConnection();
        try{
            sentencia = cone.prepareStatement("SELECT * FROM cuenta");
            resul= sentencia.executeQuery();
            while(resul.next()){
                cuen = new Account("","",0,0,"");
                cuen.setAccountName(resul.getString(1));
                cuen.setEmployeeId(resul.getInt(2));
                cuen.setAccountPassword(resul.getString(3));
                cuen.setAccountAccessLevel(resul.getInt(4));
                cuen.setAccountStatus(resul.getString(5));
                //agregamos a la ARRAYLIST
                listado.add(cuen);
            }
        }catch(SQLException ex){
            Logger.getLogger(QueryUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    
    public void setCuenta(Account cue){
        Connection cone =  Conexion.getConnection();
        try {
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            PreparedStatement sentencia = cone.prepareStatement("INSERT INTO cuenta VALUES (?,?,?,?,?)");
            sentencia.setString(1, cue.getAccountName());
            sentencia.setInt(2, cue.getemployeeId());
            sentencia.setString(3, cue.getAccountPassword());
            sentencia.setInt(4, cue.getAccountAccessLevel());
            sentencia.setString(5, cue.getAccountStatus());
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
        Connection cone=  Conexion.getConnection();
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
        Connection cone =  Conexion.getConnection();
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
        Connection cone =  Conexion.getConnection();
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
