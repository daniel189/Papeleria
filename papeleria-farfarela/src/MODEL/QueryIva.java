
package MODEL;

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
      PreparedStatement sentence;
      PreparedStatement search;
    ResultSet result;
           JComboBox cboxivas=new JComboBox();
    Connection conexion;
    public boolean setIVas(ArrayList<String> lista){



        boolean cheker=true;

        Connection connectionSql = Conexion.getConnection();
        try {
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            PreparedStatement sentence = connectionSql.prepareStatement("INSERT INTO IVA VALUES (?,?,?)");
            sentence.setString(1, lista.get(0));
            sentence.setString(2, lista.get(1));
            sentence.setString(3, lista.get(2));
          
            //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
            int res=sentence.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"OK, DATOS GUARDADOS");
              
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS");
                cheker=false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MODEL.QueryUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR, DATOS FALLIDOS O DUPLICADOS");
        }
        return cheker;
    }
       public JComboBox cargarIvas()
   {
       Connection connectionSql= Conexion.getConnection();
          try {
              Statement searchName= connectionSql.createStatement();
              String query="select iva_id from iva";
              result=searchName.executeQuery(query);
              while(result.next()){
               
              cboxivas.addItem(result.getString(1));
              }
             result.close();
             connectionSql.close();
          } catch (SQLException ex) {
              Logger.getLogger(QueryArticle.class.getName()).log(Level.SEVERE, null, ex);
          }
          return cboxivas;
   
   }  
     public void updateIvas(ArrayList<String> lista){
        Connection connectionSql = Conexion.getConnection();
        try{
            PreparedStatement sentence = connectionSql.prepareStatement("UPDATE IVA SET iva_valor = '"+ lista.get(1) +"',iva_fechaInicio= '"+
                    lista.get(2)+"' WHERE iva_id = '"+ lista.get(0) +"'");
            //si guarda bien o no
            int res=sentence.executeUpdate();
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
          
              Connection connectionSql = Conexion.getConnection();
        String[] titles={"Iva Id","  Valor %","Fecha  Inicio"};
        DefaultTableModel model=new DefaultTableModel(null,titles);// si no usan el null y no le ponen titles noo les  imprime 
        String[] row=new String[7];
        connectionSql = Conexion.getConnection();
        String instructionSql=    "  SELECT * FROM iva";
        try {
    
         sentence=connectionSql.prepareStatement(instructionSql);
            result=sentence.executeQuery(instructionSql);
           
            while(result.next())
            {
                row[0]=result.getString(1);
                row[1]=result.getString(2);
                row[2]=result.getString(3);
         
              
              model.addRow(row);
                      
            }        
            
        result.close();
     
        connectionSql.close();
          return model;  
        }
        catch(SQLException ex){
            Logger.getLogger(QueryUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      }
}