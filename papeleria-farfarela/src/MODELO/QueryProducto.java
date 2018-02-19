/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Crispin
 */
public class QueryProducto {
    Conexion conexion = new Conexion();
    Connection conexion2 = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;
    
    public void reportePrductosMasV() {

        try {
            conexion2 = Conexion.getConnection();
String datos[]=new String[3];
            sentencia = conexion2.createStatement();
            String consultaSQL = "select articulos.ART_ID,articulos.ART_NOMBRE,detalle.DET_CANTIDAD from papeleriafarfarela.detalle, papeleriafarfarela.articulos where detalle.ART_ID=articulos.ART_ID order by detalle.DET_CANTIDAD desc limit 4;";
            resultado = sentencia.executeQuery(consultaSQL);
//          while(resultado.next())
//            {
//                System.out.println("Id "+String.valueOf(resultado.getInt(2)));
//                System.out.println("Nombre "+resultado.getString(1));
//                System.out.println("Cant: "+String.valueOf(resultado.getInt(3)));
//            }
//            
            
            
            Image portada;
            Document my_pdf_report = new Document(new Rectangle(PageSize.A4.rotate()), 1, 1, 1, 1);
            PdfWriter writer = PdfWriter.getInstance(my_pdf_report, new FileOutputStream("ProductosVen.pdf"));
            my_pdf_report.open();
            portada = Image.getInstance("portada.jpg");
            portada.setAlignment(Element.ALIGN_CENTER);
            portada.scalePercent(45f);// tamaño de imagen

            my_pdf_report.add(portada);
//            my_pdf_report.add(new Paragraph("                                           ---------------------------------------------------------"));
//            my_pdf_report.add(new Paragraph("                                          |    EMPLEADOS PAPELERIA FARFARELA         |"));
//            my_pdf_report.add(new Paragraph("                                           ---------------------------------------------------------"));
            PdfPTable my_report_table = new PdfPTable(3);
            PdfPCell table_cell;
            table_cell = new PdfPCell(new Phrase("Código"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Nombre"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Cantidad"));
            my_report_table.addCell(table_cell);
            //table_cell = new PdfPCell(new Phrase("Valor"));
            //my_report_table.addCell(table_cell);
//            table_cell = new PdfPCell(new Phrase("CONTACTO"));
//            my_report_table.addCell(table_cell);
//            table_cell = new PdfPCell(new Phrase("TELEFONO CONTACTO"));
//            my_report_table.addCell(table_cell);

            while (resultado.next()) {

                String codigo = String.valueOf(resultado.getInt(1));
                table_cell = new PdfPCell(new Phrase(codigo));
                my_report_table.addCell(table_cell);
                String nombre = resultado.getString(2);
                table_cell = new PdfPCell(new Phrase(nombre));
                my_report_table.addCell(table_cell);
                String cantidad = String.valueOf(resultado.getString(3));
                table_cell = new PdfPCell(new Phrase(cantidad));
                my_report_table.addCell(table_cell);
            }//cierra while (porque no hay mas datos en la BD)
            /* Attach report table to PDF */
            my_pdf_report.add(my_report_table);

            my_pdf_report.close();

             JOptionPane.showMessageDialog(null, "PDF Generado Exitosamente.");
             try {
                File path = new File("ProductosVen.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir el pdf:\n");
            }
            
            /* Close all DB related objects */
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
            conexion = null;
        } finally {

            CloseConnection.CloseConnection(conexion2, sentencia, resultado, ps);
        }
    }
    public void reportePrductosMenosV() {
        try {
            conexion2 = Conexion.getConnection();
            String datos[]=new String[3];
            sentencia = conexion2.createStatement();
            String consultaSQL = "select articulos.ART_ID,articulos.ART_NOMBRE,detalle.DET_CANTIDAD from papeleriafarfarela.detalle, papeleriafarfarela.articulos where detalle.ART_ID=articulos.ART_ID order by detalle.DET_CANTIDAD asc limit 4;";
            resultado = sentencia.executeQuery(consultaSQL);    
            Image portada;
            Document my_pdf_report = new Document(new Rectangle(PageSize.A4.rotate()), 1, 1, 1, 1);
            PdfWriter writer = PdfWriter.getInstance(my_pdf_report, new FileOutputStream("ProductosMenosV.pdf"));
            my_pdf_report.open();
            portada = Image.getInstance("portada.jpg");
            portada.setAlignment(Element.ALIGN_CENTER);
            portada.scalePercent(45f);// tamaño de imagen

            my_pdf_report.add(portada);
//            my_pdf_report.add(new Paragraph("                                           ---------------------------------------------------------"));
//            my_pdf_report.add(new Paragraph("                                          |    EMPLEADOS PAPELERIA FARFARELA         |"));
//            my_pdf_report.add(new Paragraph("                                           ---------------------------------------------------------"));
            PdfPTable my_report_table = new PdfPTable(3);
            PdfPCell table_cell;
            table_cell = new PdfPCell(new Phrase("Código"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Nombre"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Cantidad"));
            my_report_table.addCell(table_cell);
            while (resultado.next()) {

                String codigo = String.valueOf(resultado.getInt(1));
                table_cell = new PdfPCell(new Phrase(codigo));
                my_report_table.addCell(table_cell);
                String nombre = resultado.getString(2);
                table_cell = new PdfPCell(new Phrase(nombre));
                my_report_table.addCell(table_cell);
                String cantidad = String.valueOf(resultado.getString(3));
                table_cell = new PdfPCell(new Phrase(cantidad));
                my_report_table.addCell(table_cell);
            }//cierra while (porque no hay mas datos en la BD)
            /* Attach report table to PDF */
            my_pdf_report.add(my_report_table);
            my_pdf_report.close();
             JOptionPane.showMessageDialog(null, "PDF Generado Exitosamente.");
             try {
                File path = new File("ProductosMenosV.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir el pdf:\n");
            }            
            /* Close all DB related objects */
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
            conexion = null;
        } finally {

            CloseConnection.CloseConnection(conexion2, sentencia, resultado, ps);
        }
    }
    public void excelMasvendidos()
       {
        String[][] entrada = new String[1000][3];
        entrada[0][0]="Codigo";
        entrada[0][1]="Nombre";
        entrada[0][2]="Cantidad";
        String Ruta="/Users/Daniel/Desktop/ReporteMasVendidos.xls";
         try {
            conexion2 = Conexion.getConnection();
            sentencia = conexion2.createStatement();
            String consultaSQL = "select articulos.ART_ID,articulos.ART_NOMBRE,detalle.DET_CANTIDAD from papeleriafarfarela.detalle, papeleriafarfarela.articulos where detalle.ART_ID=articulos.ART_ID order 	by detalle.DET_CANTIDAD desc limit 4;";
            resultado = sentencia.executeQuery(consultaSQL);

             int cont=1;   
            while (resultado.next()) {
               String codigo = String.valueOf(resultado.getInt(1));
               entrada[cont][0]=codigo;
               String nombre = resultado.getString(2);
               entrada[cont][1]=nombre;
               String cantidad = String.valueOf(resultado.getString(3));
               entrada[cont][2]=cantidad;
               cont++;

            } 
           } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la base de Datos:\n" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
            conexion = null;
        } finally {

            CloseConnection.CloseConnection(conexion2, sentencia, resultado, ps);


        }
        WorkbookSettings conf=new WorkbookSettings ();
        conf.setEncoding("ISO-8859-1");
        try {
            WritableWorkbook workbook =Workbook.createWorkbook(new File(Ruta),conf);
            WritableSheet sheet= workbook.createSheet("masVendidos", 0);
            WritableFont h=new WritableFont(WritableFont.COURIER,16,WritableFont.NO_BOLD);
            WritableCellFormat hFormat=new WritableCellFormat(h);
            for(int i=0;i<entrada.length;i++)
            {
                for(int j=0;j<entrada[i].length;j++)
                {            
                  sheet.addCell(new jxl.write.Label(j,i,entrada[i][j],hFormat));
                   
                }
            }
            workbook .write();
            workbook.close();       
            
        } catch (IOException ex) {
            Logger.getLogger(QueryProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (WriteException ex) 
        {
          Logger.getLogger(QueryProducto.class.getName()).log(Level.SEVERE, null, ex);           
        }
    }
    
    public void excelMenosvendidos()
    {
        String[][] entrada = new String[1000][3];
        entrada[0][0]="Codigo";
        entrada[0][1]="Nombre";
        entrada[0][2]="Cantidad";
        String Ruta="/Users/Daniel/Desktop/ReporteMenosVendidos.xls";
         try {
            conexion2 = Conexion.getConnection();
            sentencia = conexion2.createStatement();
             String consultaSQL = "select articulos.ART_ID,articulos.ART_NOMBRE,detalle.DET_CANTIDAD from papeleriafarfarela.detalle, papeleriafarfarela.articulos where detalle.ART_ID=articulos.ART_ID order by detalle.DET_CANTIDAD asc limit 4;";
            resultado = sentencia.executeQuery(consultaSQL);
             int cont=1;   
            while (resultado.next()) {
               String codigo = String.valueOf(resultado.getInt(1));
               entrada[cont][0]=codigo;
               String nombre = resultado.getString(2);
               entrada[cont][1]=nombre;
               String cantidad = String.valueOf(resultado.getString(3));
               entrada[cont][2]=cantidad;
               cont++;

            } 
           } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la base de Datos:\n" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
            conexion = null;
        }finally {

            CloseConnection.CloseConnection(conexion2, sentencia, resultado, ps);
        }      
        
        WorkbookSettings conf=new WorkbookSettings ();
        conf.setEncoding("ISO-8859-1");
        try {
            WritableWorkbook workbook =Workbook.createWorkbook(new File(Ruta),conf);
            WritableSheet sheet= workbook.createSheet("menosVendidos", 0);
            WritableFont h=new WritableFont(WritableFont.COURIER,16,WritableFont.NO_BOLD);
            WritableCellFormat hFormat=new WritableCellFormat(h);
            for(int i=0;i<entrada.length;i++)
            {
                for(int j=0;j<entrada[i].length;j++)
                {            
                  sheet.addCell(new jxl.write.Label(j,i,entrada[i][j],hFormat));
                   
                }
            }
            workbook .write();
            workbook.close();       
            
        } catch (IOException ex) {
            Logger.getLogger(QueryProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (WriteException ex) 
        {
          Logger.getLogger(QueryProducto.class.getName()).log(Level.SEVERE, null, ex);           
        }
    }
    
}
