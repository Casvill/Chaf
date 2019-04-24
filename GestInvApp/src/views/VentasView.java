/**
 *
 * @author camilo
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CustomersController;
import controllers.VentasController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camilo
 */
public class VentasView extends javax.swing.JFrame {

    private CHAFDependenciesViews dp = new CHAFDependenciesViews();
    private int idClient;
    private int deleteRow;
    private VentasController ctrVentas;

    /**
     * Creates new form VentasView
     */
    public VentasView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ctrVentas = new VentasController();
    }

    public void refresh(){
        //this.initComponents();
        this.repaint();
    }
    
    public VentasController getControllerVentas(){
        return this.ctrVentas;
    }

    public int getTerceroId(){
        return this.idClient;
    }
    
    public void setNameClient(String nuevoValor){
        this.NombreCliente.setText(nuevoValor);
    }
    
    /* numero de documento del cliente*/
    public void setIdClient(String nuevoValor){
        this.IdentificacionCliente.setText(nuevoValor);
    }
    
    public void setDirClient(String nuevoValor){
        this.direccionCliente.setText(nuevoValor);
    }
    
    public void setTelClient(String nuevoValor){
        this.telefonoCliente.setText(nuevoValor);
    }

    public void setIdClient(int id){
      this.idClient = id;
      System.out.println("[DEBUG] recibi id:"+id);
    }

    public void addNewProduct(ArrayList<String> producto){
        DefaultTableModel model = (DefaultTableModel) this.TableProductosEnVenta.getModel();
        
        model.addRow(new Object[]{producto.get(0),
                                  producto.get(1),
                                  producto.get(2),
                                  producto.get(3),
                                  producto.get(4),
                                  producto.get(5)
                                  });
    }

    public void setInfoCLient(){
      CustomersController ctrlCustomers = new CustomersController();
      ArrayList<String> data = ctrlCustomers.showRegisterCustomer(this.idClient);
      //this.setClientId(Integer.parseInt(data.get(0)));
      this.setNameClient(data.get(3));
      this.setIdClient(data.get(1));
      this.setDirClient(data.get(2));
      this.setDirClient(data.get(4));
      this.refresh();
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
        NombreCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdentificacionCliente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        direccionCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telefonoCliente = new javax.swing.JLabel();
        btnBuscar = new libraries.MaterialButton();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarProducto = new libraries.MaterialButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductosEnVenta = new javax.swing.JTable();
        btnEliminarProducto = new libraries.MaterialButton();
        btnFinalVentas = new libraries.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventas");

        jPanel1.setBackground(new java.awt.Color(219, 219, 219));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(219, 219, 219));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 171, 230));
        jLabel1.setText("Cliente");

        NombreCliente.setText("Nombre Cliente");

        jLabel3.setForeground(new java.awt.Color(32, 171, 230));
        jLabel3.setText("Numero Identificacion");

        IdentificacionCliente.setText("65456464");

        jLabel5.setForeground(new java.awt.Color(32, 171, 230));
        jLabel5.setText("Dirección");

        direccionCliente.setText("Calle 34 # 455");

        jLabel7.setForeground(new java.awt.Color(32, 171, 230));
        jLabel7.setText("Telefono");

        telefonoCliente.setText("895552215");

        btnBuscar.setBackground(new java.awt.Color(119, 177, 236));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(NombreCliente)
                    .addComponent(jLabel3)
                    .addComponent(IdentificacionCliente)
                    .addComponent(jLabel5)
                    .addComponent(direccionCliente)
                    .addComponent(jLabel7)
                    .addComponent(telefonoCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdentificacionCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccionCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(219, 219, 219));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAgregarProducto.setBackground(new java.awt.Color(119, 177, 236));
        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProduct(evt);
            }
        });

        TableProductosEnVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id","Nombre","precio venta","marca", "proveedor","cantidad"
            }
        ));
        TableProductosEnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProductosEnVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableProductosEnVenta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        btnEliminarProducto.setBackground(new java.awt.Color(119, 177, 236));
        btnEliminarProducto.setText("ELIMINAR PRODUCTO");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnFinalVentas.setBackground(new java.awt.Color(119, 177, 236));
        btnFinalVentas.setText("Finalizar Venta");
        btnFinalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFinalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        VentasChoseClient viewChoseClient = new VentasChoseClient();
        viewChoseClient.setVentasView(this);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void addProduct(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProduct
        // TODO add your handling code here:
        if(this.idClient == 0){
            JOptionPane.showMessageDialog(
                          this,
                          "debes elegir un cliente primero",
                          "Advertencia", JOptionPane.INFORMATION_MESSAGE,
                          dp.getChafLogo());
        }else{
            VentasChoseProduct viewChoseProduct = new VentasChoseProduct();
            viewChoseProduct.SetVentasView(this);
        }
        

    }//GEN-LAST:event_addProduct

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
        if(deleteRow < 0){
            
        }else{
            DefaultTableModel model = (DefaultTableModel) this.TableProductosEnVenta.getModel();
            model.removeRow(deleteRow);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void TableProductosEnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProductosEnVentaMouseClicked
        // TODO add your handling code here:
        deleteRow = this.TableProductosEnVenta.getSelectedRow();    
    }//GEN-LAST:event_TableProductosEnVentaMouseClicked

    private void btnFinalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalVentasActionPerformed

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
            java.util.logging.Logger.getLogger(VentasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdentificacionCliente;
    private javax.swing.JLabel NombreCliente;
    private javax.swing.JTable TableProductosEnVenta;
    private libraries.MaterialButton btnAgregarProducto;
    private libraries.MaterialButton btnBuscar;
    private libraries.MaterialButton btnEliminarProducto;
    private libraries.MaterialButton btnFinalVentas;
    private javax.swing.JLabel direccionCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel telefonoCliente;
    // End of variables declaration//GEN-END:variables
}