/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import VistasVentas.SalesView;
import static VistasVentas.SalesView.listadecompras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Crispin
 */
public class QueryFactura {
 
         //modelo para la tabla
    DefaultTableModel modelo;
    //vector con los titulos de cada columna
    
    //matriz donde se almacena los datos de cada celda de la tabla
    String info[][] = {};
    // Conectar Base de Datos
    Conexion conectar = new Conexion();
    

     
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    public void listarTodosFacturas() {
        
        String[] titulosColumnas = {"IDFactura", "CLIENTE", "FECHA", "VENDEDOR","TOTAL"};

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
        SalesView.jTableListarFacturas.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabladeFacturas();

    }//cierra metodo listarTodosFacturas
    
        

     /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

    public void ejecutarConsultaTodaTabladeFacturas() {

        try {
            conexion = Conexion.getConnection();

            sentencia = conexion.createStatement();
            String consultaSQL = "SELECT * FROM facturas ORDER BY FAC_FECHA ASC";
            resultado = sentencia.executeQuery(consultaSQL);


            
            while (resultado.next()) {


                int fact = resultado.getInt("FAC_ID");
                String cliente = resultado.getString("CLI_IDENTIFICADOR");
                String fecha = resultado.getString("FAC_FECHA");
                String vendedor = resultado.getString("CUE_CUENTA");
                String total = resultado.getString("FAC_TOTAL");



                
                Object[] info = {fact,cliente,fecha,vendedor,total};

                
                modelo.addRow(info);

            }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion = null;
        } finally {

            CloseConnection.CloseConnection(conexion, sentencia, resultado, ps);

        }

    }//cierra metodo ejecutarConsulta
    
  
    public void buscarFacturas(String parametroBusqueda, boolean buscarPorFacturas, boolean buscarPorCliente, boolean buscarPorFecha) {

        String[] titulosColumnas = {"IDFactura", "IDCliente", "Fecha", "IDVendedor","Total"};
        if ((parametroBusqueda.trim().length() == 0)) {
            JOptionPane.showMessageDialog(null,"Error, datos incorrectos");
        } else {

            modelo = new DefaultTableModel(info, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

          

            //le asigna el modelo al jtable
            SalesView.jTableListarFacturas.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarFacturasporBusqueda(parametroBusqueda, buscarPorFacturas, buscarPorCliente, buscarPorFecha);

        }

    }//cierra metodo buscarCliente
    
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
     * clientes, se puede buscar por la cedula o por el nombre.
     */
    public void buscarFacturasporBusqueda(String parametroBusqueda, boolean buscarPorFacturas, boolean buscarPorCliente, boolean buscarPorFecha) {

        try {

            
            conexion = Conexion.getConnection();
            String selectSQL;
            resultado = null;
            if (buscarPorFacturas == true) {     
                System.out.print("buscando por facturas");
                selectSQL = "SELECT * FROM facturas WHERE FAC_ID LIKE ? ORDER BY FAC_FECHA ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            } 
            else if(buscarPorCliente== true){
                System.out.print("buscando por cliente");
                selectSQL = "SELECT * FROM facturas WHERE CLI_IDENTIFICADOR LIKE ? ORDER BY FAC_FECHA ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            else if(buscarPorFecha== true){

                System.out.print("buscando por fecha -->"+parametroBusqueda);
                selectSQL = "SELECT * FROM facturas WHERE FAC_FECHA LIKE ? ORDER BY FAC_FECHA ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            resultado = ps.executeQuery();

            while (resultado.next()) {
                int fact = resultado.getInt("FAC_ID");
                String cliente = resultado.getString("CLI_IDENTIFICADOR");
                String fecha = resultado.getString("FAC_FECHA");
                String vendedor = resultado.getString("CUE_CUENTA");
                String total = resultado.getString("FAC_TOTAL");
                

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {fact,cliente, fecha, vendedor,total};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {

            CloseConnection.CloseConnection(conexion, sentencia, resultado, ps);

        }


    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    
    //esta es la parte de mostar detalle de facturas por la tabla venta
    
    //metodo para buscar un producto
    public void buscarFacturas ( String number){
        
        String[] titulosColumnas = {"IDFactura", "Articulo", "Cantidad", "Valor"};
        if( (number.trim().length()==0)){
            JOptionPane.showMessageDialog(null,"Error, Seleccione la Facturas");
        }
        else{
            
            modelo = new DefaultTableModel(info,titulosColumnas){
                public boolean isCellEditable(int row, int column)
                {
                return false;
                }
                
            };
         
         
         
        //le asigna el modelo al jtable
       SalesView.listadecompras.setModel(modelo);
       
        int[] anchos = {80, 200,50,145};
        for(int i = 0; i < listadecompras.getColumnCount(); i++) {
        listadecompras.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
       //ejecuta una consulta a la BD   
        buscarFacturasDetall(number);         
        }
        
    }//cierra metodo buscarCliente
    
      public void buscarFacturasDetall(String number) {

        try {
            conexion = Conexion.getConnection();
            String selectSQL;
            resultado = null;
           
                selectSQL = "SELECT * FROM detalle WHERE FAC_ID LIKE ? ORDER BY FAC_ID ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, number);
            
            resultado = ps.executeQuery();

            while (resultado.next()) {
                String idFactura = resultado.getString("FAC_ID");
                String idArticulo = resultado.getString("ART_ID");
                String cantidad = resultado.getString("DET_CANTIDAD");
                String valor = resultado.getString("DET_VALOR");
               
                
                String name="";
                Statement comando = conexion.createStatement();
                 ResultSet registro = comando.executeQuery("select ART_ID,ART_NOMBRE from articulos where ART_ID=" +idArticulo);
            
                 if (registro.next() == true) {
                     name = registro.getString("ART_NOMBRE");
                    }
           
                Object[] info = {idFactura,name,cantidad,valor};
              
                
                modelo.addRow(info);

            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n " + e);
        } finally {
           // CerrarConexiones.CloseConnection(conexion, sentencia, resultado, ps);
        }


    }//cierra metodo buscarRegistro
      
          
}
