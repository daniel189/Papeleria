/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

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

public class queryFamilias {
    
PreparedStatement sentencia;
      PreparedStatement busqueda;
    ResultSet resul;
    Connection cone;
    Conexion conexion;
       JComboBox cboxfamilia=new JComboBox();
           public void modificarFamilia(int fami_id,int iva_ide,String fam_nom, String fam_descripcion) {

    
        try {
            cone = Conexion.getConexion();
         
            Statement comando = cone.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
               int cantidad = comando.executeUpdate("update FAMILIASARTICULOS set IVA_ID ='" + iva_ide + "', "+
                                                                    " FAM_NOMBRE ='" + fam_nom +                  
                                                                    "',FAM_DETALLE ='" + fam_descripcion + 
                                                                    
                                                                    "' where FAM_ID=" + fami_id);
         
          
                    if (cantidad == 1) {
                        JOptionPane.showMessageDialog(null," Modifico con Exito");
                    } else {
                        JOptionPane.showMessageDialog(null,"No existe Proveedor con codigo : "+fami_id);
                    }
          
        
            cone.close();
            //System.out.println("Conexion cerrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Error -->"+ex);
        }
    }//cierr
    public JComboBox cargariva()
   {
       // este metodo permite cargar todos los id de los ivas cargados y ponerles en un cbox q sera retornado al frm new familia
       Connection cone= Conexion.getConexion();
          try {
              Statement buscarnombre= cone.createStatement();
              String consulta="select IVA_id from IVA";
              resul=buscarnombre.executeQuery(consulta);
              while(resul.next()){
               
              cboxfamilia.addItem(resul.getString(1));
              }
             resul.close();
             cone.close();
          } catch (SQLException ex) {
              Logger.getLogger(queryArticulos.class.getName()).log(Level.SEVERE, null, ex);
          }
          return cboxfamilia;
   
   }   
     public int asignariva(int iva)
   {
       int idasignar=0;
      Connection cone= Conexion.getConexion();
    
          try { 
              String sql = "SELECT * FROM IVA WHERE IVA_ID =? ";
              busqueda = cone.prepareStatement(sql);
              busqueda.setInt(1, iva);
              resul=busqueda.executeQuery();
              while(resul.next())
              {
                idasignar = resul.getInt("IVA_VALOR");
              }
              resul.close();
              cone.close();
              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
          } 
       return idasignar;
   } 
     public   DefaultTableModel UpdateFamilia(String texto,int item){
        String titulos[]={"FAM_ID","IVA","NOMBRE","DETALLE"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);// si no usan el null y no le ponen titulos noo les  imprime 
        String Filtro=""+texto+"_%";
        String[] fila=new String[4];
        cone = Conexion.getConexion();
        
        String      instruccionsql=    "  SELECT * FROM FAMILIASARTICULOS WHERE FAM_nombre like " +'"' + Filtro  +'"';
            if(item==0)// si se selecciona x id cambia la sentencia sql
      {
          float id=Integer.parseInt(texto);
         instruccionsql=  ("SELECT * FROM FAMILIASARTICULOS WHERE FAM_ID = '"+ id +"'");
      }
        try {
   
    
         sentencia=cone.prepareStatement( instruccionsql);
            resul=sentencia.executeQuery( instruccionsql);
           
            while(resul.next())
            {
                fila[0]=resul.getString(1);
                fila[1]=resul.getString(2);
                fila[2]=resul.getString(3);
                fila[3]=resul.getString(4);
              modelo.addRow(fila);
                      
            }        
            
        resul.close();
     
        cone.close();
          return modelo;  
        }
        catch(SQLException ex){
            Logger.getLogger(queryUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean setFamilia(int id,int iva,String nombre,String detalle){
      Connection cone= Conexion.getConexion();
       boolean comprovador=true; 
      float pro_id_encontrado=0;
        PreparedStatement sentencia;
          try {
              sentencia = cone.prepareStatement("INSERT INTO FAMILIASARTICULOS(FAM_ID,IVA_ID,FAM_NOMBRE,FAM_DETALLE) VALUES (?,?,?,?)");
               sentencia.setInt(1, id);
              sentencia.setInt(2,iva );
              sentencia.setString(3, nombre);
              sentencia.setString(4, detalle);

                    int res=sentencia.executeUpdate();
                    if(res>0){
                        JOptionPane.showMessageDialog(null,"OK, Familia guardada");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
                    }
          } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"SELECCIONE IVA ");
          comprovador=false;
          }
      return comprovador;
    }
}
