/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClients;

import MODELO.Conexion;
import VistasUsuarios.UsuariosEdit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lizeth
 */
public class CustomerManagemetMethods {
    public void llenarClientes(String condicion, int aux, JTable tbClientes){
        Connection cone = Conexion.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Identificador");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Fecha Nac.");
        tbClientes.setModel(modelo);
        String sql;
        if(aux == 1){ //Idetificador
            sql = "SELECT * FROM cliente WHERE cli_identificador LIKE '%"+condicion+"%'";
        }else if(aux == 2){ //nombres
            sql = "SELECT * FROM cliente WHERE cli_nombres LIKE '%"+condicion+"%'";
        }else{ //apllidos
            sql = "SELECT * FROM cliente WHERE cli_apelidos LIKE '%"+condicion+"%'";
        }
        String datos[] = new String[6];
        try {
            Statement st = cone.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            tbClientes.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosEdit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al traer los clientes", "Error DB", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void limparDatos(JTextField txtIdentificador,JTextField txtApellidos, 
             JTextField txtNombres, JTextField txtDireccion, JTextField txtTelefono){
        txtIdentificador.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }
     
     public static boolean validateID(String cedula){
        int suma=0;
        if(cedula.length()==9){
          System.out.println("Ingrese su cedula de 10 digitos");
          return false;
        }else{
          int arreglo1[]=new int [cedula.length()/2];
          int arreglo2[]=new int [(cedula.length()/2)];
          int c=0;
          int d=1;
          for (int i = 0; i < cedula.length()/2; i++) {
            arreglo1[i]=Integer.parseInt(String.valueOf(cedula.charAt(c)));
            c=c+2;
            if (i < (cedula.length()/2)-1) {
              arreglo2[i]=Integer.parseInt(String.valueOf(cedula.charAt(d)));
              d=d+2;
            }
          }
        
          for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i]=arreglo1[i]*2;
            if (arreglo1[i] >9){
              arreglo1[i]=arreglo1[i]-9;
            }
            suma=suma+arreglo1[i]+arreglo2[i];
          } 
          int aux=suma/10;
          int dec=(aux+1)*10;
          if ((dec - suma) == Integer.parseInt(String.valueOf(cedula.charAt(cedula.length()-1))))
            return true;
          else
            if(suma%10==0 && cedula.charAt(cedula.length()-1)=='0'){
              return true;
            }else{
              return false;
            }
        }
    }
}
