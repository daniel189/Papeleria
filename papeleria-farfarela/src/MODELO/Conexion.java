package MODELO;

import Vista.home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Crispin
 */

public class Conexion {
    //CON SINGLETON
    public static Connection getConexion(){
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost/papeleriafarfarela","root","root");    //AQUI PONGO LA CUENTA Y ESO DE LA BASE
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
        
        
        
        return con;
    }
}