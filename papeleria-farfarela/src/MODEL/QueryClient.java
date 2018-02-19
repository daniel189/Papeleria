/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import MODEL.Conexion;
import ViewClients.CustomerManagemetMethods;
import ViewClients.NewCustomer;
import VistasVentas.NewSale;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Crispin
 */
public class QueryClient {
    PreparedStatement sentencia;
    ResultSet result;
    Connection connection;
    DefaultTableModel model;
    //vector conexion los titulos de cada columna
    String[] titulosColumnas = {"CED/RUC/PASAPORTE", "NOMBRE", "APELLIDO"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String information[][] = {};
    // Conectar Base de Datos
    Conexion conectar = new Conexion();
    JTextField txtIdentifier;
    JTextField txtLastName;
    JTextField txtFirstName;
    JTextField txtAddress;
    JTextField txtPhone;
    public void setCliente(ArrayList<String> lista){
        Connection connectionQuey = Conexion.getConnection();
        try {
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            PreparedStatement sentence = connectionQuey.prepareStatement("INSERT INTO cliente VALUES (?,?,?,?,?,?)");
            sentence.setString(1, lista.get(0));
            sentence.setString(2, lista.get(1));
            sentence.setString(3, lista.get(2));
            sentence.setString(4, lista.get(3));
            sentence.setString(5, lista.get(4));
            sentence.setString(6, lista.get(5));
            //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
            int res=sentence.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS GUARDADOS");
                NewCustomer obj = new NewCustomer();
                obj.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MODEL.QueryUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS O DUPLICADOS");
        }
    }
    
    public void EliminarRegistro(String iden){
        Connection connectionQuery= Conexion.getConnection();
        try {
            PreparedStatement sentence = connectionQuery.prepareStatement("DELETE FROM cliente WHERE cli_identificador = '"+ iden +"'");
            int res = sentence.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS ELIMINADOS");
                CustomerManagemetMethods obj = new  CustomerManagemetMethods();
                obj.limparDatos(txtIdentifier, txtLastName, txtFirstName, txtAddress, txtPhone);
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS O DATOS RELACIONADOS CON MAS ELEMENTOS");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Fallo, Los datos no han podido ser eliminados puesto a que este Cliente tiene registros asociados");
            Logger.getLogger(QueryClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateCliente(ArrayList<String> lista){
        Connection connectionQuery = Conexion.getConnection();
        try{
            PreparedStatement sentence = connectionQuery.prepareStatement("UPDATE cliente SET cli_nombres = '"+ lista.get(1) +"',cli_apelidos = '"+
                    lista.get(2)+"',cli_direccion = '"+ lista.get(3) + "',cli_telefono = '"+lista.get(4) +"',cli_fechaNacimiento = '"+
                    lista.get(5) +"' WHERE cli_identificador = '"+ lista.get(0) +"'");
            //si guarda bien o no
            int res=sentence.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS EDITADOS");
                CustomerManagemetMethods obj = new  CustomerManagemetMethods();
                obj.limparDatos(txtIdentifier, txtLastName, txtFirstName, txtAddress, txtPhone);
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR, FALLO: "+ex);
        }
    }
    
     public void agregarCliente(String cedula, String nombre, String apellido) {

         Connection register = Conexion.getConnection();
        
         String addsql = "INSERT INTO cliente ( CLI_IDENTIFICADOR, CLI_NOMBRES, CLI_APELIDOS)VALUES (?,?,?)";
            try {
            
            PreparedStatement pst= register.prepareStatement(addsql);
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

        model = new DefaultTableModel(information, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el salesTebleModel al jtable
        NewSale.SeleccionarCliente.setModel(model);

        //ejecuta una consulta a la BD
        fetchAll();

    }//cierra metodo listarTodosClientes
    
        public void CargarClientes() {

        model = new DefaultTableModel(information, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el salesTebleModel al jtable
        NewSale.SeleccionarCliente.setModel(model);

        //ejecuta una consulta a la BD
        fetchAll();

    }//cierra metodo cargarTodosClientes

     /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection conexion = null;
    Statement sent = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

    public void fetchAll() {

        try {
            conexion = Conexion.getConnection();

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

                //al salesTebleModel de la tabla le agrega una fila
                //con los datos que están en info
                model.addRow(info);
                
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

        

            model = new DefaultTableModel(information, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

            

            //le asigna el salesTebleModel al jtable
            NewSale.SeleccionarCliente.setModel(model);
            //ejecuta una consulta a la BD
            buscarRegistroCedulaONombreOapellido(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorApellido);

        

    }//cierra metodo buscarCliente
    
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
 clientes, se puede buscar por la cedula o por el searchByName.
     */
    public void buscarRegistroCedulaONombreOapellido(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorApellido) {

        try {
            Connection conection1;
            conection1 = Conexion.getConnection();
            String selectSQL;
            resultado = null;
            if (buscarPorCedula == true) {               
                selectSQL = "SELECT * FROM cliente WHERE CLI_IDENTIFICADOR LIKE ? ORDER BY CLI_APELIDOS ASC";

                ps.setString(1, "%" + parametroBusqueda + "%");
                  ps = conection1.prepareStatement(selectSQL);
            } 
            else if(buscarPorNombre== true){
                selectSQL = "SELECT * FROM cliente WHERE CLI_NOMBRES LIKE ? ORDER BY CLI_APELIDOS ASC";
                ps = conection1.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            else if(buscarPorApellido== true){

                selectSQL = "SELECT * FROM cliente WHERE CLI_APELIDOS LIKE ? ORDER BY CLI_APELIDOS ASC";
                ps = conection1.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
        
            resultado = ps.executeQuery();

            while (resultado.next()) {
                String cedula = resultado.getString("CLI_IDENTIFICADOR");
                String nombre = resultado.getString("CLI_NOMBRES");
                String apellido = resultado.getString("CLI_APELIDOS");
                
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {cedula,nombre, apellido};
                //al salesTebleModel de la tabla le agrega una fila
                //con los datos que están en info
                model.addRow(info);

            }
            conection1.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        }  finally {
            //CerrarConexiones.metodoCerrarConexiones(conexion, sent, resultado, ps);
        }


    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
}
