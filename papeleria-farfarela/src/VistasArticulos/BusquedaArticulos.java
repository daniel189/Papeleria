/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasArticulos;

import MODELO.queryArticulo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import papeleriafarfarela.Articulo;
import VistasArticulos.EliminaArticulos;

/**
 *
 * @author Daniel
 */
public class BusquedaArticulos extends javax.swing.JInternalFrame {

    Articulo artIngreso=new Articulo();
    queryArticulo artQuery=new queryArticulo();
    DefaultTableModel modelo=new DefaultTableModel();
    int valor_encontrado;
    int pro_id;
    int fam_id;
  public int getvalorencontrado()
   {
   int valorencontrado=valor_encontrado;
   return valorencontrado=valor_encontrado;
   }
  
ArrayList<Articulo> lista = new ArrayList<Articulo>();
    public BusquedaArticulos() {
        initComponents();
    }
public int seleccionaritem()
{
int item=cbox.getSelectedIndex();
return item;
}
public void cargartxt(){
int filasel=tab_articulos.getSelectedRow();
if(filasel==-1){
            JOptionPane.showMessageDialog(null,"Seleccione primero la columna" );
}
else
{
    String auxiliar=tab_articulos.getValueAt(filasel, 0).toString();
    valor_encontrado=Integer.parseInt(auxiliar);
    System.out.println(valor_encontrado);
    //ArticulosDelete d = new EliminaArticulos();
    EliminaArticulos.txtArticulo.setText(String.valueOf(valor_encontrado));
}
}
public  int getvalor()
{
    int aux=valor_encontrado;
    return aux;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbox = new javax.swing.JComboBox<>();
        txtingreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver-producto.png"))); // NOI18N
        jLabel1.setText("Busqueda de Articulos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
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

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_articulosMouseClicked
   cargartxt();
   this.setVisible(false);
    }//GEN-LAST:event_tab_articulosMouseClicked

    private void txtingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingresoActionPerformed

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
    private void txtingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresoKeyTyped
        String nombre=String.valueOf(cbox.getSelectedItem());
                System.out.println(nombre);
              String c="Nombre";
        if(nombre.equals(c))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_articulos;
    private javax.swing.JTextField txtingreso;
    // End of variables declaration//GEN-END:variables
}
