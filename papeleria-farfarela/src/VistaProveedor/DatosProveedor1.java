/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProveedor;

import MODELO.Conexion;
import MODELO.QueryProveedor;
import Vista.HomeAplicativo;
import static Vista.HomeAplicativo.escritorio;
import VistasUsuarios.*;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Roger
 */
public class DatosProveedor1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form UsuariosNew
     */
    //queryProveedores qp = new queryProveedores();
    private int opcion;
    private String cod;
    private String idt;
    private String rsocial;
    private String telf;
    private String contacto;
    private String tcontc;
    private String direcc;
    Connection conectar = new Connection();
    public DatosProveedor1() {
        initComponents();

        claveMax();
        //Hint();
        validacion1.setVisible(false);
        validacion2.setVisible(false);
        validacion3.setVisible(false);
        validacion4.setVisible(false);

    }

    public void claveMax() {
        try {
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/farfarela", "ECUATORIANO16", "root");
            Connection conexion = Connection.getConexion();
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select max(pro_id)+1 from proveedor");
            //ResultSet registro = comando.executeQuery("select count(*) from proveedor");
            if (registro.next() == true) {
                if (registro.getString("max(pro_id)+1") == null) {
                    txtCodigo.setText("1");
                } else {
                    txtCodigo.setText(registro.getString("max(pro_id)+1"));
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
        holder = new PlaceHolder(txtRazonSocial, "Nombre de la empresa");
        holder = new PlaceHolder(txtContacto, "Representante legal");
        holder = new PlaceHolder(txtDireccion, "Direccion de la empresa");
        holder = new PlaceHolder(txtTelefono, "Telefono de la empresa");
        holder = new PlaceHolder(txtTelefonoContacto, "Telefono del representante");
    }

 

    public DatosProveedor1(String cod, String idt, String rsocial, String telf, String contacto, String tcontc, String direcc) {
        /*this.cod=cod;
        this.idt=idt;
        this.rsocial=rsocial;
        this.telf=telf;
        this.contacto=contacto;
        this.tcontc=tcontc;
        this.direcc=direcc;*/
        JOptionPane.showMessageDialog(null, "PROVEEDOR SELECCIONADO:" + cod);
        //Llenar(cod, idt, rsocial, telf, contacto, tcontc, direcc);

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
        if (txtRazonSocial.getText().equals("")) {
            validacion2.setVisible(true);
            validacion2.setForeground(Color.red);
            cont++;
        } else {
            validacion2.setVisible(false);
        }
        if (txtTelefono.getText().equals("")) {
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
    }

    public final void Llenar(String cod, String idt, String rsocial, String telf, String contacto, String tcontc, String direcc) {
        txtCodigo.setText(cod);
        txtIdentificador.setText(idt);
        txtRazonSocial.setText(rsocial);
        txtTelefono.setText(telf);
        txtContacto.setText(contacto);
        txtTelefonoContacto.setText(tcontc);
        txtDireccion.setText(direcc);
    }

    public final void Deshabilitar() {
        lblEstado.setText("Proveedor - Nuevo");
        txtCodigo.setEnabled(false);
        txtIdentificador.setEnabled(false);
        txtRazonSocial.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtContacto.setEnabled(false);
        txtTelefonoContacto.setEnabled(false);
        txtDireccion.setEnabled(false);
        btnCancelar.setVisible(true);
        btnGuardar.setVisible(false);
    }

    public void Limpiar() {
        txtCodigo.setText("");
        txtIdentificador.setText("");
        txtRazonSocial.setText("");
        txtTelefono.setText("");
        txtContacto.setText("");
        txtTelefonoContacto.setText("");
        txtDireccion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefonoContacto = new javax.swing.JTextField();
        validacion1 = new javax.swing.JLabel();
        validacion2 = new javax.swing.JLabel();
        validacion3 = new javax.swing.JLabel();
        validacion4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/equipo.png"))); // NOI18N
        lblEstado.setText("Proveedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Razon Social:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Contacto:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Identificador:");

        txtRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtContacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Direccion:");

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
        txtIdentificador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificadorFocusLost(evt);
            }
        });
        txtIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificadorKeyTyped(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Telefono:");
        jLabel8.setToolTipText("");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Telefono Contacto:");
        jLabel12.setToolTipText("");

        txtTelefonoContacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefonoContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoContactoKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRazonSocial)
                                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(validacion1)
                                    .addComponent(validacion2)
                                    .addComponent(validacion3))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(validacion4)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validacion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validacion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validacion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(validacion4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(374, 374, 374))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cont = 0;
        QueryProveedor queryE = new QueryProveedor();
        validarCamposVacios();
        if (cont == 0) {
            Connection reg = conectar.getConexion();
            if (this.opcion == 1) {
                lblEstado.setText("Proveedor - Nuevo");
                String sql = "INSERT INTO PROVEEDOR (PRO_ID,PRO_IDENTIFICADOR,PRO_RAZONSOCIAL,PRO_TELEFONO ,PRO_CONTACTO ,PRO_TELEFONOCONTACTO,PRO_DIRECCION)VALUES (?,?,?,?,?,?,?)";
                try {

                    PreparedStatement pst = reg.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(txtCodigo.getText()));
                    pst.setString(2, txtIdentificador.getText());
                    pst.setString(3, txtRazonSocial.getText());
                    pst.setString(4, txtTelefono.getText());
                    pst.setString(5, txtContacto.getText());
                    pst.setString(6, txtTelefonoContacto.getText());
                    pst.setString(7, txtDireccion.getText());
                    if (queryE.buscarRepetido(txtIdentificador.getText()) == false) {
                        int n = pst.executeUpdate();
                        if (n > 0) {
                            queryE.actualizarTabla();
                            Limpiar();
                            claveMax();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro duplicado");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error - " + ex);
                    Logger.getLogger(DatosProveedor1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (this.opcion == 2) {
                lblEstado.setText("Proveedor - Modificar");
                QueryProveedor change = new QueryProveedor();
                int code = Integer.parseInt(txtCodigo.getText());
                String identificador = txtIdentificador.getText();
                String razonSocial = txtRazonSocial.getText();
                String telefono = txtTelefono.getText();
                String contacto1 = txtContacto.getText();
                String telefonoContacto = txtTelefonoContacto.getText();
                String direccion = txtDireccion.getText();
                change.modificarProveedor(code, identificador, razonSocial, telefono, contacto1, telefonoContacto, direccion);
                try {
                    queryE.actualizarTabla();
                    dispose();
                } catch (Exception e) {
                }
            } else if (opcion == 3) {

            }
        }//fin contador
        //qp.listarTodosProveedores();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        ProveedorPrincipal1 proveedor=new ProveedorPrincipal1();
        HomeAplicativo.escritorio.add(proveedor);
            proveedor.toFront();
             //Para centrar la ventana abierta
            Dimension dimension = escritorio.getSize();
            Dimension FrameSize = proveedor.getSize();
            proveedor.setLocation((dimension.width - FrameSize.width) / 2, (dimension.height - FrameSize.height) / 2);
            //
            proveedor.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIdentificadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {

            evt.consume();
            txtIdentificador.setCursor(null);

        }
    }//GEN-LAST:event_txtIdentificadorKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {

            evt.consume();
            txtTelefono.setCursor(null);

        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoContactoKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {

            evt.consume();
            txtTelefonoContacto.setCursor(null);

        }
    }//GEN-LAST:event_txtTelefonoContactoKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
         char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)) {

            evt.consume();
            txtContacto.setCursor(null);

        }
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtIdentificadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificadorFocusLost
         QueryProveedor queryE = new QueryProveedor();
        if (txtIdentificador.getText().length() > 0) {
            queryE.validarDocumento(txtIdentificador);
        }
    }//GEN-LAST:event_txtIdentificadorFocusLost
    

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoContacto;
    private javax.swing.JLabel validacion1;
    private javax.swing.JLabel validacion2;
    private javax.swing.JLabel validacion3;
    private javax.swing.JLabel validacion4;
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

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the idt
     */
    public String getIdt() {
        return idt;
    }

    /**
     * @param idt the idt to set
     */
    public void setIdt(String idt) {
        this.idt = idt;
    }

    /**
     * @return the rsocial
     */
    public String getRsocial() {
        return rsocial;
    }

    /**
     * @param rsocial the rsocial to set
     */
    public void setRsocial(String rsocial) {
        this.rsocial = rsocial;
    }

    /**
     * @return the telf
     */
    public String getTelf() {
        return telf;
    }

    /**
     * @param telf the telf to set
     */
    public void setTelf(String telf) {
        this.telf = telf;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the tcontc
     */
    public String getTcontc() {
        return tcontc;
    }

    /**
     * @param tcontc the tcontc to set
     */
    public void setTcontc(String tcontc) {
        this.tcontc = tcontc;
    }

    /**
     * @return the direcc
     */
    public String getDirecc() {
        return direcc;
    }

    /**
     * @param direcc the direcc to set
     */
    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }
}
