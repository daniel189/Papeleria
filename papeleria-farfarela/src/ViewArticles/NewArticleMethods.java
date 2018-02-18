/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewArticles;

import MODELO.Conexion;
import MODELO.QueryArticulo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import papeleriafarfarela.Articulo;

/**
 *
 * @author Lizeth
 */
public class NewArticleMethods {
     Articulo artIngreso=new Articulo();
     public int idarticulo;
     int fam_id;
     int pro_id;
     QueryArticulo artQuery=new QueryArticulo();
     String titulos[]={"Art Id","Fam Id","Pro Id","Nombre","Descripcion","Precio","Stoc"};
     DefaultTableModel modelo=new DefaultTableModel(null,titulos);
     public void mostrar(JTextField txt_descripcion, JTextField txt_nombre, JTextField txt_precio, JTextField txt_stock,
                         JTextField  txt_familia, JTextField txt_prov_id,JTextField  txtCodigo,  JTable tabla_articulos){
      artIngreso.setArticuloId(idarticulo);
        artIngreso.setArticuloDescripcion(txt_descripcion.getText());
        artIngreso.setArticuloNombre(txt_nombre.getText());
        artIngreso.setArticuloPrecio(Float.parseFloat(txt_precio.getText()));
        artIngreso.setArticuloStock(Double.parseDouble(txt_stock.getText()));

        if((artQuery.setArticulo(artIngreso, fam_id, pro_id)==true))
        {          
              String[] fila=new String[7];
             fila[0]=String.valueOf(artIngreso.getArticuloId());
             fila[1]=String.valueOf(txt_familia.getText());
             fila[2]=String.valueOf(txt_prov_id.getText());
              fila[3]=String.valueOf(artIngreso.getArticuloNombre());
              fila[4]=String.valueOf(artIngreso.getArticuloDescripcion());
              fila[5]=String.valueOf(artIngreso.getArticuloPrecio());
              fila[6]=String.valueOf(artIngreso.getArticuloStock());
              modelo.addRow(fila);
              tabla_articulos.setModel(modelo);
   
           idarticulo++;
           txtCodigo.setText(String.valueOf(idarticulo));
           txt_nombre.setText("");
           txt_descripcion.setText("");
           txt_precio.setText("");
           txt_stock.setText("");
        }
     }
      public final void claveMax(JTextField txtCodigo) {  
        Conexion conectar = new Conexion();
        try {
            Connection conexion = conectar.getConexion();
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select max(art_id)+1 FROM ARTICULOS");
            if (registro.next() == true) {
                if (registro.getString("max(art_id)+1") == null) {
                    txtCodigo.setText("1");
                    idarticulo=Integer.parseInt(txtCodigo.getText());
                } else {
                    txtCodigo.setText(registro.getString("max(art_id)+1"));
                       idarticulo=Integer.parseInt(txtCodigo.getText());
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
