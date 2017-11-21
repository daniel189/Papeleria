/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasVentas;

//import Modelo.Conexion;
import MODELO.*;
import Vista.HomeAplicativo;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.gt;
import static javax.management.Query.lt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class VentasNew extends javax.swing.JInternalFrame{

    /**
     * Creates new form VentasNew
     */
    int n = 0, item = -1;
    double totals = 0;
    DefaultTableModel modelo;
    // llamada clase de conexion
    Conexion conectar = new Conexion();
    String ClienteExistente = "no";
    boolean ced = false, nom = false, ape = false;
    int bandera = 1;

    public VentasNew() {
        //super(parent, modal);
        initComponents();

        modelo = new DefaultTableModel();
        // Agrega fila
        modelo.addColumn("No.");
        modelo.addColumn("Código");
        modelo.addColumn("Artículo");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor Unitario");
        modelo.addColumn("Valor Subtotal");
        
        this.JTableArticulos.setModel(modelo);
        //setLocationRelativeTo(null);

        String cuenta = Vista.HomeAplicativo.getCuenta1();
        jTextFieldCodVendedor.setText(cuenta);
        
        // CONFIGURAR el taño de ancho de la tabla
        int[] anchos = {35, 65, 220, 60, 85, 80};
        for (int i = 0; i < JTableArticulos.getColumnCount(); i++) {
            JTableArticulos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

     
        
        
        // Leer la fecha de computador y colocarlo el cuadro de fecha
        //-------------------------------------
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = formateador.format(fechaActual);
        jTextFieldFecha.setText(fecha);
        jTextFieldFecha.setEditable(false);

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        PreparedStatement ps = null;

        try {
            conexion = Conexion.getConexion();

            sentencia = conexion.createStatement();
            String consultaSQL = "SELECT max(fac_id) FROM facturas";

            resultado = sentencia.executeQuery(consultaSQL);
            int val = 0;
            if (resultado.next()) {
                val = resultado.getInt(1);
            }
            val++;
            jTextFieldCodFacturas.setText(String.valueOf(val));

        } catch (SQLException e) {

        }
        //-------------------------------------------
    }

    public String verEmpleado(String cuenta){return null;
}
       
    
    
    
    //ventana de ARTICULOS
    private void llamarArticulos() {

        // llamada de datos
        queryArticulo load = new queryArticulo();
        load.CargarArticulos();
        //Centramos nuestro jDialog
        jDialogArticulos.setLocation(200, 100);
        //La hacemos modal
        jDialogArticulos.setModal(true);
        //Establecemos dimensiones.
        jDialogArticulos.setMinimumSize(new Dimension(747, 385));

        //Establecemos un título para el jDialog
        jDialogArticulos.setTitle("Lista de Artículos.");
        //La hacemos visible.
        jDialogArticulos.setVisible(true);
    }

    private void llamarCliente() {

        // llamada de datos
        queryCliente loadss = new queryCliente();
        loadss.CargarClientes();
        //Centramos nuestro jDialog
        jDialogCliente.setLocation(250, 150);
        //La hacemos modal
        jDialogCliente.setModal(true);
        //Establecemos dimensiones.
        jDialogCliente.setMinimumSize(new Dimension(530, 358));
        //Establecemos un título para el jDialog
        jDialogCliente.setTitle("Lista de Clientes.");
        //La hacemos visible.
        jDialogCliente.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogArticulos = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        SeleccionarArticulos = new javax.swing.JTable();
        btnSeleccionarArticulo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtParametroBusqueda = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jDialogCliente = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtParametroBusqueda3 = new javax.swing.JTextField();
        cbox = new javax.swing.JComboBox<>();
        btnSeleccionarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SeleccionarCliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextFieldValTotal = new javax.swing.JTextField();
        jTextFieldCant = new javax.swing.JTextField();
        jTextFieldNo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableArticulos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnClienteExistente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldCodFacturas = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldCodVendedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodArticulo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        xcant = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtArticulos = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        btnNuevoArticulo = new javax.swing.JButton();
        btnAgregarArticulo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        LabelCant = new javax.swing.JLabel();
        vendedors = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnQuitarArticulo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnRegistrarFactura = new javax.swing.JButton();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDescuento = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldGranTotal = new javax.swing.JTextField();
        btnGenerarTotal = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldIVA = new javax.swing.JTextField();

        SeleccionarArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(SeleccionarArticulos);

        btnSeleccionarArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSeleccionarArticulo.setForeground(new java.awt.Color(0, 102, 102));
        btnSeleccionarArticulo.setText("Seleccionar");
        btnSeleccionarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArticuloActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Buscar ");

        txtParametroBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtParametroBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtParametroBusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addGap(12, 12, 12)
                    .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21)
                        .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogArticulosLayout = new javax.swing.GroupLayout(jDialogArticulos.getContentPane());
        jDialogArticulos.getContentPane().setLayout(jDialogArticulosLayout);
        jDialogArticulosLayout.setHorizontalGroup(
            jDialogArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addGroup(jDialogArticulosLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 403, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDialogArticulosLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btnSeleccionarArticulo)
                .addGap(92, 92, 92)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogArticulosLayout.setVerticalGroup(
            jDialogArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeleccionarArticulo)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Buscar ");

        txtParametroBusqueda3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtParametroBusqueda3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtParametroBusqueda3KeyReleased(evt);
            }
        });

        cbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ced/RUC/Pasaporte", "Nombre", "Apellido" }));
        cbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtParametroBusqueda3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParametroBusqueda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSeleccionarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSeleccionarCliente.setForeground(new java.awt.Color(0, 102, 102));
        btnSeleccionarCliente.setText("Seleccionar");
        btnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClienteActionPerformed(evt);
            }
        });

        SeleccionarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(SeleccionarCliente);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogClienteLayout = new javax.swing.GroupLayout(jDialogCliente.getContentPane());
        jDialogCliente.getContentPane().setLayout(jDialogClienteLayout);
        jDialogClienteLayout.setHorizontalGroup(
            jDialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogClienteLayout.createSequentialGroup()
                .addGroup(jDialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogClienteLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnSeleccionarCliente)
                        .addGap(134, 134, 134)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogClienteLayout.setVerticalGroup(
            jDialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldValTotal.setEditable(false);
        jTextFieldValTotal.setEnabled(false);
        jTextFieldValTotal.setFocusable(false);
        jTextFieldValTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValTotalActionPerformed(evt);
            }
        });

        jTextFieldCant.setEditable(false);
        jTextFieldCant.setEnabled(false);
        jTextFieldCant.setFocusable(false);

        jTextFieldNo.setEditable(false);
        jTextFieldNo.setEnabled(false);
        jTextFieldNo.setFocusable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setPreferredSize(new java.awt.Dimension(454, 402));

        JTableArticulos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTableArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTableArticulos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTableArticulos.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane3.setViewportView(JTableArticulos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 552, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bolsa.png"))); // NOI18N
        jLabel1.setText("Registro de Ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 240, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos personales de Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombres");

        jTextFieldCodigoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoClienteKeyTyped(evt);
            }
        });

        jTextFieldNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreClienteKeyTyped(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID Cliente");

        btnClienteExistente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClienteExistente.setText("Cliente Existente");
        btnClienteExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteExistenteActionPerformed(evt);
            }
        });

        btnLimpiarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiarCliente.setText("Limpiar");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClienteExistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnClienteExistente))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCliente))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 450, 140));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 490, 10));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Factura y Artículos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCodFacturas.setEditable(false);
        jTextFieldCodFacturas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCodFacturas.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldCodFacturas.setEnabled(false);
        jPanel3.add(jTextFieldCodFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 96, -1));

        jTextFieldFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 94, -1));

        jTextFieldCodVendedor.setEditable(false);
        jTextFieldCodVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCodVendedor.setEnabled(false);
        jPanel3.add(jTextFieldCodVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Atendido por");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("No.");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Valor $");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        txtCodArticulo.setEditable(false);
        txtCodArticulo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodArticulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodArticuloActionPerformed(evt);
            }
        });
        jPanel3.add(txtCodArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Cantidad");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jTextFieldValor.setEditable(false);
        jTextFieldValor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, -1));

        xcant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xcant.setModel(new javax.swing.SpinnerNumberModel(1, 0, 30, 1));
        xcant.setToolTipText("");
        xcant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(xcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 47, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Código");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtArticulos.setEditable(false);
        txtArticulos.setBackground(new java.awt.Color(255, 255, 255));
        txtArticulos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 250, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 440, 10));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Fecha");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 20));

        btnNuevoArticulo.setText("Escoger Artículo");
        btnNuevoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoArticuloActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        btnAgregarArticulo.setText("Agregar");
        btnAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArticuloActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 14, 60, 70));

        LabelCant.setText("cant");
        jPanel3.add(LabelCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        vendedors.setText("Vendedor");
        jPanel3.add(vendedors, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Artículo");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btnQuitarArticulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnQuitarArticulo.setForeground(new java.awt.Color(255, 0, 0));
        btnQuitarArticulo.setText("Quitar Artículo");
        btnQuitarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarArticuloActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuitarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 510, 170));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, 370, -1));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(204, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, 30));

        btnRegistrarFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarFactura.setForeground(new java.awt.Color(0, 51, 51));
        btnRegistrarFactura.setText("Registrar Factura");
        btnRegistrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 160, 30));

        jTextFieldSubTotal.setEditable(false);
        jTextFieldSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSubTotal.setText("00.0");
        jTextFieldSubTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSubTotalKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 110, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Subtotal");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registradora.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 250));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Descuento");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        jTextFieldDescuento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldDescuento.setText("0");
        jTextFieldDescuento.setToolTipText("Se permite el ingreso de un valor o un porcentaje. Para porcentaje se debe incluir el símbolo. Ej. 20%");
        jTextFieldDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescuentoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 110, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Total a Pagar $");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, -1));

        jTextFieldGranTotal.setEditable(false);
        jTextFieldGranTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGranTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldGranTotal.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldGranTotal.setText("00.0");
        jTextFieldGranTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldGranTotalKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldGranTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 130, -1));

        btnGenerarTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGenerarTotal.setText("Generar Total");
        btnGenerarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 540, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("IVA");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        jTextFieldIVA.setEditable(false);
        jTextFieldIVA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldIVA.setText("0.0");
        jPanel1.add(jTextFieldIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteExistenteActionPerformed

        llamarCliente();
    }//GEN-LAST:event_btnClienteExistenteActionPerformed

    private void txtCodArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodArticuloActionPerformed

    private void btnNuevoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoArticuloActionPerformed
        llamarArticulos();
    }//GEN-LAST:event_btnNuevoArticuloActionPerformed


    public int verFamilia(int idArticulo)
   {
       PreparedStatement busqueda;
       ResultSet resul;
       int idasignar=0;
      Connection cone= Conexion.getConexion();
    
          try { 
              String sql = "SELECT FAM_ID FROM ARTICULOS WHERE ART_ID = ?";
              busqueda = cone.prepareStatement(sql);
              busqueda.setInt(1, idArticulo);
              resul=busqueda.executeQuery();
              while(resul.next())
              {
                idasignar = resul.getInt("FAM_ID");
              }
              resul.close();
              cone.close();
              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
          } 
//          System.out.println(stock);
          cone= Conexion.getConexion();
    
          try { 
              String sql = "SELECT IVA_ID FROM FAMILIASARTICULOS WHERE FAM_ID = ?";
              busqueda = cone.prepareStatement(sql);
              busqueda.setInt(1, idasignar);
              resul=busqueda.executeQuery();
              while(resul.next())
              {
                idasignar = resul.getInt("IVA_ID");
              }
              resul.close();
              cone.close();
              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
          } 
//          System.out.println(stock);
          cone= Conexion.getConexion();
    
          try { 
              String sql = "SELECT IVA_VALOR FROM IVA WHERE IVA_ID = ?";
              busqueda = cone.prepareStatement(sql);
              busqueda.setInt(1, idasignar);
              resul=busqueda.executeQuery();
              while(resul.next())
              {
                idasignar = resul.getInt("IVA_VALOR");
              }
              resul.close();
              cone.close();
              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
          } 
          
         System.out.println("idasignar " + idasignar);
       return idasignar;
   }  
    
