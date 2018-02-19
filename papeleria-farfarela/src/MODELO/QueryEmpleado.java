/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import VistaEmpleado.EmpleadoPrincipal1;
import static VistaEmpleado.EmpleadoPrincipal1.jTableListarEmpleado;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import static com.itextpdf.text.Element.ALIGN_CENTER;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Crispin
 */


public class QueryEmpleado {

    public QueryEmpleado() {
    }

    /**
     * Declaraciones de variables.
     * conexion: realiza la conexion de la base de datos cuando se realiza la peticion
     * modelo: instancia a la tabla, donde se depegara los datos
     * titulosColumnas: variable que posee los nombres de cadaa columna de las tablas
     * informacion: variable para el arreglo de datos de la informacion solicitada cuando se ejecuta la consulta
     */
    Conexion conexion = new Conexion();
    DefaultTableModel modelo;
    String[] titulosColumnas = {"CÓDIGO", "IDENTIFICADOR", "NOMBRES", "APELLIDOS", "DIRECCION", "TELEFONO", "CARGO", "F.NACIMIENTO", "F.INGRESO"};
    String information[][] = {};
    //-----------------------------------------------------------------------------------

    public void agregarEmpleado(int cod, String id, String nombres, String apellidos,
            String direccion, String telefono, String observacion,
            Date fNacimiento, Date fIngreso) {

        Connection reg = Conexion.getConnection();

        String sql = "INSERT INTO EMPLEADO ( EMP_ID, EMP_IDENTIFICADOR, EMP_NOMBRES,EMP_APELLIDOS,EMP_DIRECCION,EMP_TELEFONO,EMP_OBSERVACION,EMP_FECHANACIMIENTO,EMP_FECHAINGRESO)VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-mm-dd");
            Date fecha = null;
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setInt(1, cod);
            pst.setString(2, id);
            pst.setString(3, nombres);
            pst.setString(4, apellidos);
            pst.setString(5, direccion);
            pst.setString(6, telefono);
            pst.setString(7, observacion);

