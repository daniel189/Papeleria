
package MODEL;

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

public class CloseConnection {
    public static void CloseConnection(Connection connection, Statement sentence, ResultSet result, PreparedStatement preparedStatement ){

        
        if(preparedStatement != null){
            try{
               preparedStatement.close();
            }
            catch(SQLException exception1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el PreparedStatement\n Error: "+exception1);
                
            }
            result = null;
        }
        //- - - - - - - - - - - - - - - - - - - - - -
        if(result != null){
            try{
                result.close();
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el ResultSet (resultado)\n Error: "+exception);
            }
            result = null;
        }
        
        //- - - - - - - - - - - - - - - - - - - - - -
        
        if(sentence != null){
            try{
                sentence.close();
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el Statement (sentencia)\n Error "+exception);
            }
            sentence = null;
        }
        //- - - - - - - - - - - - - - - - - - - - - -
        if(connection != null){
            try{
                connection.close();
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar Connection (conexion)\n Error "+exception);
            }
            connection = null;
        }
        
    }//cierra metodo
    
    
    
}//cierra class
