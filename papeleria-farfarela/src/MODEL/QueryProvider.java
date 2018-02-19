package MODEL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import MODEL.CloseConnection;
import MODEL.Conexion;
import VistaProveedor.ProveedorPrincipal1;
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
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
public class QueryProvider {
    //Definiciones

    Conexion connection = new Conexion();
    DefaultTableModel model;
    String[] titlesColumns = {"CÓDIGO", "IDENTIFICADOR", "RAZÓN SOCIAL", "TELEFONO", "CONTACTO", "TELEFONO-CONTACTO", "DIRECCION"};
    String info[][] = {};
    //-----------------------------------------------------------------------------------

    public void agregarProveedor(int cod, String id, String nombres, String apellidos,
            String direccion, String telefono, String observacion,
            Date fNacimiento, Date fIngreso) {

        Connection reg = Conexion.getConnection();

        String insertSql = "INSERT INTO EMPLEADO ( EMP_ID, EMP_IDENTIFICADOR, EMP_NOMBRES,EMP_APELLIDOS,EMP_DIRECCION,EMP_TELEFONO,EMP_OBSERVACION,EMP_FECHANACIMIENTO,EMP_FECHAINGRESO)VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pStatement = reg.prepareStatement(insertSql);
            pStatement.setInt(1, cod);
            pStatement.setString(2, id);
            pStatement.setString(3, nombres);
            pStatement.setString(4, apellidos);
            pStatement.setString(5, direccion);
            pStatement.setString(6, telefono);
            pStatement.setString(7, observacion);
            int n = pStatement.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Empleado Regristado Exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error - " + ex);
            Logger.getLogger(QueryProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//cierra metodo agregarVendedor

    //-----------------------------------------------------------------------------------
    public void eliminarProveedor(int code) {

        try {
            Connection connection =  Conexion.getConnection();
            Statement comand = connection.createStatement();
            int cantidad = comand.executeUpdate("delete from PROVEEDOR where PRO_ID=" + code);
            if (cantidad == 1) {

                JOptionPane.showMessageDialog(null, "Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Proveedor de Codigo " + code);
            }
            connection.close();
            //System.out.println("Conexion cerrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error, no se puede eliminar, tiene datos asociados ");
        }

    }//cierra metodo eliminar

//-----------------------------------------------------------------------------------
    public void modificarProveedor(int cod, String id, String razonSocial,
            String telefono, String contacto,
            String telfContacto, String direccion) {

        try {
            Connection connection =  Conexion.getConnection();
            Statement comand = connection.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
            int cantidad = comand.executeUpdate("update PROVEEDOR set PRO_IDENTIFICADOR ='" + id + "', "
                    + " PRO_RAZONSOCIAL ='" + razonSocial
                    + "',PRO_TELEFONO ='" + telefono
                    + "',PRO_CONTACTO ='" + contacto
                    + "',PRO_TELEFONOCONTACTO ='" + telfContacto
                    + "',PRO_DIRECCION  ='" + direccion
                    + "' where PRO_ID=" + cod);
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, " Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Proveedor con codigo : " + cod);
            }
            connection.close();
            //System.out.println("Conexion cerrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error -->" + ex);
        }
    }//cierra metodo modificarEmpleado

//-----------------------------------------------------------------------------------
    public void actualizarTabla() {
        listarTodosProveedores();
    }

    public void listarTodosProveedores() {

        model = new DefaultTableModel(info, titlesColumns) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //le asigna el model al jtable
        ProveedorPrincipal1.jTableListarProveedor.setModel(model);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();

    }//cierra metodo listarTodosClientes

    //-----------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------
    public boolean buscarRepetido(String identificador) {

        try {
            Connection reg =  Conexion.getConnection();

            sentence = reg.createStatement();
            String querySQL = "SELECT pro_identificador FROM PROVEEDOR where pro_identificador=" + identificador;
            result = sentence.executeQuery(querySQL);

            //mientras haya datos en la BD ejecutar eso...
            while (result.next()) {

                String ident = result.getString("PRO_IDENTIFICADOR");

                if (ident.equals(identificador)) {
                    return true;
                }

            }//cierra while (porque no hay mas datos en la BD)

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            connection = null;
        } finally {
            CloseConnection.CloseConnection(connection2, sentence, result, pStatement);

        }
        return false;
    }//cierra metodo ejecutarConsulta

//-----------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------
    /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection connection2 = null;
    Statement sentence = null;
    ResultSet result = null;
    PreparedStatement pStatement = null;