            pst.setDate(7, (java.sql.Date) fNacimiento);
            pst.setDate(8, (java.sql.Date) fIngreso);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Empleado Regristado Exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error - " + ex);
            Logger.getLogger(QueryEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//cierra metodo agregarVendedor

    //-----------------------------------------------------------------------------------
    public void eliminarEmpleado(int code) {

        try {
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/farfarela", "ECUATORIANO16", "root");
            Connection conexion = Conexion.getConnection();
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from empleado where emp_id=" + code);
            if (cantidad == 1) {

                JOptionPane.showMessageDialog(null, "Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Cliente de Codigo " + code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error, no se puede eliminar, tiene datos asociados ");
        }

    }//cierra metodo eliminar

//-----------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------
    public boolean buscarRepetido(String identificador) {

        try {
            Connection registro = Conexion.getConnection();

            sentencia = registro.createStatement();
            String consultaSQL = "SELECT emp_identificador FROM EMPLEADO where emp_identificador=" + identificador;
            resultado = sentencia.executeQuery(consultaSQL);

            //mientras haya datos en la BD ejecutar eso...
            while (resultado.next()) {

                String ident = resultado.getString("EMP_IDENTIFICADOR");

                if (ident.equals(identificador)) {
                    return true;

                }

            }//cierra while (porque no hay mas datos en la BD)

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            conexion = null;
        } finally {

            CloseConnection.CloseConnection(conexion2, sentencia, resultado, ps);

        }
        return false;
    }//cierra metodo ejecutarConsulta

//-----------------------------------------------------------------------------------
    public void modificarEmpleado(int cod, String id, String nombres, String apellidos,
            String direccion, String telefono, String cargo, String observacion,
            String fNacimiento, String fIngreso) {

        try {
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/farfarela", "ECUATORIANO16", "root");

            Connection conexion = Conexion.getConnection();
            Statement comando = conexion.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
            int cantidad = comando.executeUpdate("update EMPLEADO set EMP_IDENTIFICADOR ='" + id + "', "
                    + " EMP_NOMBRES ='" + nombres
                    + "', EMP_APELLIDOS ='" + apellidos
                    + "', EMP_DIRECCION ='" + direccion
                    + "', EMP_TELEFONO ='" + telefono
                    + "', EMP_CARGO ='" + cargo
                    + "', EMP_OBSERVACION ='" + observacion
                    + "', EMP_FECHANACIMIENTO ='" + fNacimiento
                    + "', EMP_FECHAINGRESO ='" + fIngreso
                    + "' where EMP_ID=" + cod);
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, " Modifico con Exito" + "nuevo:" + nombres);
            } else {
                JOptionPane.showMessageDialog(null, "No existe Vendedor de un codigo " + cod);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error -->" + ex);
        }
    }//cierra metodo modificarEmpleado

//-----------------------------------------------------------------------------------
    public void listarTodosEmpleados() {

        modelo = new DefaultTableModel(information, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //le asigna el modelo al jtable
        EmpleadoPrincipal1.jTableListarEmpleado.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();

    }//cierra metodo listarTodosClientes

//-----------------------------------------------------------------------------------
    /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection conexion2 = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

    public void ejecutarConsultaTodaTabla() {

        try {
            conexion2 = Conexion.getConnection();

            sentencia = conexion2.createStatement();
            String consultaSQL = "SELECT * FROM EMPLEADO ORDER BY EMP_ID ASC";
            resultado = sentencia.executeQuery(consultaSQL);

            //mientras haya datos en la BD ejecutar eso...
            while (resultado.next()) {

                int codigo = resultado.getInt("EMP_ID");
                String identificador = resultado.getString("EMP_IDENTIFICADOR");
                String nombres = resultado.getString("EMP_NOMBRES");
                String apellidos = resultado.getString("EMP_APELLIDOS");
                String direccion = resultado.getString("EMP_DIRECCION");
                String telefono = resultado.getString("EMP_TELEFONO");
                String cargo = resultado.getString("EMP_CARGO");
                //String observacion = resultado.getString("EMP_OBSERVACION");
                String fNacimiento = resultado.getString("EMP_FECHANACIMIENTO");
                String fIngreso = resultado.getString("EMP_FECHAINGRESO");

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, identificador, nombres, apellidos, direccion, telefono, cargo, fNacimiento, fIngreso};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }//cierra while (porque no hay mas datos en la BD)

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            conexion = null;
        } finally {

            CloseConnection.CloseConnection(conexion2, sentencia, resultado, ps);

        }

    }//cierra metodo ejecutarConsulta

    /*REPORTE
     */
    public void reporteEmpleados() {

        try {
            conexion2 = Conexion.getConnection();

            sentencia = conexion2.createStatement();
            String consultaSQL = "SELECT * FROM EMPLEADO ORDER BY EMP_ID ASC";
            resultado = sentencia.executeQuery(consultaSQL);
            Image portada;
            Document my_pdf_report = new Document(new Rectangle(PageSize.A4.rotate()),1,1,1,1);
            PdfWriter writer=PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Empleados.pdf"));
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
            table_cell = new PdfPCell(new Phrase("Nombres"));
             my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Apellidos"));
             my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Cargo"));
             my_report_table.addCell(table_cell);
            table_cell = new PdfPCell(new Phrase("Fecha Ingreso"));
             my_report_table.addCell(table_cell);
            while (resultado.next()) {

                String codigo = resultado.getString("EMP_ID");
                table_cell = new PdfPCell(new Phrase(codigo));
                my_report_table.addCell(table_cell);
                String identificador = resultado.getString("EMP_IDENTIFICADOR");
                table_cell = new PdfPCell(new Phrase(identificador));
                my_report_table.addCell(table_cell);
                String nombres = resultado.getString("EMP_NOMBRES");
                table_cell = new PdfPCell(new Phrase(nombres));
                my_report_table.addCell(table_cell);
                String apellidos = resultado.getString("EMP_APELLIDOS");
                table_cell = new PdfPCell(new Phrase(apellidos));
                my_report_table.addCell(table_cell);
//                String direccion = resultado.getString("EMP_DIRECCION");
//                table_cell=new PdfPCell(new Phrase(direccion));
//                my_report_table.addCell(table_cell);
//                String telefono = resultado.getString("EMP_TELEFONO");
//                table_cell=new PdfPCell(new Phrase(telefono));
//                my_report_table.addCell(table_cell);
                String cargo = resultado.getString("EMP_CARGO");
                table_cell = new PdfPCell(new Phrase(cargo));
                my_report_table.addCell(table_cell);
//                String observacion = resultado.getString("EMP_OBSERVACION");
//                table_cell=new PdfPCell(new Phrase(observacion));
//                my_report_table.addCell(table_cell);
//                String fNacimiento = resultado.getString("EMP_FECHANACIMIENTO");
//                table_cell=new PdfPCell(new Phrase(fNacimiento));
//                my_report_table.addCell(table_cell);
                String fIngreso = resultado.getString("EMP_FECHAINGRESO");
                table_cell = new PdfPCell(new Phrase(fIngreso));
                my_report_table.addCell(table_cell);

            }//cierra while (porque no hay mas datos en la BD)
            /* Attach report table to PDF */
            my_pdf_report.add(my_report_table);
            
            
          
            
            my_pdf_report.close();
            
            JOptionPane.showMessageDialog(null, "PDF Generado Exitosamente.");
             try {
                File path = new File("Empleados.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir el pdf:\n");
            }
            

            /* Close all DB related objects */
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf:\n");
            conexion = null;
        } finally {
            CloseConnection.CloseConnection(conexion2, sentencia, resultado, ps);


        }
    }

    ////
    public void UpdateTable() {
        try {
            String sql = "SELECT * FROM EMPLEADO WHERE EMP_ID LIKE ? ORDER BY EMP_ID ASC";
            ps = conexion2.prepareStatement(sql);
            resultado = ps.executeQuery(sql);
            //EmpleadoPrincipal.jTableListarEmpleado.setModel(DbUtils.resultSetToTableModel(resultado));
        } catch (Exception e) {
        }
    }

    public void actualizarTabla() {
        listarTodosEmpleados();
    }

    public boolean validadorDeCedula(String cedula, int opcion) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }

    /*
    
    
     */
    public boolean validarDocumento(JTextField numero) {
        boolean valor = true;
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
                valor = false;
            }

            // Los primeros dos digitos corresponden al codigo de la provincia
            int provincia = Integer.parseInt(numero.getText().substring(0, 2));

            if (provincia <= 0 || provincia > numeroProvincias) {
                JOptionPane.showMessageDialog(null, "El código de la provincia (dos primeros dígitos) es inválido");
                numero.setText("");
                valor = false;
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
                valor = false;
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
            int longitud = numero.getText().length(); // Longitud del string

            // ahora comparamos el elemento de la posicion 10 con el dig. ver.
            if (publica == true) {
                if (digitoVerificador != d9) {
                    JOptionPane.showMessageDialog(null,
                            "El ruc de la empresa del sector público es incorrecto.");
                    numero.setText("");
                    valor = false;
                }
                /* El ruc de las empresas del sector publico terminan con 0001 */
                if (!numero.getText().substring(9, longitud).equals("0001")) {
                    JOptionPane.showMessageDialog(null,
                            "El ruc de la empresa del sector público debe terminar con 0001");
                    numero.setText("");
                    valor = false;
                }
            }

            if (privada == true) {
                if (digitoVerificador != d10) {
                    JOptionPane
                            .showMessageDialog(null,
                                    "El ruc de la empresa del sector privado es incorrecto.");
                    numero.setText("");
                    valor = false;
                }
                if (!numero.getText().substring(10, longitud).equals("001")) {
                    JOptionPane
                            .showMessageDialog(null,
                                    "El ruc de la empresa del sector privado debe terminar con 001");
                    numero.setText("");
                    valor = false;
                }
            }

            if (natural == true) {
                if (digitoVerificador != d10) {
                    JOptionPane.showMessageDialog(null, "El número de cédula de la persona natural es incorrecto.");
                    numero.setText("");
                    valor = false;
                }
                if (numero.getText().length() > 10
                        && !numero.getText().substring(10, longitud).equals(
                                "001")) {
                    JOptionPane.showMessageDialog(null, "El ruc de la persona natural debe terminar con 001");
                    numero.setText("");
                    valor = false;
                }
            }
        } catch (Exception e) {
            numero.setText("");
            valor = false;
        }
        return valor;
    }

