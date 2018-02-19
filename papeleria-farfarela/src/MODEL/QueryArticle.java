/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
import VistasVentas.NewSale;
import PapeleriaFarfarela.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Crispin
 */
public class QueryArticle {
    PreparedStatement sentence;
    PreparedStatement search;
    ResultSet result;
    Connection connection;
    //Connection conexion;
    
     
    //modelo para la tabla
    DefaultTableModel model;
    //vector con los titulos de cada columna
    String[] titulosColumnas = {"CÓDIGO", "NOMBRE", "DESCRIPCIÓN", "PRECIO"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String[][] information = {};
    
    /** @pdOid 368c9303-adc2-4bfa-a4fd-3acfae6fa040 */
   public double articuloId;
   /** @pdOid fb83f19b-3315-4022-92f7-8fe2aac9ba1a */
   public java.lang.String articuloNombre;
   /** @pdOid 24285171-a826-4535-933c-447008699d9c */
   public java.lang.String articuloDescripcion;
   /** @pdOid 5eb2a7d9-ee26-47b4-9982-113c37b6812e */
   public float articuloPrecio;
   /** numero de stock disponible
    * 
    * @pdOid 8535f7c3-1e9f-4a1b-8b10-27a128dcccbb */
   public double articuloStock;
   JComboBox cboxprovedor=new JComboBox();
   JComboBox cboxfamilia=new JComboBox();  
   public JComboBox cargarprovedores()
   {
       Connection conection= Conexion.getConnection();
          try {
              Statement searchname= conection.createStatement();
              String consult="select pro_identificador from proveedor";
              result=searchname.executeQuery(consult);
              while(result.next()){
               
              cboxprovedor.addItem(result.getString(1));
              }
             result.close();
             conection.close();
          } catch (SQLException ex) {
              Logger.getLogger(QueryArticle.class.getName()).log(Level.SEVERE, null, ex);
          }
          return cboxprovedor;
   
   }   
   public JComboBox cargarfamilias()
   {
       Connection conection= Conexion.getConnection();
          try {
              Statement searchname= conection.createStatement();
              String consult="select fam_nombre from familiasarticulos";
              result=searchname.executeQuery(consult);
              while(result.next()){
               
              cboxfamilia.addItem(result.getString(1));
              }
              result.close();
              conection.close();
          } catch (SQLException ex) {
              Logger.getLogger(QueryArticle.class.getName()).log(Level.SEVERE, null, ex);
          }
          return cboxfamilia;
   
   }  
   public int asignarprovedor(String nombre)
   {
       int idasignar=0;
      Connection conection= Conexion.getConnection();
    
          try { 
              String querysql = "SELECT * FROM PROVEEDOR WHERE PRO_IDENTIFICADOR LIKE ? ORDER BY PRO_IDENTIFICADOR ASC";
              search = conection.prepareStatement(querysql);
              search.setString(1, "%" + nombre + "%");
              result=search.executeQuery();
              while(result.next())
              {
                idasignar = result.getInt("PRO_ID");
              }
              result.close();
              conection.close();
              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
          } 
       return idasignar;
   } 
 public int asignarfamilia(String nombre)
   {
       int assignid=0;
      Connection cone= Conexion.getConnection();
    
          try { 
              String querysql = "SELECT * FROM FAMILIASARTICULOS WHERE FAM_NOMBRE LIKE ?";
              search = cone.prepareStatement(querysql);
              search.setString(1, "%" + nombre + "%");
              result=search.executeQuery();
              while(result.next())
              {
                assignid = result.getInt("FAM_ID");
              }
              result.close();
              cone.close();
              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
          } 
       return assignid;
   }     
public boolean setArticulo(Article art,int id_familia,int id_provedor){
    boolean identifier=true;  
    Connection cone= Conexion.getConnection();
        PreparedStatement sentence;
          try {
              sentence = cone.prepareStatement("INSERT INTO articulos(ART_ID,PRO_ID,FAM_ID,ART_NOMBRE,ART_DESCRIPCION,ART_PRECIO,ART_STOCK) VALUES (?,?,?,?,?,?,?)");
               sentence.setInt(1, art.getArticleId());
              sentence.setInt(2, id_provedor);
              sentence.setInt(3, id_familia);
              sentence.setString(4, art.getArticleName());
              sentence.setString(5, art.getArticleDescription());
              sentence.setFloat(6, art.getArticlePrice());
               sentence.setDouble(7,art.getArticleStock());

                    int res=sentence.executeUpdate();
                    if(res>0){
                        JOptionPane.showMessageDialog(null,"OK, PRODUCTOS GUARDADOS");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
                    }
          } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"SELECCIONE FAMILIA Y PROVEDOR ");
          identifier=false;
          }
      return identifier;
    }
    public   DefaultTableModel UpdateArticulo(String texto,int item){
        String titulos[]={"Art Id","Fam Id","Pro Id","Nombre","Descripcion","Precio","Stoc"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);// si no usan el null y no le ponen titulos noo les  imprime 
        String Filtro=""+texto+"_%";
        String[] fila=new String[7];
        connection = Conexion.getConnection();
        String      instruccionsql=    "  SELECT * FROM articulos WHERE art_nombre like " +'"' + Filtro  +'"';
        try {
      if(item==0)// si se selecciona x id cambia la sentence querysql
      {
          float id=Integer.parseInt(texto);
         instruccionsql=  ("SELECT * FROM articulos WHERE art_id = '"+ id +"'");
      }
    
         sentence=connection.prepareStatement( instruccionsql);
            result=sentence.executeQuery( instruccionsql);
           
            while(result.next())
            {
                fila[0]=result.getString(1);
                fila[1]=result.getString(2);
                fila[2]=result.getString(3);
                fila[3]=result.getString(4);
                fila[4]=result.getString(5);
                fila[5]=result.getString(6);
                fila[6]=result.getString(7);
              modelo.addRow(fila);
                      
            }        
            
        result.close();
     
        connection.close();
          return modelo;  
        }
        catch(SQLException ex){
            Logger.getLogger(QueryUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public void modificarArticulo(int art_id,int pro_id,int fam_id ,String art_nombre,
                                    String art_descripcion,float art_precio, 
                                    int stock) {

    
        try {
            connection = Conexion.getConnection();
         
            Statement comand = connection.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
         
            int cantidad = comand.executeUpdate("update ARTICULOS set PRO_ID ='" + pro_id + "', "+
                                                                    " FAM_ID ='" + fam_id +                  
                                                                    "',ART_NOMBRE ='" + art_nombre + 
                                                                    "',ART_DESCRIPCION ='" + art_descripcion + 
                                                                    "',ART_PRECIO ='" + art_precio + 
                                                                    "',ART_STOCK  ='" + stock + 
                                                                    "' where ART_ID=" + art_id);
          
                    if (cantidad == 1) {
                        JOptionPane.showMessageDialog(null," Modifico con Exito");
                    } else {
                        JOptionPane.showMessageDialog(null,"No existe Proveedor con codigo : "+art_id);
                    }
          
        
            connection.close();
            //System.out.println("Connection cerrada");
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null,"SELECCIONE FAMILIA Y PROVEDOR ");
        }
    }//cierr
    public void eliminarProveedor(int code) {

        try {            
            connection = Conexion.getConnection();
            Statement comand = connection.createStatement();
            int cantidad = comand.executeUpdate("delete from ARTICULOS where ART_ID=" + code);
            if (cantidad == 1) {
   
                JOptionPane.showMessageDialog(null,"Eliminado");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Articulo con el Codigo Ingresado "+code);
            }
            connection.close();
            //System.out.println("Connection cerrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ex);
        }

    }//cierra metodo eliminar
    
    
    
    
    
    
     public void CargarArticulos(){
         
         model = new DefaultTableModel(information, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el salesTebleModel al jtable
        //modelo = UpdateArticulo("1", 0);
        NewSale.SeleccionarArticulos.setModel(model);
        
        //ejecuta una consult a la BD
        ejecutarConsultaTodaTabla();
         
     }
   
     public void ejecutarConsultaTodaTabla() {

            Connection conexion = null;
            Statement sentencia = null;
            ResultSet resultado = null;
            PreparedStatement ps = null;

         
         
        try {
            conexion = Conexion.getConnection();

            sentencia = conexion.createStatement();
            String querysql = "SELECT * FROM articulos ORDER BY art_nombre ASC";
            resultado = sentencia.executeQuery(querysql);
            System.out.println(querysql);

            //mientras haya datos en la BD ejecutar eso...
            while (resultado.next()) {


                String codigo = resultado.getString("art_id");
                String nombre = resultado.getString("art_nombre");
                String descripcion = resultado.getString("art_descripcion");
                String precio = resultado.getString("art_precio");



                //crea un vector donde los está la information (se crea una fila)
                Object[] info = {codigo, nombre, descripcion, precio};

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
        } finally {
            
        }

    }//cierra metodo ejecutarConsulta
    
     
     
     public void buscarArticulosparaVentas(String parametroBusqueda) {

        

            model = new DefaultTableModel(information, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el salesTebleModel al jtable
            //modelo = UpdateArticulo(parametroBusqueda, 1,1);
            NewSale.SeleccionarArticulos.setModel(model);
            //ejecuta una consult a la BD
            buscarRegistroArticulos(parametroBusqueda);

    }
    
    
    public void buscarRegistroArticulos(String parametroBusqueda) {

            Connection conexion = null;
            Statement sentencia = null;
            ResultSet resultado = null;
            PreparedStatement ps = null;

        
        try {

            conexion = Conexion.getConnection();
            String selectSQL;
            resultado = null;
                            
                selectSQL = "SELECT art_id,art_nombre,art_descripcion, art_precio FROM articulos WHERE art_nombre LIKE ? ORDER BY art_id ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
    
            resultado = ps.executeQuery();

            while (resultado.next()) {
                String codigo = resultado.getString("art_id");
                String nombre = resultado.getString("art_nombre");
                String descripcion = resultado.getString("art_descripcion");
                String precio = resultado.getString("art_precio");

                

                //crea un vector donde los está la information (se crea una fila)
                Object[] info = {codigo,nombre,descripcion,precio};
                //al salesTebleModel de la tabla le agrega una fila
                //con los datos que están en info
                model.addRow(info);

            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } 
    }
}
