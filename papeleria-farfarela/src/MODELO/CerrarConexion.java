
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

public class CerrarConexion {
    public static void CerrarConexion(Connection conexion, Statement sentencia, ResultSet resultado, PreparedStatement preparedStatement ){

        
        if(preparedStatement != null){
            try{
               preparedStatement.close();
            }
            catch(SQLException exception1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el PreparedStatement\n Error: "+exception1);
                
            }
            resultado = null;
        }
        //- - - - - - - - - - - - - - - - - - - - - -
        if(resultado != null){
            try{
                resultado.close();
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el ResultSet (resultado)\n Error: "+exception);
            }
            resultado = null;
        }
        
        //- - - - - - - - - - - - - - - - - - - - - -
        
        if(sentencia != null){
            try{
                sentencia.close();
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el Statement (sentencia)\n Error "+exception);
            }
            sentencia = null;
        }
        //- - - - - - - - - - - - - - - - - - - - - -
        if(conexion != null){
            try{
                conexion.close();
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar Connection (conexion)\n Error "+exception);
            }
            conexion = null;
        }
        
    }//cierra metodo
    
    
    
}//cierra class
