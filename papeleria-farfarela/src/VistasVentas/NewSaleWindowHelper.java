/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasVentas;

import MODELO.Conexion;
import MODELO.QueryArticulo;
import MODELO.QueryCliente;
import static VistasVentas.NewSale.jDialogArticles;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public void showClients(){
    }

    
    
    
}
