/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProveedor;


import MODELO.queryProveedor;
import Vista.HomeAplicativo;
import static Vista.HomeAplicativo.escritorio;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Roger
 */
public class ProveedorPrincipal1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form UsuariosNew
     */
          queryProveedor queryE = new queryProveedor();

    public ProveedorPrincipal1() {
        initComponents();
        queryE.listarTodosProveedores();
        //HabilitarBotones(true, false, false, false);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelBuscado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarProveedor = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jCmbTipoBusqueda = new javax.swing.JComboBox<>();
        jTextFieldParametroBusqueda = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/equipo.png"))); // NOI18N
        jLabel1.setText("Proveedores");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lista-de-usuario.png"))); // NOI18N

        jLabelBuscado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBuscado.setText("Código:");

        jTableListarProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarProveedorMouseClicked(evt);
            }
        });
        jTableListarProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableListarProveedorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarProveedor);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("FIltrar :");

        jCmbTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Identificador", "Razon Social" }));
        jCmbTipoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbTipoBusquedaActionPerformed(evt);
            }
        });

        jTextFieldParametroBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldParametroBusquedaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldParametroBusquedaKeyPressed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVer.setText("VER");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("ELMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabelBuscado))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnVolver)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCmbTipoBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(459, 459, 459))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jCmbTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBuscado)
                            .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(btnEditar)
                            .addComponent(btnVer)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
private TableRowSorter trsFiltro;
     //queryProveedores qe = new queryProveedores();
    private void jCmbTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbTipoBusquedaActionPerformed
        if (jCmbTipoBusqueda.getSelectedIndex() == 0){
            jLabelBuscado.setText("Codigo");
        }
        if (jCmbTipoBusqueda.getSelectedIndex() == 1){
            jLabelBuscado.setText("Identificador");
        }
        if (jCmbTipoBusqueda.getSelectedIndex() == 2){
            jLabelBuscado.setText("Razon Social");
        }
    }//GEN-LAST:event_jCmbTipoBusquedaActionPerformed

    private void jTextFieldParametroBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldParametroBusquedaKeyPressed

    }//GEN-LAST:event_jTextFieldParametroBusquedaKeyPressed
public void HabilitarBotones(boolean Crear,boolean Ver,boolean Editar,boolean Eliminar){
    this.btnCrear.setEnabled(Crear);
    this.btnVer.setEnabled(Ver);
    this.btnEditar.setEnabled(Editar);
    this.btnEliminar.setEnabled(Eliminar);
    
}
        public void Filtrar() {
        int columnaABuscar = 0;

        if (jCmbTipoBusqueda.getSelectedItem() == "Código") {
            columnaABuscar = 0;
        }
        if (jCmbTipoBusqueda.getSelectedItem().toString() == "Identificador") {
            columnaABuscar = 1;
        }
        if (jCmbTipoBusqueda.getSelectedItem() == "Razon Social") {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+jTextFieldParametroBusqueda.getText(), columnaABuscar));
        //jTableListarProveedor.getColumnModel().getColumn(columnaABuscar).setCellEditor(ta);
    }
    private void jTextFieldParametroBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldParametroBusquedaKeyTyped
       /*char c=evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cadena=(""+c).toUpperCase();
            c=cadena.charAt(0);
            evt.setKeyChar(c);
        }*/
                
        jTextFieldParametroBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (jTextFieldParametroBusqueda.getText());
                jTextFieldParametroBusqueda.setText(cadena);
                repaint();
                Filtrar();
            }
        });
        trsFiltro = new TableRowSorter(jTableListarProveedor.getModel());
        jTableListarProveedor.setRowSorter(trsFiltro);
        
    }//GEN-LAST:event_jTextFieldParametroBusquedaKeyTyped

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        DatosProveedor1 datos=new DatosProveedor1();
        datos.setOpcion(1);
        HomeAplicativo.escritorio.add(datos);
        datos.toFront();
        //Para centrar la ventana abierta
            Dimension dimension = escritorio.getSize();
            Dimension FrameSize = datos.getSize();
            datos.setLocation((dimension.width - FrameSize.width) / 2, (dimension.height - FrameSize.height) / 2);
            //
        datos.setVisible(true);
        this.dispose();
  
    }//GEN-LAST:event_btnCrearActionPerformed

   
  

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(jTableListarProveedor.getSelectedRows().length>0){
        DatosProveedor1 datos=new DatosProveedor1();
        datos.setOpcion(2);
        HomeAplicativo.escritorio.add(datos);
        datos.toFront();
        
        //Para centrar la ventana abierta
            Dimension dimension = escritorio.getSize();
            Dimension FrameSize = datos.getSize();
            datos.setLocation((dimension.width - FrameSize.width) / 2, (dimension.height - FrameSize.height) / 2);
            //
        
        String cod=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 0).toString();
        String ident=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 1).toString();
        String razon=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 2).toString();
        String telf=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 3).toString();
        String cont=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 4).toString();
        String tcont=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 5).toString();
        String direc=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 6).toString();
        datos.Llenar(cod, ident, razon,telf, cont, tcont, direc);
        datos.setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(jTableListarProveedor.getSelectedRows().length>0){
        queryProveedor bash = new queryProveedor();  
        int code = Integer.parseInt(jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 0).toString());
        bash.eliminarProveedor(code);
        bash.actualizarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if(jTableListarProveedor.getSelectedRows().length>0){ 
        DatosProveedor1 datos=new DatosProveedor1();
        datos.setOpcion(3);
        HomeAplicativo.escritorio.add(datos);
        datos.toFront();
        
        //Para centrar la ventana abierta
            Dimension dimension = escritorio.getSize();
            Dimension FrameSize = datos.getSize();
            datos.setLocation((dimension.width - FrameSize.width) / 2, (dimension.height - FrameSize.height) / 2);
            //
        
        String cod=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 0).toString();
        String ident=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 1).toString();
        String razon=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 2).toString();
        String telf=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 3).toString();
        String cont=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 4).toString();
        String tcont=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 5).toString();
        String direc=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 6).toString();
        datos.Llenar(cod, ident, razon,telf, cont, tcont, direc);
        datos.Deshabilitar();
        datos.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void jTableListarProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListarProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableListarProveedorKeyReleased

    private void jTableListarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarProveedorMouseClicked
        /*if (evt.getClickCount() >= 1) {
        Point point = evt.getPoint();
        int row = jTableListarProveedor.rowAtPoint(point);
        int column = jTableListarProveedor.columnAtPoint(point);
        TableModel model = jTableListarProveedor.getModel();
        JOptionPane.showMessageDialog(this, model.getValueAt(row, column));
            HabilitarBotones(false, true, true, true);
    }*/
    }//GEN-LAST:event_jTableListarProveedorMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        System.gc();//limpiar basura
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jCmbTipoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBuscado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableListarProveedor;
    private javax.swing.JTextField jTextFieldParametroBusqueda;
    // End of variables declaration//GEN-END:variables
}
