/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasVentas;

import MODELO.Conexion;
import MODELO.QueryArticulo;
import static VistasVentas.NewSale.jDialogArticles;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author yurym
 */
public class NewSaleWindowHelper {
    
    public void showArticles() {
        // llamada de datos
        QueryArticulo load = new QueryArticulo();
        load.CargarArticulos();
        //Centramos nuestro jDialog
        jDialogArticles.setLocation(200, 100);
        //La hacemos modal
        jDialogArticles.setModal(true);
        //Establecemos dimensiones.
        jDialogArticles.setMinimumSize(new Dimension(747, 385));

        //Establecemos un título para el jDialog
        jDialogArticles.setTitle("Lista de Artículos.");
        //La hacemos visible.
        jDialogArticles.setVisible(true);
    }
    
     public double DosDecimales(double valor) {
        valor *= 100;
        valor = Math.round(valor);
        valor /= 100;
        return valor;
    }

    public String EliminaCaracteres(String s_cadena, String s_caracteres) {
        String nueva_cadena = "";
        nueva_cadena = s_cadena.replace(s_caracteres, "");
        System.out.println(nueva_cadena);
        return nueva_cadena;
    }
    
    public double calculateDiscountValue(String discountString, double porcentage, double discountValue, double subTotal) {
        if (discountString.contains("%")) {
            discountString = EliminaCaracteres(discountString, "%");
            porcentage = Double.parseDouble(discountString);
            System.out.println("Desc: " + porcentage);
            discountValue = (subTotal * porcentage) / 100;
            System.out.println("Descuento: " + discountValue);
        } else {
            discountValue = Double.parseDouble(discountString);
            //    System.out.println("Descuento: " + discountValue);
        }
        return discountValue;
    }
    
    public double discountValidator(double discountValue, double subTotal, double grandTotal,double subIVA){
        if (discountValue > subTotal) {
            JOptionPane.showMessageDialog(null, "El descuento es mayor que el costo");
        } else {
            subTotal = subTotal - discountValue;
            grandTotal = subTotal + subIVA;
            grandTotal = DosDecimales(grandTotal);
        }
        return grandTotal;
    }
    
    public int singleIntergerValueQuery(String idSelection, String tableSql, String conditionSql, int idAsignation){
        PreparedStatement search;
        ResultSet result;
        Connection dataBaseConection;
        dataBaseConection = Connection.getConexion();
        try{ 
            String sql = "SELECT "+idSelection+" FROM "+tableSql+" WHERE "+conditionSql+" = ?";
            search = dataBaseConection.prepareStatement(sql);
            search.setInt(1, idAsignation);
            result=search.executeQuery();
            while(result.next())
            {
              idAsignation = result.getInt(idSelection);
            }
            result.close();
            dataBaseConection.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
        } 
        return idAsignation;
    }
    
    /**
     * 
     * @param articleId id del articulo a ser buscado dentro de la db para 
     * conocer la familia del articulo
     * @return 
     */
    public int chargeFamily(int articleId){
        int asignedId=0;
        asignedId= singleIntergerValueQuery("FAM_ID", "ARTICULOS", "ART_ID", articleId);
        asignedId= singleIntergerValueQuery("IVA_ID","FAMILIASARTICULOS","FAM_ID",asignedId);
        asignedId= singleIntergerValueQuery("IVA_VALOR","IVA","IVA_ID",asignedId);
        return asignedId;
    } 
    
    /**
     * 
     * @param articleId mediante el cual se conocera el stock del mismo
     * @return la cantidad de articulos disponibles en bodega
     */
    public int getStock(int articleId){
        int stock=singleIntergerValueQuery("ART_STOCK", "ARTICULOS", "ART_ID", articleId); 
        return stock;
    } 
    
    public int billsAmount(){
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        int val = 0;
        try {
            conexion = Connection.getConexion();
            sentencia = conexion.createStatement();
            String consultaSQL = "SELECT max(fac_id) FROM facturas";
            resultado = sentencia.executeQuery(consultaSQL);
            if (resultado.next()) {
                val = resultado.getInt(1);
            }
            val++;
        } catch (SQLException e) {

        }
        return val;
    }
    
    public double totalValue(double value, int amount){
        return value*amount;
    }
    
     public double totalValueFormater(double value, int amount){
        double valTotal = totalValue(value, amount);
        valTotal = DosDecimales(valTotal);
        return valTotal;
    }
     
    public double calculateTotalBill(double total, double valTotal){
        total += valTotal;
        total = DosDecimales(total);
        return total;
    }
    
    public double vatValue(int subIVA, double valTotal, double iva){
        double valor = valTotal * (subIVA*0.01);
        iva = iva + valor;
        iva = DosDecimales(iva);
        return iva;
    }
    
    public double disccountIva(double subIVA, double restar, double iva){
        double valor = restar * (subIVA*0.01);
        iva = iva - valor;
        return iva = DosDecimales(iva);
    }
    
    public double keyPressTotalslRefactor(double val){
        return val = (double) (val * 100) / 100;
    }
}