    /////
     public void reporteEmpleadosExcel()
    {

         String[][] entrada = new String[1000][6];
        entrada[0][0]="Codigo";
        entrada[0][1]="Identificador";
        entrada[0][2]="Nombres";
        entrada[0][3]="Apellidos";
        entrada[0][4]="Cargo";
        entrada[0][5]="Fecha de Ingreso";
        
        String Ruta="/Users/Daniel/Desktop/ReporteEmpleados.xls";
         try {
            conexion2 = Conexion.getConnection();
            sentencia = conexion2.createStatement();
             String consultaSQL = "SELECT * FROM EMPLEADO ORDER BY EMP_ID ASC";
             resultado = sentencia.executeQuery(consultaSQL);
             int cont=1;   
            while (resultado.next()) {
                String codigo = resultado.getString("EMP_ID");
                entrada[cont][0]=codigo;
                String identificador = resultado.getString("EMP_IDENTIFICADOR");
                entrada[cont][1]=identificador;
                String nombres = resultado.getString("EMP_NOMBRES");
                entrada[cont][2]=nombres;
                String apellidos = resultado.getString("EMP_APELLIDOS");
                entrada[cont][3]=apellidos;
                String cargo = resultado.getString("EMP_CARGO");
                entrada[cont][4]=cargo;
                String fIngreso = resultado.getString("EMP_FECHAINGRESO");
                entrada[cont][5]=fIngreso;
          
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
            WritableSheet sheet= workbook.createSheet("ReporteEmpleados", 0);
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
            Logger.getLogger(QueryEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (WriteException ex) 
        {
          Logger.getLogger(QueryEmpleado.class.getName()).log(Level.SEVERE, null, ex);           
        }
    
                
    }
}
