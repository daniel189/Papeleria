
package MODELO;

import ViewClients.NewCustomer;
import ViewClients.CustomerManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Crispin
 */
public class QueryIva {
      PreparedStatement sentencia;
      PreparedStatement busqueda;
    ResultSet resul;
           JComboBox cboxivas=new JComboBox();
    Connection conexion;
    public boolean setIVas(ArrayList<String> lista){



        boolean comprovador=true;

        Connection cone = Conexion.getConnection();
        try {
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            PreparedStatement sentencia = cone.prepareStatement("INSERT INTO IVA VALUES (?,?,?)");
            sentencia.setString(1, lista.get(0));
            sentencia.setString(2, lista.get(1));
            sentencia.setString(3, lista.get(2));
          
            //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
            int res=sentencia.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS GUARDADOS");
              
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
                comprovador=false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MODELO.QueryUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS O DUPLICADOS");
        }
        return comprovador;
    }
       public JComboBox cargarIvas()
   {
       Connection cone= Conexion.getConnection();
          try {
              Statement buscarnombre= cone.createStatement();
              String consulta="select iva_id from iva";
              resul=buscarnombre.executeQuery(consulta);
              while(resul.next()){
               
              cboxivas.addItem(resul.getString(1));
              }
             resul.close();
             cone.close();
          } catch (SQLException ex) {
              Logger.getLogger(QueryArticulo.class.getName()).log(Level.SEVERE, null, ex);
          }
          return cboxivas;
   
   }  
     public void updateIvas(ArrayList<String> lista){
        Connection cone = Conexion.getConnection();
        try{
            PreparedStatement sentencia = cone.prepareStatement("UPDATE IVA SET iva_valor = '"+ lista.get(1) +"',iva_fechaInicio= '"+
                    lista.get(2)+"' WHERE iva_id = '"+ lista.get(0) +"'");
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
      public   DefaultTableModel leerIvas(){
          
              Connection cone = Conexion.getConnection();
        String titulos[]={"Iva Id","  Valor %","Fecha  Inicio"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);// si no usan el null y no le ponen titulos noo les  imprime 
        String[] fila=new String[7];
        cone = Conexion.getConnection();
        String      instruccionsql=    "  SELECT * FROM iva";
        try {
      
    
         sentencia=cone.prepareStatement( instruccionsql);
            resul=sentencia.executeQuery( instruccionsql);
           
            while(resul.next())
            {
                fila[0]=resul.getString(1);
                fila[1]=resul.getString(2);
                fila[2]=resul.getString(3);
         
              
              modelo.addRow(fila);
                      
            }        
            
        resul.close();
     
        cone.close();
          return modelo;  
        }
        catch(SQLException ex){
            Logger.getLogger(QueryUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      }
}