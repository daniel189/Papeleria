/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

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

public class QueryFamiliy {
    
PreparedStatement sentence;
      PreparedStatement search;
    ResultSet result;
    Connection connectionSql;
    Connection conexion;
       JComboBox cboxfamilia=new JComboBox();
           public void modificarFamilia(int fami_id,int iva_ide,String fam_nom, String fam_descripcion) {

    
        try {
            connectionSql = Conexion.getConnection();
         
            Statement comand = connectionSql.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
               int amount = comand.executeUpdate("update FAMILIASARTICULOS set IVA_ID ='" + iva_ide + "', "+
                                                                    " FAM_NOMBRE ='" + fam_nom +                  
                                                                    "',FAM_DETALLE ='" + fam_descripcion + 
                                                                    
                                                                    "' where FAM_ID=" + fami_id);
         
          
                    if (amount == 1) {
                        JOptionPane.showMessageDialog(null," Modifico con Exito");
                    } else {
                        JOptionPane.showMessageDialog(null,"No existe Proveedor con codigo : "+fami_id);
                    }
          
        
            connectionSql.close();
            //System.out.println("Connection cerrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Error -->"+ex);
        }
    }//cierr
    public JComboBox cargariva()
   {
       // este metodo permite cargar todos los id de los ivas cargados y ponerles en un cbox q sera retornado al frm new familia
       Connection connectionSql= Conexion.getConnection();
          try {
              Statement buscarnombre= connectionSql.createStatement();
              String query="select IVA_id from IVA";
              result=buscarnombre.executeQuery(query);
              while(result.next()){
               
              cboxfamilia.addItem(result.getString(1));
              }
             result.close();
             connectionSql.close();
          } catch (SQLException ex) {
              Logger.getLogger(QueryArticle.class.getName()).log(Level.SEVERE, null, ex);
          }
          return cboxfamilia;
   
   }   
     public int asignariva(int iva)
   {
       int idasignar=0;
      Connection connectionSql= Conexion.getConnection();
    
          try { 
              String sql = "SELECT * FROM IVA WHERE IVA_ID =? ";
              search = connectionSql.prepareStatement(sql);
              search.setInt(1, iva);
              result=search.executeQuery();
              while(result.next())
              {
                idasignar = result.getInt("IVA_VALOR");
              }
              result.close();
              connectionSql.close();
              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
          } 
       return idasignar;
   } 
     public   DefaultTableModel UpdateFamilia(String texto,int item){
        String[] titles={"FAM_ID","IVA","NOMBRE","DETALLE"};
        DefaultTableModel modelo=new DefaultTableModel(null,titles);// si no usan el null y no le ponen titles noo les  imprime 
        String Filter=""+texto+"_%";
        String[] fila=new String[4];
        connectionSql = Conexion.getConnection();
        
        String      instruccionsql=    "  SELECT * FROM FAMILIASARTICULOS WHERE FAM_nombre like " +'"' + Filter  +'"';
            if(item==0)// si se selecciona x id cambia la sentence sql
      {
          float id=Integer.parseInt(texto);
         instruccionsql=  ("SELECT * FROM FAMILIASARTICULOS WHERE FAM_ID = '"+ id +"'");
      }
        try {
         sentence=connectionSql.prepareStatement( instruccionsql);
            result=sentence.executeQuery( instruccionsql);
           
            while(result.next())
            {
                fila[0]=result.getString(1);
                fila[1]=result.getString(2);
                fila[2]=result.getString(3);
                fila[3]=result.getString(4);
              modelo.addRow(fila);
                      
            }        
            
        result.close();
     
        connectionSql.close();
          return modelo;  
        }
        catch(SQLException ex){
            Logger.getLogger(QueryUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean setFamilia(int id,int iva,String nombre,String detalle){
      Connection cone= Conexion.getConnection();
       boolean checker=true; 
        PreparedStatement sentence;
          try {
              sentence = cone.prepareStatement("INSERT INTO FAMILIASARTICULOS(FAM_ID,IVA_ID,FAM_NOMBRE,FAM_DETALLE) VALUES (?,?,?,?)");
               sentence.setInt(1, id);
              sentence.setInt(2,iva );
              sentence.setString(3, nombre);
              sentence.setString(4, detalle);

                    int res=sentence.executeUpdate();
                    if(res>0){
                        JOptionPane.showMessageDialog(null,"OK, Familia guardada");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
                    }
          } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"SELECCIONE IVA ");
          checker=false;
          }
      return checker;
    }
}