//     public int verIDEmpleado(int idArticulo)
//   {
//       PreparedStatement busqueda;
//       ResultSet resul;
//       int stock=0;
//      Connection cone= Conexion.getConexion();
//    
//          try { 
//              String sql = "SELECT FAM_ID FROM ARTICULOS WHERE ART_ID = ?";
//              busqueda = cone.prepareStatement(sql);
//              busqueda.setInt(1, idArticulo);
//              resul=busqueda.executeQuery();
//              while(resul.next())
//              {
//                stock = resul.getInt("FAM_ID");
//              }
//              resul.close();
//              cone.close();
//              } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
//          } 
//        
//         System.out.println("stock " + stock);
//       return stock;
//   }  
    
      public int verStock(int idArticulo)
   {
       PreparedStatement busqueda;
       ResultSet resul;
       int stock=0;
      Connection cone= Conexion.getConexion();
    
          try { 
              String sql = "SELECT ART_STOCK FROM ARTICULOS WHERE ART_ID = ?";
              busqueda = cone.prepareStatement(sql);
              busqueda.setInt(1, idArticulo);
              resul=busqueda.executeQuery();
              while(resul.next())
              {
                stock = resul.getInt("ART_STOCK");
              }
              resul.close();
              cone.close();
              } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + ex);
            JOptionPane.showMessageDialog(null, "No ha sido posible obtener el stock del articulo");
          } 
        
         System.out.println("stock " + stock);
       return stock;
   }  
     
    private void btnAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArticuloActionPerformed

        
        try {
            if ((int) xcant.getValue() == 0) {
                JOptionPane.showMessageDialog(null, "Debe agregar por lo menos un artículo");
            } else {
                
                int stock = verStock(Integer.parseInt(txtCodArticulo.getText()));
                
                n = 1 + n;
                jTextFieldNo.setText(String.valueOf(n));
                // leer la cantidad pedidas
                int cant = (Integer) xcant.getValue();
                //problema de obtener valor de spinner toca dar vuelta
                jTextFieldCant.setText(String.valueOf(cant));

                double a = Double.parseDouble(jTextFieldValor.getText());
                int b = Integer.parseInt(jTextFieldCant.getText());
                // Calcular la cantidad por valor
                double valTotal = a * b;

                valTotal = DosDecimales(valTotal);

                //Agregar datos a la tabla
                String datos[] = new String[6];
                datos[0] = jTextFieldNo.getText();
                datos[1] = txtCodArticulo.getText();
                datos[2] = txtArticulos.getText();
                datos[3] = jTextFieldCant.getText();
                datos[4] = jTextFieldValor.getText();
                datos[5] = String.valueOf(valTotal);
                modelo.addRow(datos);

                totals = Double.parseDouble(jTextFieldSubTotal.getText());
                totals += valTotal;

                totals = DosDecimales(totals);

                jTextFieldSubTotal.setText(String.valueOf(totals));
                int aux = 0, subIVA = 0;
                double valor = 0, iva = 0;
                aux = Integer.parseInt(txtCodArticulo.getText());
                System.out.println("aux " + aux);
                subIVA = verFamilia(aux);
                System.out.println("iva" + subIVA);
                valor = valTotal * (subIVA*0.01);
                iva = Double.parseDouble(jTextFieldIVA.getText()) + valor;
                iva = DosDecimales(iva);
                
                jTextFieldIVA.setText(String.valueOf(iva));
                
            }
            xcant.setValue(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor escoja primero un artículo");
        }

    }//GEN-LAST:event_btnAgregarArticuloActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

    }//GEN-LAST:event_jLabel15MouseClicked

    private void btnQuitarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarArticuloActionPerformed
        // TODO add your handling code here:

        // seleccion la fila
        int i = JTableArticulos.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
        } else//de lo contrario si se selecciono la fila
        {
            // coje variable de valTotal que elimino
            String nums = (String) JTableArticulos.getValueAt(i, 5);
            double restar = Double.parseDouble(nums);

             int aux = 0, subIVA = 0;
                double valor = 0, iva = 0;
                aux = Integer.parseInt(txtCodArticulo.getText());
                System.out.println("aux " + aux);
                subIVA = verFamilia(aux);
                System.out.println("iva" + subIVA);
                valor = Double.parseDouble(nums) * (subIVA*0.01);
                iva = Double.parseDouble(jTextFieldIVA.getText()) - valor;
                iva = DosDecimales(iva);
                
                jTextFieldIVA.setText(String.valueOf(iva));
            
            // cambiarlo de subtotalas que va eliminar
            // sumar total
            totals = Double.parseDouble(jTextFieldSubTotal.getText());
            totals -= restar;
            totals = DosDecimales(totals);
            jTextFieldSubTotal.setText(String.valueOf(totals));
            
            
            
            

            // eliminar fila
            this.modelo.removeRow(i);
            // restar un aticulos
            n = n - 1;
            // poner nuevo ciclo
            int num = 1;
            for (int w = 0; w < n; w = w + 1) {
                //agregado de nuevo
                JTableArticulos.setValueAt(num, w, 0);
                num = num + 1;
            }

        }
    }//GEN-LAST:event_btnQuitarArticuloActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFacturaActionPerformed

        //PARA DETERMINAR SI ES CLIENTE EXISTENTE O NO
        if (ClienteExistente.equals("si")) {
            JOptionPane.showMessageDialog(null, "Cliente existente");
            GenerarFactura();

        } //sino agregado cliente existente entonces lo guarda nuevo cliente
        else {
            // registrar bd a la tabla de cliente
            // obtener datos
            if (jTextFieldCodigoCliente.getText().equals("")
                    || jTextFieldNombreCliente.getText().equals("")
                    || jTextFieldApellido.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Datos de cliente no válidos");
            } else {
                if (GenerarFactura()) {
                    try {
                        String cedula = jTextFieldCodigoCliente.getText();
                        String nombre = jTextFieldNombreCliente.getText();
                        String apellido = jTextFieldApellido.getText();
                        queryCliente add = new queryCliente();
                        // enviar datos a regristar en el querycliente
                        add.agregarCliente(cedula, nombre, apellido);

                    } catch (Exception e) {
                        System.out.println("Error interno");
                    }
                }

            }
        }

    }//GEN-LAST:event_btnRegistrarFacturaActionPerformed

    
    
    public boolean GenerarFactura() {
        // TODO add your handling code here:
        // conectar
        boolean ident = true;
        Connection reg = conectar.getConexion();
        // registro de BD a la tabla de Facturas
        if (Double.parseDouble(jTextFieldSubTotal.getText()) == 0
                || Double.parseDouble(jTextFieldIVA.getText()) == 0
                || Double.parseDouble(jTextFieldGranTotal.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Datos Incompletos. Factura no generada");
            ident=false;
        } else {

            String sql_Facturas = "INSERT INTO facturas (fac_id,cli_identificador,cue_cuenta, fac_fecha,fac_descuento,fac_estado,fac_total)VALUES (?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst = reg.prepareStatement(sql_Facturas);
                pst.setString(1, jTextFieldCodFacturas.getText());
                pst.setString(2, jTextFieldCodigoCliente.getText());
                pst.setString(3, jTextFieldCodVendedor.getText());
                pst.setString(4, jTextFieldFecha.getText());
                pst.setString(5, jTextFieldDescuento.getText());
                pst.setString(6, "0");
                pst.setString(7, jTextFieldGranTotal.getText());
                int ns = pst.executeUpdate();
                if (ns > 0) {
                    JOptionPane.showMessageDialog(null, "Factura Registrada Exitosamente");
                }
                GuardarArticulos();
                GenerarPDF();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Datos de vendedor incorrectos");
//            Logger.getLogger(VentasNew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ident;
    }

    public void GuardarArticulos(){
        
        Connection cone = Conexion.getConexion();
         for (int w = 0; w < n; w = w + 1) {
            //obteniendo valor fila por columna a la vez y w es fila y n es total de articulos comprados
            
            String col1 = (String) JTableArticulos.getValueAt(w, 1);// codigo articulo
            String col2 = (String) JTableArticulos.getValueAt(w, 3);// cantidad articulos
            String col3 = (String) JTableArticulos.getValueAt(w, 5);// costo

            String sql_Ventas = "INSERT INTO detalle (FAC_ID,ART_ID,DET_CANTIDAD,DET_VALOR)VALUES (?,?,?,?)";
            try {
                PreparedStatement pst = cone.prepareStatement(sql_Ventas);
                pst.setString(1, jTextFieldCodFacturas.getText());
                pst.setString(2, col1);
                pst.setString(3, col2);
                pst.setString(4, col3);
                int ns = pst.executeUpdate();
                if (ns > 0) {

                    System.out.println("Registrado Exitosamente en Detalle de Facturas: " + col1);
                }
                cone.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error - " + ex);
                //Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
     public void GenerarPDF() {
        
        Image portada;

        
        Document document = new Document(PageSize.LETTER, 50, 50, 50, 50);

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("facturas/" + jTextFieldCodFacturas.getText() + ".pdf"));
            document.open();

            portada = Image.getInstance("portada.jpg");
            portada.setAlignment(Element.ALIGN_CENTER);
            portada.scalePercent(45f);// tamaño de imagen
            float totales=Float.parseFloat(jTextFieldGranTotal.getText());
            document.add(portada);
            document.add(new Paragraph("---------------------------------------------------------"));
            document.add(new Paragraph("|   FACTURA PAPELERIA FARFARELA   |"));
            document.add(new Paragraph("---------------------------------------------------------"));
            document.add(new Paragraph("Numero Fact. : " + jTextFieldCodFacturas.getText()));
            document.add(new Paragraph("Cliente : " + jTextFieldNombreCliente.getText() + " " + jTextFieldApellido.getText() + " - ID : " + jTextFieldCodigoCliente.getText()));
            document.add(new Paragraph("Atendido por : " + verEmpleado(jTextFieldCodVendedor.getText())));
            document.add(new Paragraph("Fecha   : [ " + jTextFieldFecha.getText() )); 
            document.add(new Paragraph( " TOTAL A PAGAR : $ " + totales + "  dólares"));
            
            document.add(new Paragraph("| No. |  CODIGO  | ARTICULOS                                      | CANTIDAD | VAL UNIT | SUBTOTAL"));
            document.add(new Paragraph("-----------------------------------------------------------------------"
                    + "--------------------------------------------------------"));

            // parte de dibujo la tabla
            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate tp = cb.createTemplate(900, 500);
            Graphics2D g2;
            g2 = tp.createGraphicsShapes(900, 500);
            // g2 = tp.createGraphics(500, 500);
            
            JTableArticulos.print(g2);
            ///////IMPRIME
              
            g2.dispose();
            //posicion de la tabla de lista de compras
            cb.addTemplate(tp, 50, -85);
              //cierra el documento
            document.close();
          
            JOptionPane.showMessageDialog(null, "PDF Generado Exitosamente.");
            try {
                File path = new File("facturas/" + jTextFieldCodFacturas.getText() + ".pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El archivo no existe o está actualmente en uso.");
        }
    }

    private void btnSeleccionarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArticuloActionPerformed
        // boton de selecciona productos
        int i = SeleccionarArticulos.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
        } else//de lo contrario si se selecciono la fila
        {
            // obtener valor de tabla por columna y enviar datos a texfield
            txtCodArticulo.setText(String.valueOf(SeleccionarArticulos.getValueAt(i, 0)));
            txtArticulos.setText(String.valueOf(SeleccionarArticulos.getValueAt(i, 1)));
            jTextFieldValor.setText(String.valueOf(SeleccionarArticulos.getValueAt(i, 3)));
            jDialogArticulos.dispose();
        }

    }//GEN-LAST:event_btnSeleccionarArticuloActionPerformed

    private void jTextFieldValTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValTotalActionPerformed

    private void btnGenerarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTotalActionPerformed
//        int aux=0, subIVA =0;
//        aux = Integer.parseInt(txtCodArticulo.getText());
//        System.out.println("aux " +aux);
//        subIVA = verFamilia(aux);
//        System.out.println("subIVA" + subIVA);
        String desc = jTextFieldDescuento.getText();
        double descuento = 0, granTotal = 0, subtotal = Double.parseDouble(jTextFieldSubTotal.getText());
        double porcentaje = 0;
        if (desc.contains("%")) {
            desc = EliminaCaracteres(desc, "%");
            porcentaje = Double.parseDouble(desc);
            System.out.println("Desc: " + porcentaje);
            descuento = (subtotal * porcentaje) / 100;
            System.out.println("Descuento: " + descuento);
        } else {
            descuento = Double.parseDouble(desc);
            //    System.out.println("Descuento: " + descuento);
        }

        descuento = DosDecimales(descuento);

        jTextFieldDescuento.setText(String.valueOf(descuento));
        if (descuento > subtotal) {
        JOptionPane.showMessageDialog(null, "El descuento es mayor que el costo");
        } else {
            subtotal = Double.parseDouble(jTextFieldSubTotal.getText()) - descuento;

            //double subIVA = subtotal ;
            //subIVA = DosDecimales(subIVA);
            //jTextFieldIVA.setText(String.valueOf(subIVA));
            double subIVA = Double.parseDouble(jTextFieldIVA.getText());
            granTotal = subtotal + subIVA;
            granTotal = DosDecimales(granTotal);
            jTextFieldGranTotal.setText(String.valueOf(granTotal));
        }
    }//GEN-LAST:event_btnGenerarTotalActionPerformed

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

    private void btnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarClienteActionPerformed

        // boton de seleccionado
        int i = SeleccionarCliente.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
        } else//de lo contrario si se selecciono la fila 
        {
            ClienteExistente = "si";
            // obtener valor de tabla por columna y enviar datos a texfield
            jTextFieldCodigoCliente.setText(String.valueOf(SeleccionarCliente.getValueAt(i, 0)));
            jTextFieldNombreCliente.setText(String.valueOf(SeleccionarCliente.getValueAt(i, 1)));
            jTextFieldApellido.setText(String.valueOf(SeleccionarCliente.getValueAt(i, 2)));
            jTextFieldCodigoCliente.setEditable(false);
            jTextFieldNombreCliente.setEditable(false);
            jTextFieldApellido.setEditable(false);
            jDialogCliente.dispose();
        }


    }//GEN-LAST:event_btnSeleccionarClienteActionPerformed

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed

        jTextFieldCodigoCliente.setText("");
        jTextFieldNombreCliente.setText("");
        jTextFieldApellido.setText("");
        jTextFieldCodigoCliente.setEditable(true);
        jTextFieldNombreCliente.setEditable(true);
        jTextFieldApellido.setEditable(true);
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialogCliente.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDialogArticulos.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldCodigoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoClienteKeyTyped

        char car = evt.getKeyChar();
        if ((((int) car >= 1 && (int) car <= 47)) || (((int) car >= 58 && (int) car <= 500))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCodigoClienteKeyTyped

    private void jTextFieldNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreClienteKeyTyped
        
        char car = evt.getKeyChar();
        if ((((int) car >= 1 && (int) car <= 31))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreClienteKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped

        char car = evt.getKeyChar();
        if ((((int) car >= 1 && (int) car <= 31))) {
            evt.consume();
        }


    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void txtParametroBusqueda3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametroBusqueda3KeyReleased

        queryCliente qc = new queryCliente();
        String parametroBusqueda = txtParametroBusqueda3.getText();
        qc.buscarCliente(parametroBusqueda, ced, nom, ape);


    }//GEN-LAST:event_txtParametroBusqueda3KeyReleased

    private void cboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxItemStateChanged

        item = cbox.getSelectedIndex();
        if (item == 0) {
            ced = true;
            nom = false;
            ape = false;
        } else if (item == 1) {
            ced = false;
            nom = true;
            ape = false;
        } else if (item == 2) {
            ced = false;
            nom = false;
            ape = true;
        }

        System.out.println(item);
        System.out.println(String.valueOf(ced));
        System.out.println(String.valueOf(nom));
        System.out.println(String.valueOf(ape));

    }//GEN-LAST:event_cboxItemStateChanged

    private void txtParametroBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametroBusquedaKeyReleased

        queryArticulo cc = new queryArticulo();
        String parametroBusqueda = txtParametroBusqueda.getText();
        cc.buscarArticulosparaVentas(parametroBusqueda);


    }//GEN-LAST:event_txtParametroBusquedaKeyReleased

    private void jTextFieldSubTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSubTotalKeyTyped

        double val = Double.parseDouble(jTextFieldSubTotal.getText());

        val = (double) (val * 100) / 100;
        jTextFieldSubTotal.setText(String.valueOf(val));
    }//GEN-LAST:event_jTextFieldSubTotalKeyTyped

    private void jTextFieldDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescuentoKeyTyped

        char car = evt.getKeyChar();
        if ((((int) car >= 1 && (int) car <= 36)) || (((int) car >= 38 && (int) car <= 45)) || (((int) car == 47)) || (((int) car >= 58 && (int) car <= 500))) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextFieldDescuentoKeyTyped

    private void jTextFieldGranTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGranTotalKeyTyped

        double val1 = Double.parseDouble(jTextFieldGranTotal.getText());

        val1 = (double) (val1 * 100) / 100;
        jTextFieldGranTotal.setText(String.valueOf(val1));

    }//GEN-LAST:event_jTextFieldGranTotalKeyTyped

    private void jTextFieldNombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreClienteKeyReleased

        jTextFieldNombreCliente.setText(jTextFieldNombreCliente.getText().toUpperCase());

    }//GEN-LAST:event_jTextFieldNombreClienteKeyReleased

    private void jTextFieldApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyReleased

        jTextFieldApellido.setText(jTextFieldApellido.getText().toUpperCase());

    }//GEN-LAST:event_jTextFieldApellidoKeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentasNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentasNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentasNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentasNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentasNew().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable JTableArticulos;
    private javax.swing.JLabel LabelCant;
    public static javax.swing.JTable SeleccionarArticulos;
    public static javax.swing.JTable SeleccionarCliente;
    private javax.swing.JButton btnAgregarArticulo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnClienteExistente;
    private javax.swing.JButton btnGenerarTotal;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnNuevoArticulo;
    private javax.swing.JButton btnQuitarArticulo;
    private javax.swing.JButton btnRegistrarFactura;
    private javax.swing.JButton btnSeleccionarArticulo;
    private javax.swing.JButton btnSeleccionarCliente;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    public static javax.swing.JDialog jDialogArticulos;
    private javax.swing.JDialog jDialogCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCant;
    private javax.swing.JTextField jTextFieldCodFacturas;
    private javax.swing.JTextField jTextFieldCodVendedor;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldDescuento;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldGranTotal;
    private javax.swing.JTextField jTextFieldIVA;
    private javax.swing.JTextField jTextFieldNo;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldValTotal;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField txtArticulos;
    private javax.swing.JTextField txtCodArticulo;
    private javax.swing.JTextField txtParametroBusqueda;
    private javax.swing.JTextField txtParametroBusqueda3;
    private javax.swing.JLabel vendedors;
    private javax.swing.JSpinner xcant;
    // End of variables declaration//GEN-END:variables
}
