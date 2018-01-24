/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProveedor;

import MODELO.QueryProveedor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Roger
 */
public class ProveedorPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosNew
     */
          QueryProveedor queryE = new QueryProveedor();

    public ProveedorPrincipal() {
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
        jPanel3 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
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

        btnVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVer.setText("VER");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnVer))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelBuscado, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCmbTipoBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jCmbTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBuscado)
                            .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

    /**
     * Funcion inicial la cual activa los botonoes
     * @param Crear ingresar registro
     * @param Ver visualizar todos los registros
     * @param Editar editar un registro 
     * @param Eliminar  eliminar un registro
     */
    public void HabilitarBotones(boolean Crear,boolean Ver,boolean Editar,boolean Eliminar){
    this.btnCrear.setEnabled(Crear);
    this.btnVer.setEnabled(Ver);
    this.btnEditar.setEnabled(Editar);
    this.btnEliminar.setEnabled(Eliminar);
    
}
    
    /**
     * Funcion la cual filtra segun el parametro para 
     * realizar la busqueda dentro de la base de datos
     * @param evt 
     */
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

    
    /**
     * Esta funcion permite la agregacion de un reggistro  
     * manera rapida
     * 
     * @param evt 
     */
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        DatosProveedor datos=new DatosProveedor(this,true);
        datos.setOpcion(1);
        datos.setVisible(true);
  
    }//GEN-LAST:event_btnCrearActionPerformed

   /**
     * Esta funcion permite la edicion de un dato guardado 
     * pulsando sobre el mismo para poder editarlos de 
     * manera rapida
     * 
     * @param evt 
     */
  

    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(jTableListarProveedor.getSelectedRows().length>0){
        DatosProveedor datos=new DatosProveedor(this,true);
        datos.setOpcion(2);
        String cod=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 0).toString();
        String ident=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 1).toString();
        String razon=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 2).toString();
        String telf=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 3).toString();
        String cont=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 4).toString();
        String tcont=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 5).toString();
        String direc=jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 6).toString();
        datos.Llenar(cod, ident, razon,telf, cont, tcont, direc);
        datos.setVisible(true);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * Funcion la cual permite la eliminacion de un dato
     * o registro seleccionado.
     * @param evt 
     */
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(jTableListarProveedor.getSelectedRows().length>0){
        QueryProveedor bash = new QueryProveedor();  
        int code = Integer.parseInt(jTableListarProveedor.getValueAt(jTableListarProveedor.getSelectedRow(), 0).toString());
        bash.eliminarProveedor(code);
        bash.actualizarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    
    
    
    /**
     * Funcio qu epemrite la visualizacion de los datos
     * extrayendolos de la tabla que contiene la vista.
     * @param evt 
     */
    
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if(jTableListarProveedor.getSelectedRows().length>0){ 
        DatosProveedor datos=new DatosProveedor(this,true);
        datos.setOpcion(3);
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
            java.util.logging.Logger.getLogger(ProveedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
       java.awt.EventQueue.invokeLater(() -> {
           /*  jTableListarProveedor.addKeyListener(new KeyAdapter() {
           @Override
           public void keyReleased(final KeyEvent e) {
           if( jTableListarProveedor.getSelectedRows().length>0){
           new ProveedorPrincipal().HabilitarBotones(false, true, true, true);
           }else{
           new ProveedorPrincipal().HabilitarBotones(true, false, false, false);
           }
           }
           });*/
           new ProveedorPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> jCmbTipoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBuscado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableListarProveedor;
    private javax.swing.JTextField jTextFieldParametroBusqueda;
    // End of variables declaration//GEN-END:variables
}
