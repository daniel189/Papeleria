package MODELO;

import Vista.HomeAplicativo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *En esta clase se maneja el metodo Connection 
 * el cual nos permite comunicacion con nuestra base de datos
 */

public class Conexion {
    //CON SINGLETON
    public static Connection getConexion(){
        Connection conection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conection=DriverManager.getConnection("jdbc:mysql://localhost/papeleriafarfarela","root","");
           // conection=DriverManager.getConnection("jdbc:mysql://localhost/farfarela","root","SQLdosis622"); //Conexion 2IS 
            //con=DriverManager.getConnection("jdbc:mysql://localhost/papeleriafarfarela","root","++++++"); //Conexion Danny
        } catch (ClassNotFoundException ex) {
            System.out.println("1");
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null, "error de conexion "+ex);
        } catch (InstantiationException ex) {
            System.out.println("2");
        } catch (IllegalAccessException ex) {
            System.out.println("3");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return conection;
    }
}
