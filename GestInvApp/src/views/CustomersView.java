/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import controllers.CurrentSesionController;
import controllers.CustomersController;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author fabianiniprz
 */
public class CustomersView extends javax.swing.JFrame {
    
    private Date date = Calendar.getInstance().getTime();
    private DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    private String fechaActual = dateFormat.format(date);
    private int userIdLogged; //id del usuario logueado
    private Object[][] rows;
    CustomersController ctrlCustomers = new CustomersController();
    private CHAFDependenciesViews  dp = new CHAFDependenciesViews ();

    
    /**
     * Creates new form ClientsView
     */
    public CustomersView() {
        initComponents();
    }
    
     public void setUserIdLogged(int id){
      this.userIdLogged = id;
    }
    
    public void setInfoUser(){
      CurrentSesionController sesion = new CurrentSesionController(this.userIdLogged);
      this.nameUser.setText(sesion.getName());
      this.rolUser.setText(sesion.getRol());
    }
    public Object[][] initRows(int filas){
     //// variables para traer el login del usuario, 
     ///  ya que el metodo getUserForTable pide como parametros
     ///  el indice de la columna de la consulta y un iterador
     /**/ int clientTypeDoc = 0;
     /**/ int clientNumDoc = 1;
     /**/ int nameClient = 2;
     this.rows = new Object[filas][6];
     for(int i = 0;i < filas;i++){
         for(int j = 0;j< 6 ;j++){
            switch(j){
                    case 0: rows[i][j] = this.ctrlCustomers.getClientsForTable(clientTypeDoc, i);
                    break;
                    case 1: rows[i][j] = this.ctrlCustomers.getClientsForTable(clientNumDoc, i);
                    break;    
                    case 2: rows[i][j] = this.ctrlCustomers.getClientsForTable(nameClient, i);
                    break;
                    case 3: rows[i][j] = this.dp.getEditar();
                    break;
                    case 4: rows[i][j] = this.dp.getEliminar();
                    break;
                    case 5: rows[i][j] = this.dp.getActivar();
                    break;
            }
         }
     }
     return rows;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        materialButton1 = new libraries.MaterialButton();
        rolUser = new javax.swing.JLabel();
        nameUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            initRows(this.ctrlCustomers.getUsersOnTable())
            ,
            new String [] {
                "TIPO ID", "NUMERO","RAZON SOCIAL", "Editar","Desactivar","Activar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false,true,false,false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        this.jTable1.getColumn("Editar").setCellRenderer(this.dp.getRender());
        this.jTable1.getColumn("Editar").setMaxWidth(this.dp.getSizeColumn());
        this.jTable1.getColumn("Desactivar").setCellRenderer(this.dp.getRender());
        this.jTable1.getColumn("Desactivar").setMaxWidth(this.dp.getSizeColumn() + 20);
        this.jTable1.getColumn("Activar").setCellRenderer(this.dp.getRender());
        this.jTable1.getColumn("Activar").setMaxWidth(this.dp.getSizeColumn());
        this.jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        materialButton1.setBackground(new java.awt.Color(119, 177, 236));
        materialButton1.setText("Registrar Cliente");
        materialButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialButton1MouseClicked(evt);
            }
        });
        materialButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton1ActionPerformed(evt);
            }
        });

        rolUser.setText("jLabel2");

        nameUser.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rolUser)
                            .addComponent(nameUser))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(nameUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rolUser)
                .addGap(18, 18, 18)
                .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void materialButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButton1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_materialButton1MouseClicked

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("[TercerosRegisterView]: entrando a creacion de Usuarios");
        TercerosRegisterView creacionTercero = new TercerosRegisterView("CLIENTE");
        creacionTercero.setVisible(true);
        creacionTercero.setLayout(null);
        creacionTercero.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_materialButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomersView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private libraries.MaterialButton materialButton1;
    private javax.swing.JLabel nameUser;
    private javax.swing.JLabel rolUser;
    // End of variables declaration//GEN-END:variables
}
