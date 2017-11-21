/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import MODELO.Conexion;
import VistasClientes.NuevoCliente;
import VistasClientes.GestionCliente;
import VistasVentas.VentasNew;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Crispin
 */
public class queryClientes {
    PreparedStatement sentencia;
    ResultSet resul;
    Connection cone;
    DefaultTableModel modelo;
    //vector conexion los titulos de cada columna
    String[] titulosColumnas = {"CED/RUC/PASAPORTE", "NOMBRE", "APELLIDO"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String info[][] = {};
    // Conectar Base de Datos
    Conexion conectar = new Conexion();
    public void setCliente(ArrayList<String> lista){
        Connection cone = Conexion.getConexion();
        try {
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            PreparedStatement sentencia = cone.prepareStatement("INSERT INTO cliente VALUES (?,?,?,?,?,?)");
            sentencia.setString(1, lista.get(0));
            sentencia.setString(2, lista.get(1));
            sentencia.setString(3, lista.get(2));
            sentencia.setString(4, lista.get(3));
            sentencia.setString(5, lista.get(4));
            sentencia.setString(6, lista.get(5));
            //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
            int res=sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS GUARDADOS");
                NuevoCliente obj = new NuevoCliente();
                obj.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MODELO.queryUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS O DUPLICADOS");
        }
    }
    
    public void EliminarRegistro(String iden){
        Connection cone= Conexion.getConexion();
        try {
            PreparedStatement sentencia = cone.prepareStatement("DELETE FROM cliente WHERE cli_identificador = '"+ iden +"'");
            int res = sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS ELIMINADOS");
                GestionCliente obj = new GestionCliente();
                obj.limparDatos();
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS O DATOS RELACIONADOS CON MAS ELEMENTOS");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Fallo, Los datos no han podido ser eliminados puesto a que este Cliente tiene registros asociados");
            Logger.getLogger(queryClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateCliente(ArrayList<String> lista){
        Connection cone = Conexion.getConexion();
        try{
            PreparedStatement sentencia = cone.prepareStatement("UPDATE cliente SET cli_nombres = '"+ lista.get(1) +"',cli_apelidos = '"+
                    lista.get(2)+"',cli_direccion = '"+ lista.get(3) + "',cli_telefono = '"+lista.get(4) +"',cli_fechaNacimiento = '"+
                    lista.get(5) +"' WHERE cli_identificador = '"+ lista.get(0) +"'");
            //si guarda bien o no
            int res=sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS EDITADOS");
                GestionCliente obj = new  GestionCliente();
                obj.limparDatos();
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR, FALLO: "+ex);
        }
    }
    
    
    
    
     public void agregarCliente(String cedula, String nombre, String apellido) {

         Connection reg = Conexion.getConexion();
        
         String sql = "INSERT INTO cliente ( CLI_IDENTIFICADOR, CLI_NOMBRES, CLI_APELIDOS)VALUES (?,?,?)";
            try {
            
            PreparedStatement pst= reg.prepareStatement(sql);
            pst.setString(1,cedula);
            pst.setString(2,nombre);
            pst.setString(3,apellido);
            
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Cliente Registrado Exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error - "+ex);
            //Logger.getLogger(agregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//cierra metodo agregarCliente

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    /**
     * Metodo para listar todos los registros de la tabla
     * de clientes, los muestra en un jtable.
     */
    public void listarTodosClientes() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
        VentasNew.SeleccionarCliente.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();

    }//cierra metodo listarTodosClientes
    
        public void CargarClientes() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
        VentasNew.SeleccionarCliente.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();

    }//cierra metodo cargarTodosClientes

     /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection conexion = null;
    Statement sent = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

    public void ejecutarConsultaTodaTabla() {

        try {
            conexion = Conexion.getConexion();

            sent = conexion.createStatement();
            String consultaSQL = "SELECT * FROM cliente ORDER BY CLI_APELIDOS ASC";
            resultado = sent.executeQuery(consultaSQL);


            //mientras haya datos en la BD ejecutar eso...
            while (resultado.next()) {


                String codigo = resultado.getString("CLI_IDENTIFICADOR");
                String nombre = resultado.getString("CLI_NOMBRES");
                String apellido = resultado.getString("CLI_APELIDOS");
                



                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, apellido};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);
                
            }//cierra while (porque no hay mas datos en la BD)

            conexion.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion = null;
        } 

    }//cierra metodo ejecutarConsulta
    
  
    public void buscarCliente(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorApellido) {

        

            modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

            

            //le asigna el modelo al jtable
            VentasNew.SeleccionarCliente.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroCedulaONombreOapellido(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorApellido);

        

    }//cierra metodo buscarCliente
    
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
     * clientes, se puede buscar por la cedula o por el nombre.
     */
    public void buscarRegistroCedulaONombreOapellido(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorApellido) {

        try {
            Connection con;
            con = Conexion.getConexion();
            String selectSQL;
            resultado = null;
            if (buscarPorCedula == true) {               
                selectSQL = "SELECT * FROM cliente WHERE CLI_IDENTIFICADOR LIKE ? ORDER BY CLI_APELIDOS ASC";

                ps.setString(1, "%" + parametroBusqueda + "%");
                  ps = con.prepareStatement(selectSQL);
            } 
            else if(buscarPorNombre== true){
                selectSQL = "SELECT * FROM cliente WHERE CLI_NOMBRES LIKE ? ORDER BY CLI_APELIDOS ASC";
                ps = con.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            else if(buscarPorApellido== true){

                selectSQL = "SELECT * FROM cliente WHERE CLI_APELIDOS LIKE ? ORDER BY CLI_APELIDOS ASC";
                ps = con.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
        
            resultado = ps.executeQuery();

            while (resultado.next()) {
                String cedula = resultado.getString("CLI_IDENTIFICADOR");
                String nombre = resultado.getString("CLI_NOMBRES");
                String apellido = resultado.getString("CLI_APELIDOS");
                
                

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {cedula,nombre, apellido};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        }  finally {
            //CerrarConexiones.metodoCerrarConexiones(conexion, sent, resultado, ps);
        }


    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
}
