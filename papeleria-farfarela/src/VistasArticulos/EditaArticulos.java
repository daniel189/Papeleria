/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasArticulos;

import MODELO.queryArticulo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import papeleriafarfarela.Articulos;

/**
 *
 * @author Daniel
 */
public class EditaArticulos extends javax.swing.JInternalFrame {
 DefaultTableModel modelo=new DefaultTableModel();
    Articulos artIngreso=new Articulos();
   queryArticulo artQuery=new queryArticulo();
   int pro_id;
   int fam_id;
   int valor_encontrado;
    /**
     * Creates new form ArticulosBuscar
     */
   public int getvalorencontrado()
   {
   int valorencontrado=valor_encontrado;
   return valorencontrado=valor_encontrado;
   }
    public EditaArticulos() {
        initComponents();
        cboxprovedor.setModel(artQuery.cargarprovedores().getModel());
        cboxfamilia.setModel(artQuery.cargarfamilias().getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tab_articulos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbox = new javax.swing.JComboBox<>();
        txtingreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_familia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_prov_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_art = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_des = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        cboxprovedor = new javax.swing.JComboBox<>();
        cboxfamilia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tab_articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Articulo Id", "Provedor Id", "Nombre", "Descripcion", "Precio", "Stock"
            }
        ));
        tab_articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_articulosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_articulos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Modificar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione Opcion de Busqueda");

        cbox.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Articulo Id", "Nombre" }));
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        txtingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingresoActionPerformed(evt);
            }
        });
        txtingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtingresoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingresoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.jpg"))); // NOI18N
        jLabel1.setText("Actualizar Articulos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Familia");

        txt_familia.setEnabled(false);

        jLabel5.setText("Provedor");

        txt_prov_id.setEnabled(false);

        jLabel6.setText("Nombre");

        txt_art.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_artKeyTyped(evt);
            }
        });

        jLabel7.setText("Descripcion");

        txt_des.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_desKeyTyped(evt);
            }
        });

        jLabel2.setText("Precio");

        txt_pre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_preKeyTyped(evt);
            }
        });

        jLabel8.setText("Stock");

        txt_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stockKeyTyped(evt);
            }
        });

        cboxprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxprovedorActionPerformed(evt);
            }
        });

        cboxfamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxfamiliaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_art, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(txt_des)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboxprovedor, 0, 94, Short.MAX_VALUE)
                                    .addComponent(cboxfamilia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_prov_id, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(txt_familia))))
                        .addGap(0, 177, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_familia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxfamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_prov_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxprovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int seleccionaritem()
{
    int item=cbox.getSelectedIndex();
    return item;
}

public void cargarTxt(){
    int filaSeleccionada=tab_articulos.getSelectedRow();
    if(filaSeleccionada==-1){
                JOptionPane.showMessageDialog(null,"Seleccione primero la columna" );
    }
    else
    {
        String auxiliar=tab_articulos.getValueAt(filaSeleccionada, 0).toString();
        valor_encontrado=Integer.parseInt(auxiliar);  
        txt_art.setText(tab_articulos.getValueAt(filaSeleccionada, 3).toString());
        txt_des.setText(tab_articulos.getValueAt(filaSeleccionada, 4).toString());
        txt_pre.setText(tab_articulos.getValueAt(filaSeleccionada, 5).toString());
        txt_stock.setText(tab_articulos.getValueAt(filaSeleccionada, 6).toString());
}

}
    private void tab_articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_articulosMouseClicked
        cargarTxt();
    }//GEN-LAST:event_tab_articulosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      
       if((txt_stock.getText().equals("") )||txt_art.getText().equals("")||txt_des.equals(""))
       {
            JOptionPane.showMessageDialog(null,"Llene los campos ");
       }
       else{
        artQuery.modificarArticulo(valor_encontrado,pro_id,  fam_id,txt_art.getText(), txt_des.getText(), Float.parseFloat(txt_pre.getText()), Integer.parseInt(txt_stock.getText()));

           txt_art.setText("");
           txt_des.setText("");
           txt_pre.setText("");
           txt_stock.setText("");
       }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtingresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresoKeyReleased

             
        if(txtingreso.getText().isEmpty())
        {
            for (int i = 0; i < tab_articulos.getRowCount(); i++) {
                modelo.removeRow(i);
                i-=1;
            }
        }
        else
        {
            modelo=artQuery.UpdateArticulo(txtingreso.getText(),seleccionaritem());
            tab_articulos.setModel(modelo);
            this.tab_articulos.setModel(modelo);// hay q poner dos veces xq si no se ejecuta
    }//GEN-LAST:event_txtingresoKeyReleased
 }
    private void cboxfamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxfamiliaActionPerformed
        String nombre_familia=String.valueOf(cboxfamilia.getSelectedItem());
        fam_id=  artQuery.asignarfamilia(nombre_familia);
        txt_familia.setText(Integer.toString(fam_id));  
      
    }//GEN-LAST:event_cboxfamiliaActionPerformed

    private void cboxprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxprovedorActionPerformed
        String nombre_provedor=String.valueOf(cboxprovedor.getSelectedItem());
        pro_id=  artQuery.asignarprovedor(nombre_provedor);
        txt_prov_id.setText(Integer.toString(pro_id)); 
                                               
    }//GEN-LAST:event_cboxprovedorActionPerformed

    private void txtingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresoKeyTyped
        String nombre=String.valueOf(cbox.getSelectedItem());
        System.out.println(nombre);
        String nombreC="Nombre";
        if(nombre.equals(nombreC))
        {
            char caracter = evt.getKeyChar();
            if (Character.isDigit(caracter)) {
                
                evt.consume();
                txtingreso.setCursor(null);
                
            }
        }
        else{
           
             char caracter = evt.getKeyChar();
            
            // Verificar si la tecla pulsada no es un digito
            if(((caracter < '0') ||
                    (caracter > '9')) &&
                    (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
                evt.consume();  // ignorar el evento de teclado
            }
            
        }
    }//GEN-LAST:event_txtingresoKeyTyped

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
txtingreso.setText("");
    }//GEN-LAST:event_cboxActionPerformed

    private void txt_artKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_artKeyTyped
        char caracter = evt.getKeyChar();
            if (Character.isDigit(caracter)) {
                evt.consume();
                txt_art.setCursor(null);
                
            }
    }//GEN-LAST:event_txt_artKeyTyped

    private void txt_desKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_desKeyTyped
        char caracter = evt.getKeyChar();
            if (Character.isDigit(caracter)) {
                
                evt.consume();
                txt_des.setCursor(null);
                
            }
        
    }//GEN-LAST:event_txt_desKeyTyped

    private void txt_preKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_preKeyTyped
       char caracter = evt.getKeyChar();
       if (((caracter < '0') || (caracter > '9')) &&  (caracter != '.')) {
       evt.consume();
       }
       if (caracter == '.' && txt_pre.getText().contains(".")) {
       evt.consume();
    }
    }//GEN-LAST:event_txt_preKeyTyped

    private void txt_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stockKeyTyped
        // TODO add your handling code here:
         char caracter = evt.getKeyChar();
            
            // Verificar si la tecla pulsada no es un digito
            if(((caracter < '0') ||
                    (caracter > '9')) &&
                    (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
                evt.consume();  // ignorar el evento de teclado
            }
    }//GEN-LAST:event_txt_stockKeyTyped

    private void txtingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingresoActionPerformed
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JComboBox<String> cboxfamilia;
    private javax.swing.JComboBox<String> cboxprovedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_articulos;
    private javax.swing.JTextField txt_art;
    private javax.swing.JTextField txt_des;
    private javax.swing.JTextField txt_familia;
    private javax.swing.JTextField txt_pre;
    private javax.swing.JTextField txt_prov_id;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txtingreso;
    // End of variables declaration//GEN-END:variables
}