    public void ejecutarConsultaTodaTabla() {

        try {
            connection2 =  Conexion.getConnection();

            sentence = connection2.createStatement();
            String consultaSQL = "SELECT * FROM PROVEEDOR ORDER BY PRO_ID ASC";
            result = sentence.executeQuery(consultaSQL);

            //mientras haya datos en la BD ejecutar eso...
            while (result.next()) {

                int codigo = result.getInt("PRO_ID");
                String identificador = result.getString("PRO_IDENTIFICADOR");
                String razonSocial = result.getString("PRO_RAZONSOCIAL");
                String telefono = result.getString("PRO_TELEFONO");
                String contacto = result.getString("PRO_CONTACTO");
                String telefonoContacto = result.getString("PRO_TELEFONOCONTACTO");
                String direccion = result.getString("PRO_DIRECCION");

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, identificador, razonSocial, telefono, contacto, telefonoContacto, direccion};

                //al model de la tabla le agrega una fila
                //con los datos que están en info
                model.addRow(info);

            }//cierra while (porque no hay mas datos en la BD)

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            connection = null;
        } finally {

            CloseConnection.CloseConnection(connection2, sentence, result, pStatement);

        }

    }//cierra metodo ejecutarConsulta

//-----------------------------------------------------------------------------------
    public void buscarProveedor(String parametroBusqueda, boolean buscarPorCodigo, boolean buscarPorIdentificador, boolean buscarPorRazonSocial) {

        model = new DefaultTableModel(info, titlesColumns) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        //le asigna el model al jtable
        /*ProveedorSearch.jTableListarProveedor.setModel(model);*/
        ProveedorPrincipal1.jTableListarProveedor.setModel(model);
        //ejecuta una consulta a la BD
        buscarRegistroCodigoOIdentificadorONombreOapellido(parametroBusqueda, buscarPorCodigo, buscarPorIdentificador, buscarPorRazonSocial);

    }//cierra metodo buscarEmpleado

    //-----------------------------------------------------------------------------------
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
     * clientes, se puede buscar por la cedula o por el nombre.
     *
     * @param parametroBusqueda
     * @param buscarPorCodigo
     * @param buscarPorIdentificador
     * @param buscarPorRazonSocial
     */
    public void buscarRegistroCodigoOIdentificadorONombreOapellido(String parametroBusqueda, boolean buscarPorCodigo, boolean buscarPorIdentificador, boolean buscarPorRazonSocial) {

        try {

            connection2 =  Conexion.getConnection();
            String selectSQL;
            result = null;
            if (buscarPorCodigo == true) {
                selectSQL = "SELECT * FROM PROVEEDOR WHERE PRO_ID LIKE ? ORDER BY PRO_ID ASC";
                pStatement = connection2.prepareStatement(selectSQL);
                pStatement.setString(1, "%" + parametroBusqueda + "%");
                System.out.println(parametroBusqueda);
            } else if (buscarPorIdentificador == true) {
                selectSQL = "SELECT * FROM PROVEEDOR WHERE PRO_IDENTIFICADOR LIKE ? ORDER BY PRO_IDENTIFICADOR ASC";
                pStatement = connection2.prepareStatement(selectSQL);
                pStatement.setString(1, "%" + parametroBusqueda + "%");
            } else if (buscarPorRazonSocial == true) {
                selectSQL = "SELECT * FROM PROVEEDOR WHERE PRO_RAZONSOCIAL LIKE ? ORDER BY PRO_RAZONSOCIAL ASC";
                pStatement = connection2.prepareStatement(selectSQL);
                pStatement.setString(1, "%" + parametroBusqueda + "%");
            }
            result = pStatement.executeQuery();

            while (result.next()) {

                int codigo = result.getInt("PRO_ID");
                String identificador = result.getString("PRO_IDENTIFICADOR");
                String razonSocial = result.getString("PRO_RAZONSOCIAL");
                String telefono = result.getString("PRO_TELEFONO");
                String contacto = result.getString("PRO_CONTACTO");
                String telefonoContacto = result.getString("PRO_TELEFONOCONTACTO");
                String direccion = result.getString("PRO_DIRECCION");

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, identificador, razonSocial, telefono, contacto, telefonoContacto, direccion};

                //al model de la tabla le agrega una fila
                //con los datos que están en info
                model.addRow(info);

            }//cierra while (porque no hay mas datos en la BD)

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Por la Causa" + e);
        } finally {
            CloseConnection.CloseConnection(connection2, sentence, result, pStatement);

        }

    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    
        public boolean validarDocumento(JTextField numero) {
        boolean value = true;
        try {
            int suma = 0;
            int residuo = 0;
            boolean privada = false;
            boolean publica = false;
            boolean natural = false;
            int numeroProvincias = 22;
            int digitoVerificador = 0;
            int modulo = 11;

            int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
            int p1, p2, p3, p4, p5, p6, p7, p8, p9;

            d1 = d2 = d3 = d4 = d5 = d6 = d7 = d8 = d9 = d10 = 0;
            p1 = p2 = p3 = p4 = p5 = p6 = p7 = p8 = p9 = 0;

            if (numero.getText().length() < 10) {
                JOptionPane.showMessageDialog(null, "El número ingresado no es válido");
                numero.setText("");
                value = false;
            }

            // Los primeros dos digitos corresponden al codigo de la provincia
            int provincia = Integer.parseInt(numero.getText().substring(0, 2));

            if (provincia <= 0 || provincia > numeroProvincias) {
                JOptionPane.showMessageDialog(null, "El código de la provincia (dos primeros dígitos) es inválido");
                numero.setText("");
                value = false;
            }

            // Aqui almacenamos los digitos de la cedula en variables.
            d1 = Integer.parseInt(numero.getText().substring(0, 1));
            d2 = Integer.parseInt(numero.getText().substring(1, 2));
            d3 = Integer.parseInt(numero.getText().substring(2, 3));
            d4 = Integer.parseInt(numero.getText().substring(3, 4));
            d5 = Integer.parseInt(numero.getText().substring(4, 5));
            d6 = Integer.parseInt(numero.getText().substring(5, 6));
            d7 = Integer.parseInt(numero.getText().substring(6, 7));
            d8 = Integer.parseInt(numero.getText().substring(7, 8));
            d9 = Integer.parseInt(numero.getText().substring(8, 9));
            d10 = Integer.parseInt(numero.getText().substring(9, 10));

            // El tercer digito es:
            // 9 para sociedades privadas y extranjeros
            // 6 para sociedades publicas
            // menor que 6 (0,1,2,3,4,5) para personas naturales
            if (d3 == 7 || d3 == 8) {
                JOptionPane.showMessageDialog(null, "El tercer dígito ingresado es inválido");
                numero.setText("");
                value = false;
            }

            // Solo para personas naturales (modulo 10)
            if (d3 < 6) {
                natural = true;
                modulo = 10;
                p1 = d1 * 2;
                if (p1 >= 10) {
                    p1 -= 9;
                }
                p2 = d2 * 1;
                if (p2 >= 10) {
                    p2 -= 9;
                }
                p3 = d3 * 2;
                if (p3 >= 10) {
                    p3 -= 9;
                }
                p4 = d4 * 1;
                if (p4 >= 10) {
                    p4 -= 9;
                }
                p5 = d5 * 2;
                if (p5 >= 10) {
                    p5 -= 9;
                }
                p6 = d6 * 1;
                if (p6 >= 10) {
                    p6 -= 9;
                }
                p7 = d7 * 2;
                if (p7 >= 10) {
                    p7 -= 9;
                }
                p8 = d8 * 1;
                if (p8 >= 10) {
                    p8 -= 9;
                }
                p9 = d9 * 2;
                if (p9 >= 10) {
                    p9 -= 9;
                }
            }

            // Solo para sociedades publicas (modulo 11)
            // Aqui el digito verficador esta en la posicion 9, en las otras 2
            // en la pos. 10
            if (d3 == 6) {
                publica = true;
                p1 = d1 * 3;
                p2 = d2 * 2;
                p3 = d3 * 7;
                p4 = d4 * 6;
                p5 = d5 * 5;
                p6 = d6 * 4;
                p7 = d7 * 3;
                p8 = d8 * 2;
                p9 = 0;
            }

            /* Solo para entidades privadas (modulo 11) */
            if (d3 == 9) {
                privada = true;
                p1 = d1 * 4;
                p2 = d2 * 3;
                p3 = d3 * 2;
                p4 = d4 * 7;
                p5 = d5 * 6;
                p6 = d6 * 5;
                p7 = d7 * 4;
                p8 = d8 * 3;
                p9 = d9 * 2;
            }

            suma = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9;
            residuo = suma % modulo;

            // Si residuo=0, dig.ver.=0, caso contrario 10 - residuo
            digitoVerificador = residuo == 0 ? 0 : modulo - residuo;
            int lengthChain = numero.getText().length(); // Longitud del string

            // ahora comparamos el elemento de la posicion 10 con el dig. ver.
            if (publica == true) {
                if (digitoVerificador != d9) {
                    JOptionPane.showMessageDialog(null,
                            "El ruc de la empresa del sector público es incorrecto.");
                    numero.setText("");
                    value = false;
                }
                /* El ruc de las empresas del sector publico terminan con 0001 */
                if (!numero.getText().substring(9, lengthChain).equals("0001")) {
                    JOptionPane.showMessageDialog(null,
                            "El ruc de la empresa del sector público debe terminar con 0001");
                    numero.setText("");
                    value = false;
                }
            }

            if (privada == true) {
                if (digitoVerificador != d10) {
                    JOptionPane
                            .showMessageDialog(null,
                                    "El ruc de la empresa del sector privado es incorrecto.");
                    numero.setText("");
                    value = false;
                }
                if (!numero.getText().substring(10, lengthChain).equals("001")) {
                    JOptionPane
                            .showMessageDialog(null,
                                    "El ruc de la empresa del sector privado debe terminar con 001");
                    numero.setText("");
                    value = false;
                }
            }

            if (natural == true) {
                if (digitoVerificador != d10) {
                    JOptionPane.showMessageDialog(null, "El número de cédula de la persona natural es incorrecto.");
                    numero.setText("");
                    value = false;
                }
                if (numero.getText().length() > 10
                        && !numero.getText().substring(10, lengthChain).equals(
                                "001")) {
                    JOptionPane.showMessageDialog(null, "El ruc de la persona natural debe terminar con 001");
                    numero.setText("");
                    value = false;
                }
            }
        } catch (Exception e) {
            numero.setText("");
            value = false;
        }
        return value;
    }

    
    
    /*REPORTE
     */
    public void reporteProveedores() {

        try {
            connection2 =  Conexion.getConnection();

            sentence = connection2.createStatement();
            String consultaSQL = "SELECT * FROM PROVEEDOR ORDER BY PRO_ID ASC";
            result = sentence.executeQuery(consultaSQL);
            Image portada;
            Document my_pdf_report = new Document(new Rectangle(PageSize.A4.rotate()), 1, 1, 1, 1);
            PdfWriter writer = PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Proveedores.pdf"));
            my_pdf_report.open();
            portada = Image.getInstance("portada.jpg");
            portada.setAlignment(Element.ALIGN_CENTER);
            portada.scalePercent(45f);// tamaño de imagen

            my_pdf_report.add(portada);
//            my_pdf_report.add(new Paragraph("                                           ---------------------------------------------------------"));
//            my_pdf_report.add(new Paragraph("                                          |    EMPLEADOS PAPELERIA FARFARELA         |"));
//            my_pdf_report.add(new Paragraph("                                           ---------------------------------------------------------"));
            PdfPTable my_report_table = new PdfPTable(6);
            PdfPCell table_cell;
            table_cell = new PdfPCell(new Phrase("codigo"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Identificador"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("RAZON SOCIAL"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("TELEFONO"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("CONTACTO"));
            my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("TELEFONO CONTACTO"));
            my_report_table.addCell(table_cell);

            while (result.next()) {

                String codigo = result.getString("PRO_ID");
                table_cell = new PdfPCell(new Phrase(codigo));
                my_report_table.addCell(table_cell);
                String identificador = result.getString("PRO_IDENTIFICADOR");
                table_cell = new PdfPCell(new Phrase(identificador));
                my_report_table.addCell(table_cell);
                String nombres = result.getString("PRO_RAZONSOCIAL");
                table_cell = new PdfPCell(new Phrase(nombres));
                my_report_table.addCell(table_cell);
                String apellidos = result.getString("PRO_TELEFONO");
                table_cell = new PdfPCell(new Phrase(apellidos));
                my_report_table.addCell(table_cell);
                String cargo = result.getString("PRO_CONTACTO");
                table_cell = new PdfPCell(new Phrase(cargo));
                my_report_table.addCell(table_cell);

                String tContacto = result.getString("PRO_TELEFONOCONTACTO");
                table_cell = new PdfPCell(new Phrase(tContacto));
                my_report_table.addCell(table_cell);

            }//cierra while (porque no hay mas datos en la BD)
            /* Attach report table to PDF */
            my_pdf_report.add(my_report_table);

            my_pdf_report.close();

             JOptionPane.showMessageDialog(null, "PDF Generado Exitosamente.");
             try {
                File path = new File("Proveedores.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir el pdf:\n");
            }
            
            /* Close all DB related objects */
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
            connection = null;
        } finally {

            CloseConnection.CloseConnection(connection2, sentence, result, pStatement);

        }
        
        
    }

    ////
     public void reporteProvedoresExcel()
    {
      String[][] entrada = new String[1000][6];
        entrada[0][0]="Codigo";
        entrada[0][1]="Identificador";
        entrada[0][2]="Razon Social";
        entrada[0][3]="Telefono";
        entrada[0][4]="Contacto";
        entrada[0][5]="Direccion";
        
        String Ruta="/Users/Daniel/Desktop/ReporteProvedores.xls";
         try {
            connection2 =  Conexion.getConnection();
            sentence = connection2.createStatement();
            String consultaSQL = "SELECT * FROM PROVEEDOR ORDER BY PRO_ID ASC";
            result = sentence.executeQuery(consultaSQL);
             int cont=1;   
            while (result.next()) 
            {
               
                String codigo = result.getString("PRO_ID");
                entrada[cont][0]=codigo;
                String identificador = result.getString("PRO_IDENTIFICADOR");
                entrada[cont][1]=identificador;
                String razonSocial = result.getString("PRO_RAZONSOCIAL");
                entrada[cont][2]=razonSocial;
                String telefono = result.getString("PRO_TELEFONO");
                entrada[cont][3]=telefono;
                String contacto = result.getString("PRO_CONTACTO");
                entrada[cont][4]=contacto;
                String direccion = result.getString("PRO_DIRECCION");
                entrada[cont][5]=direccion;              
                cont++;

            } 
           } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la base de Datos:\n" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
            connection = null;
        } finally {
            CloseConnection.CloseConnection(connection2, sentence, result, pStatement);

        }
        
        WorkbookSettings conf=new WorkbookSettings ();
        conf.setEncoding("ISO-8859-1");
        try {
            WritableWorkbook workbook =Workbook.createWorkbook(new File(Ruta),conf);
            WritableSheet sheet= workbook.createSheet("reporteProvedores", 0);
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
            Logger.getLogger(QueryProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (WriteException ex) 
        {
          Logger.getLogger(QueryProvider.class.getName()).log(Level.SEVERE, null, ex);           
        }
       
    }
}
