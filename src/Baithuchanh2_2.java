
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lqv20
 */
public class Baithuchanh2_2 extends javax.swing.JFrame {

    /**
     * Creates new form Baithuchanh2_2
     */
    public Baithuchanh2_2() {
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

        jLabel1 = new javax.swing.JLabel();
        btnMess = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnError = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DEMO SỬ DỤNG HỘP THOẠI");

        btnMess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMess.setText("DemoShowMessage");
        btnMess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessActionPerformed(evt);
            }
        });

        btnInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInput.setText("DemoInputDialog");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirm.setText("DemoConfirmDialog");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnAbout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbout.setText("About Me");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnError.setText("Thông báo Error");
        btnError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("LEE WANG ZIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMess)
                            .addComponent(btnError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMess)
                    .addComponent(btnInput)
                    .addComponent(btnExit))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnAbout)
                    .addComponent(btnError))
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Ban vua click nut OK", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMessActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
        JOptionPane.showInputDialog(rootPane, "Họ tên sinh viên", "Nhập thông tin sinh viên", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có tiếp tục không", "Question", JOptionPane.CANCEL_OPTION);
        if(choice == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Yes");            
        } else {
            JOptionPane.showMessageDialog(rootPane, "No");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, lblName);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Thong bao loi", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnErrorActionPerformed

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
            java.util.logging.Logger.getLogger(Baithuchanh2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baithuchanh2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baithuchanh2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baithuchanh2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baithuchanh2_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnMess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}