/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewIva;

import MODELO.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lizeth
 */
public class NewIvaMethods {
  public final void claveMax(JTextField txtCodigo,int ivaId) {
      Conexion conectar = new Conexion();
        try {
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/farfarela", "ECUATORIANO16", "root");
            Connection conexion = Conexion.getConnection();
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select max(iva_id)+1 FROM IVA");
            if (registro.next() == true) {
                if (registro.getString("max(iva_id)+1") == null) {
                    txtCodigo.setText("1");
                    ivaId=Integer.parseInt(txtCodigo.getText());
                } else {
                    txtCodigo.setText(registro.getString("max(iva_id)+1"));
                       ivaId=Integer.parseInt(txtCodigo.getText());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }   
}
