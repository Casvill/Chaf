/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CustomersController;
import controllers.UserController;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import libraries.TextPrompt;



/**
 *
 * @author david
 */
public class TercerosRegisterView extends javax.swing.JFrame {

    private String moduloInicio ="";
    /* PlaceHolder */
    private TextPrompt numeroIdentificacion,direccion,nombreCompleto,telefono;
    
    public TercerosRegisterView(String invokeModule) {
        this.moduloInicio = invokeModule;
        System.out.println("[TercerosRegisterView]: Me invocaron desde : " + this.moduloInicio );
        initComponents();
      
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
        tipoDoc = new views.Input();
        jComboBox1 = new javax.swing.JComboBox<>();
        nomCompleto = new views.Input();
        inputUserDir = new javax.swing.JTextField();
        direction = new views.Input();
        inputUserNomUser = new javax.swing.JTextField();
        numDoc = new views.Input();
        inputUserNumDoc = new javax.swing.JTextField();
        phone = new views.Input();
        inputUserTel = new javax.swing.JTextField();
        materialButton1 = new libraries.MaterialButton();
        numDoc1 = new views.Input();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIPO DE DOCUMENTO", "CC", "NIT", "TI", "AS" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tipoDocLayout = new javax.swing.GroupLayout(tipoDoc);
        tipoDoc.setLayout(tipoDocLayout);
        tipoDocLayout.setHorizontalGroup(
            tipoDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoDocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        tipoDocLayout.setVerticalGroup(
            tipoDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoDocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1)
                .addContainerGap())
        );

        inputUserDir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        inputUserDir.setForeground(new java.awt.Color(134, 134, 134));
        inputUserDir.setToolTipText("");
        direccion = new TextPrompt("Direccion",this.inputUserDir);
        inputUserDir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        inputUserDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserDirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nomCompletoLayout = new javax.swing.GroupLayout(nomCompleto);
        nomCompleto.setLayout(nomCompletoLayout);
        nomCompletoLayout.setHorizontalGroup(
            nomCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nomCompletoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserDir, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        nomCompletoLayout.setVerticalGroup(
            nomCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nomCompletoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserDir)
                .addContainerGap())
        );

        inputUserNomUser.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        inputUserNomUser.setForeground(new java.awt.Color(134, 134, 134));
        inputUserNomUser.setToolTipText("");
        nombreCompleto = new TextPrompt("Nombres y Apellidos",this.inputUserNomUser);
        inputUserNomUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        inputUserNomUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserNomUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout directionLayout = new javax.swing.GroupLayout(direction);
        direction.setLayout(directionLayout);
        directionLayout.setHorizontalGroup(
            directionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserNomUser, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        directionLayout.setVerticalGroup(
            directionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserNomUser)
                .addContainerGap())
        );

        inputUserNumDoc.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        inputUserNumDoc.setForeground(new java.awt.Color(134, 134, 134));
        inputUserNumDoc.setToolTipText("");
        numeroIdentificacion = new TextPrompt("Numero de documento",this.inputUserNumDoc);
        inputUserNumDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        inputUserNumDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserNumDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numDocLayout = new javax.swing.GroupLayout(numDoc);
        numDoc.setLayout(numDocLayout);
        numDocLayout.setHorizontalGroup(
            numDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numDocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserNumDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        numDocLayout.setVerticalGroup(
            numDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numDocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserNumDoc)
                .addContainerGap())
        );

        inputUserTel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        inputUserTel.setForeground(new java.awt.Color(134, 134, 134));
        inputUserTel.setToolTipText("");
        this.telefono = new TextPrompt("Telefono",this.inputUserTel);
        inputUserTel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        inputUserTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout phoneLayout = new javax.swing.GroupLayout(phone);
        phone.setLayout(phoneLayout);
        phoneLayout.setHorizontalGroup(
            phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserTel, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        phoneLayout.setVerticalGroup(
            phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputUserTel)
                .addContainerGap())
        );

        materialButton1.setBackground(new java.awt.Color(119, 177, 236));
        materialButton1.setText("CREAR USUARIO");
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

        jComboBox3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIPO USUARIO", "CLIENTE", "PROVEEDOR", "USUARIO" }));
        jComboBox3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numDoc1Layout = new javax.swing.GroupLayout(numDoc1);
        numDoc1.setLayout(numDoc1Layout);
        numDoc1Layout.setHorizontalGroup(
            numDoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numDoc1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox3, 0, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        numDoc1Layout.setVerticalGroup(
            numDoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numDoc1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jComboBox3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(tipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(direction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(numDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputUserDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserDirActionPerformed

    private void inputUserNomUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserNomUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserNomUserActionPerformed

    private void inputUserNumDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserNumDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserNumDocActionPerformed

    private void inputUserTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserTelActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void materialButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButton1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_materialButton1MouseClicked

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("[TercerosRegisterView]: Creando Tercero");
        if(moduloInicio.equals("USUARIO")){
            String usua = null;
            char[] pd = null;
            System.out.println("[TercerosRegisterView]: Creando Usuario");
            if(this.jComboBox3.getSelectedItem().equals("USUARIO")){
            RegisterUserPwdView newUser = new RegisterUserPwdView();
            UserController creacionUsuario = new UserController();
            newUser.setVisible(true);
            while(newUser.getDefaultCloseOperation() != JFrame.EXIT_ON_CLOSE){
                /*validacion de insercion de usuario y contraseña*/
                usua = newUser.getUser();
                pd = newUser.getPwd();
                System.out.println(usua+"::"+Arrays.toString(pd));
            }
            
//creacionUsuario.insertUser((String) this.jComboBox1.getSelectedItem(),Integer.parseInt(this.inputUserNumDoc.getText()), this.inputUserDir.getText(), this.inputUserNomUser.getText(), this.inputUserTel.getText());
            
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }else {
                JOptionPane.showMessageDialog(this,"Solo se pueden Crear Usuarios en este modulo");
            }
        }else if(moduloInicio.equals("PROVEEDOR")){
            System.out.println("[TercerosRegisterView]: Creando Proveedor");
            
        }else if(moduloInicio.equals("CLIENTE")){
            System.out.println("[TercerosRegisterView]: Creando Cliente");
             if(this.jComboBox3.getSelectedItem().equals("CLIENTE")){ 
            CustomersController ctrlClientes = new CustomersController();
            ctrlClientes.insertUser((String) this.jComboBox1.getSelectedItem(),Integer.parseInt(this.inputUserNumDoc.getText()), this.inputUserDir.getText(), this.inputUserNomUser.getText(), this.inputUserTel.getText());
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }else {
                JOptionPane.showMessageDialog(this,"Solo se pueden Crear Clientes en este modulo");
            }
        }
    }//GEN-LAST:event_materialButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
//            java.util.logging.Logger.getLogger(TercerosRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TercerosRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TercerosRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TercerosRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TercerosRegisterView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.Input direction;
    private javax.swing.JTextField inputUserDir;
    private javax.swing.JTextField inputUserNomUser;
    private javax.swing.JTextField inputUserNumDoc;
    private javax.swing.JTextField inputUserTel;
    private javax.swing.JTextField inputUserTel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private libraries.MaterialButton materialButton1;
    private views.Input nomCompleto;
    private views.Input numDoc;
    private views.Input numDoc1;
    private views.Input phone;
    private views.Input phone1;
    private views.Input tipoDoc;
    // End of variables declaration//GEN-END:variables
}
