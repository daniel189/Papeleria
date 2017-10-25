/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Empleado;


import MODELO.Conexion;
import MODELO.queryEmpleados;
import MODELO.queryProveedores;
import VistasUsuarios.*;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Crispin
 */
public class Datos2 extends javax.swing.JDialog {

    /**
     * Creates new form UsuariosNew
     */
    private int opcion;

    public Datos2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);
        validacion1.setVisible(false);
        validacion2.setVisible(false);
        validacion3.setVisible(false);
        validacion4.setVisible(false);
        validacion5.setVisible(false);
        validacion6.setVisible(false);
        claveMax();

//Hint();
    }

    public final void claveMax() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/farfarela", "ECUATORIANO16", "root");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select max(emp_id)+1 FROM EMPLEADO");
            if (registro.next() == true) {
                if (registro.getString("max(emp_id)+1") == null) {
                    txtCodigo.setText("1");
                } else {
                    txtCodigo.setText(registro.getString("max(EMP_id)+1"));
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public final void Hint() {
        PlaceHolder holder;
        holder = new PlaceHolder(txtIdentificador, "Ruc");
        holder = new PlaceHolder(txtNombres, "Nombre del empleado");
        holder = new PlaceHolder(txtApellidos, "Apellido del empleado");
        holder = new PlaceHolder(txtTelefono, "Telefono del empleado");
        holder = new PlaceHolder(txtDireccion, "Direccion del empleado");
        holder = new PlaceHolder(txtObservacion, "Observaciones");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Conexion conectar = new Conexion();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextFieldParametroBusqueda = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextFieldParametroBusqueda1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        validacion1 = new javax.swing.JLabel();
        validacion2 = new javax.swing.JLabel();
        validacion3 = new javax.swing.JLabel();
        validacion4 = new javax.swing.JLabel();
        validacion5 = new javax.swing.JLabel();
        validacion6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/equipo.png"))); // NOI18N
        lblEstado.setText("Empleado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Apellidos:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Identificador:");

        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Direccion:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-usuario.png"))); // NOI18N

        txtIdentificador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificadorKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Observación:");

        txtObservacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Telefono:");
        jLabel8.setToolTipText("");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Fecha de Ingreso:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Fecha de Nacimiento:");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.setEnabled(false);

        jDateChooser.setDateFormatString("yyyy-MM-dd");
        jDateChooser.setMaxSelectableDate(new java.util.Date(253370786517000L));

        jTextFieldParametroBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldParametroBusqueda.setSize(new java.awt.Dimension(10, 10));
        jTextFieldParametroBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParametroBusquedaActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setMaxSelectableDate(new java.util.Date(253370786517000L));

        jTextFieldParametroBusqueda1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldParametroBusqueda1.setSize(new java.awt.Dimension(10, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Cargo:");

        cmbCargo.setEditable(true);
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Bodeguero" }));
        cmbCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbCargoKeyTyped(evt);
            }
        });

        validacion1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validacion1.setText("Requerido");

        validacion2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validacion2.setText("Requerido");

        validacion3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validacion3.setText("Requerido");

        validacion4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validacion4.setText("Requerido");

        validacion5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validacion5.setText("Requerido");

        validacion6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validacion6.setText("Requerido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldParametroBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombres)
                                .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnGuardar)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validacion4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validacion3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validacion2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validacion1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validacion5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validacion6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstado)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validacion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validacion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validacion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validacion4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validacion5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(validacion6))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldParametroBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void Llenar(String cod, String ident, String nombres, String apellidos, String direccion, String telefono, String cargo, String observacion, String fnacimiento, String fingreso) throws ParseException {

        java.util.Date date = new SimpleDateFormat("yyyy-mm-dd").parse(fnacimiento);
        java.util.Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(fingreso);

        txtCodigo.setText(cod);
        txtIdentificador.setText(ident);
        txtNombres.setText(nombres);
        txtApellidos.setText(apellidos);
        txtDireccion.setText(direccion);
        txtTelefono.setText(telefono);
        cmbCargo.setSelectedItem(cargo);
        txtObservacion.setText(observacion);
        //Date add=registro.getDate("EMP_FECHANACIMIENTO");
        jDateChooser.setDate(date);
        jDateChooser1.setDate(date1);

    }

    public final void Desabilitar() {
        lblEstado.setText("Empleado - Ver");
        txtCodigo.setEnabled(false);
        txtIdentificador.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cmbCargo.setEnabled(false);
        txtObservacion.setEnabled(false);
        jDateChooser.setEnabled(false);
        jDateChooser1.setEnabled(false);
        btnCancelar.setVisible(false);
        btnGuardar.setVisible(false);

    }

    public void Limpiar() throws ParseException {
        String fnacimiento = "";
        String fingreso = "";
//        java.util.Date date = new SimpleDateFormat("yyyy-mm-dd").parse(fnacimiento);
        //      java.util.Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(fingreso);
        txtCodigo.setText("");
        txtIdentificador.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cmbCargo.setSelectedItem("");
        txtObservacion.setText("");
        //Date add=registro.getDate("EMP_FECHANACIMIENTO");
        //jDateChooser.setDateFormatString("");
        //jDateChooser1.setDateFormatString("");

    }
    int cont = 0;

    public void validarCamposVacios() {
        if (txtIdentificador.getText().equals("")) {
            validacion1.setVisible(true);
            validacion1.setForeground(Color.red);
            cont++;
        } else {
            validacion1.setVisible(false);
        }
        if (txtNombres.getText().equals("")) {
            validacion2.setVisible(true);
            validacion2.setForeground(Color.red);
            cont++;
        } else {
            validacion2.setVisible(false);
        }
        if (txtApellidos.getText().equals("")) {
            validacion3.setVisible(true);
            validacion3.setForeground(Color.red);
            cont++;
        } else {
            validacion3.setVisible(false);
        }
        if (txtDireccion.getText().equals("")) {
            validacion4.setVisible(true);
            validacion4.setForeground(Color.red);
            cont++;
        } else {
            validacion4.setVisible(false);
        }
        if (txtTelefono.getText().equals("")) {
            validacion5.setVisible(true);
            validacion5.setForeground(Color.red);
            cont++;
        } else {
            validacion5.setVisible(false);
        }
        if (cmbCargo.getSelectedItem().equals("")) {
            validacion6.setVisible(true);
            validacion6.setForeground(Color.red);
            cont++;
        } else {
            validacion6.setVisible(false);
        }

    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cont = 0;
        queryEmpleados qe = new queryEmpleados();
        Connection reg = conectar.getConexion();
        validarCamposVacios();

        if (cont == 0) {
            if (this.opcion == 1) {
                String parametroBusqueda, parametroBusqueda1;
                String sql = "INSERT INTO EMPLEADO (EMP_ID,EMP_IDENTIFICADOR,EMP_NOMBRES,EMP_APELLIDOS,EMP_DIRECCION,EMP_TELEFONO,EMP_CARGO,EMP_OBSERVACION,EMP_FECHANACIMIENTO,EMP_FECHAINGRESO)VALUES (?,?,?,?,?,?,?,?,?,?)";

                try {

                    String formato = jDateChooser.getDateFormatString();
                    java.util.Date date = jDateChooser.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat(formato);
                    jTextFieldParametroBusqueda.setText(String.valueOf(sdf.format(date)));
                    parametroBusqueda = jTextFieldParametroBusqueda.getText();

                    PreparedStatement pst = reg.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(txtCodigo.getText()));
                    pst.setString(2, txtIdentificador.getText());
                    pst.setString(3, txtNombres.getText());
                    pst.setString(4, txtApellidos.getText());
                    pst.setString(5, txtDireccion.getText());
                    pst.setString(6, txtTelefono.getText());
                    pst.setString(7, cmbCargo.getSelectedItem().toString());
                    pst.setString(8, txtObservacion.getText());
                    pst.setString(9, parametroBusqueda);

                    String formato1 = jDateChooser1.getDateFormatString();
                    java.util.Date date1 = jDateChooser1.getDate();
                    SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                    jTextFieldParametroBusqueda1.setText(String.valueOf(sdf1.format(date1)));
                    parametroBusqueda1 = jTextFieldParametroBusqueda1.getText();

                    pst.setString(10, parametroBusqueda1);
                    if (qe.buscarRepetido(txtIdentificador.getText()) == false) {
                        int n = pst.executeUpdate();
                        if (n > 0) {
                            //JOptionPane.showMessageDialog(null, "Ingreso correcto");

                            qe.actualizarTabla();
                            Limpiar();
                            claveMax();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Error Registro duplicado");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error - " + ex);
                    Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (opcion == 2) {
                queryEmpleados change = new queryEmpleados();
                String formato = jDateChooser.getDateFormatString();
                java.util.Date date = jDateChooser.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                //String pam1=
                //jTextFieldParametroBusqueda.setText(String.valueOf(sdf.format(date)));

                int code = Integer.parseInt(txtCodigo.getText());
                String identificador = txtIdentificador.getText();
                String nombres = txtNombres.getText();
                String apellidos = txtApellidos.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();
                String cargo = cmbCargo.getSelectedItem().toString();
                String observacion = txtObservacion.getText();
                String fechaN = String.valueOf(sdf.format(date));
                //////// java.util.Date fechaN= jDateChooser.getDate();
                //System.out.println(nombres+apellidos+direccion+telefono);

                //Para la fechaIng
                String formato1 = jDateChooser1.getDateFormatString();
                java.util.Date date1 = jDateChooser1.getDate();
                SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                //jTextFieldParametroBusqueda1.setText(String.valueOf(sdf1.format(date1)));
                //String fechaI=jTextFieldParametroBusqueda1.getText();
                //java.util.Date fechaI= jDateChooser1.getDate();
                String fechaI = String.valueOf(sdf1.format(date1));
                //Date fNacimiento = Date.valueOf(txtNombres.getText());
                //Date fIngreso = Date.valueOf(txtNombres.getText());

                change.modificarEmpleado(code, identificador, nombres, apellidos, direccion, telefono, cargo, observacion, fechaN, fechaI);
                try {
                    qe.actualizarTabla();
                    dispose();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextFieldParametroBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParametroBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParametroBusquedaActionPerformed

    private void txtIdentificadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorKeyTyped
        char C = evt.getKeyChar();
        if (Character.isLetter(C)) {

            evt.consume();
            txtIdentificador.setCursor(null);

        }
    }//GEN-LAST:event_txtIdentificadorKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char C = evt.getKeyChar();
        if (Character.isLetter(C)) {

            evt.consume();
            txtTelefono.setCursor(null);

        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char C = evt.getKeyChar();
        if (Character.isDigit(C)) {

            evt.consume();
            txtNombres.setCursor(null);

        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char C = evt.getKeyChar();
        if (Character.isDigit(C)) {
            evt.consume();
            txtApellidos.setCursor(null);

        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void cmbCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCargoKeyTyped
        char C = evt.getKeyChar();
        if (Character.isDigit(C)) {

            evt.consume();
            cmbCargo.setCursor(null);

        }
    }//GEN-LAST:event_cmbCargoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Datos2 dialog = new Datos2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbCargo;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldParametroBusqueda;
    private javax.swing.JTextField jTextFieldParametroBusqueda1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel validacion1;
    private javax.swing.JLabel validacion2;
    private javax.swing.JLabel validacion3;
    private javax.swing.JLabel validacion4;
    private javax.swing.JLabel validacion5;
    private javax.swing.JLabel validacion6;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the opcion
     */
    public int getOpcion() {
        return opcion;
    }

    /**
     * @param opcion the opcion to set
     */
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
}
