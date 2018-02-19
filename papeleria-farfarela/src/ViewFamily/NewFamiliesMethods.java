/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewFamily;

import MODELO.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lizeth
 */
public class NewFamiliesMethods {
    public void cargartxt(JTable tab_familias, JTextField txt_nombre, JTextField txt_descripcion){
    int familiaId;
    int productoId;
    int ivaId;
    int filasel=tab_familias.getSelectedRow();
    if(filasel==-1){
                JOptionPane.showMessageDialog(null,"Seleccione primero la columna" );
    }
    else
    {
       String auxiliar=tab_familias.getValueAt(filasel, 0).toString();
       familiaId=Integer.parseInt(auxiliar);
       auxiliar=tab_familias.getValueAt(filasel, 1).toString();
       ivaId=Integer.parseInt(auxiliar);
       txt_nombre.setText(tab_familias.getValueAt(filasel, 2).toString());
       txt_descripcion.setText(tab_familias.getValueAt(filasel, 3).toString());

}
}
    public int seleccionaritem(JComboBox<String> cbox)
{
    int item=cbox.getSelectedIndex();
    return item;
}
    public final void claveMax(JTextField txtCodigo, int idfamilia) {
      Conexion conectar = new Conexion();
        try {
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/farfarela", "ECUATORIANO16", "root");
            Connection conexion = Conexion.getConnection();
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select max(FAM_id)+1 from familiasarticulos");
            if (registro.next() == true) {
                if (registro.getString("max(FAM_id)+1") == null) {
                    txtCodigo.setText("1");
                    idfamilia=Integer.parseInt(txtCodigo.getText());
                } else {
                    txtCodigo.setText(registro.getString("max(FAM_id)+1"));
                       idfamilia=Integer.parseInt(txtCodigo.getText());
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
