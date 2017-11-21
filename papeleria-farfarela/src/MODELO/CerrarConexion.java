
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * En esta clase se expone sólo un metodo el cual
 * sirve para cerrar la conexion (connection)
 * a la base de datos, cerrar los resultados(resulset),
 * cerrar las sentencias (preparedStatement y Statement)
 * 
 * @author Sergio
 */
<<<<<<< HEAD:papeleria-farfarela/src/MODELO/CerrarConexion.java
<<<<<<< HEAD:papeleria-farfarela/src/MODELO/CerrarConexion.java
public class CerrarConexion {
    public static void metodoCerrarConexiones(Connection conexion, Statement sentencia, ResultSet resultado, PreparedStatement ps ){
=======
public class CerrarConexiones {
    public static void CerrarConexion(Connection conexion, Statement sentencia, ResultSet resultado, PreparedStatement ps ){
>>>>>>> 39a572a1c2919aaa507877cc726a025df9074228:papeleria-farfarela/src/MODELO/CerrarConexiones.java
=======
public class CerrarConexiones {
    public static void CerrarConexion(Connection conexion, Statement sentencia, ResultSet resultado, PreparedStatement ps ){
>>>>>>> 39a572a1c2919aaa507877cc726a025df9074228:papeleria-farfarela/src/MODELO/CerrarConexiones.java
        
        if(ps != null){
            try{
                ps.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el PreparedStatement(ps)\n Error: "+e1);
                
            }
            resultado = null;
        }
        //- - - - - - - - - - - - - - - - - - - - - -
        if(resultado != null){
            try{
                resultado.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el ResultSet (resultado)\n Error: "+e1);
            }
            resultado = null;
        }
        
        //- - - - - - - - - - - - - - - - - - - - - -
        
        if(sentencia != null){
            try{
                sentencia.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el Statement (sentencia)\n Error "+e1);
            }
            sentencia = null;
        }
        //- - - - - - - - - - - - - - - - - - - - - -
        if(conexion != null){
            try{
                conexion.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar Connection (conexion)\n Error "+e1);
            }
            conexion = null;
        }
        
    }//cierra metodo
    
    
    
}//cierra class
