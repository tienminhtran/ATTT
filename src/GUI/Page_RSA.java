/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Admin
 */
public class Page_RSA extends javax.swing.JFrame {

    /**
     * Creates new form Page_RSA
     */
    public Page_RSA() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_PlainText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_KeyText = new javax.swing.JTextField();
        txt_EncryptedMess = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_DercyptedMess = new javax.swing.JTextField();
        btn_giaiMa = new javax.swing.JButton();
        btn_MaHoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_PlainText1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_KeyText1 = new javax.swing.JTextField();
        txt_EncryptedMess1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_DercyptedMess1 = new javax.swing.JTextField();
        btn_giaiMa1 = new javax.swing.JButton();
        btn_MaHoa1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jLabel2.setText("Plain text");

        jLabel3.setText("Key text:");

        txt_EncryptedMess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EncryptedMessActionPerformed(evt);
            }
        });

        jLabel4.setText("Encrypted message:");

        jLabel1.setText("Decrypted message:");

        txt_DercyptedMess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DercyptedMessActionPerformed(evt);
            }
        });

        btn_giaiMa.setBackground(new java.awt.Color(102, 255, 102));
        btn_giaiMa.setText("Mã hóa");
        btn_giaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giaiMaActionPerformed(evt);
            }
        });

        btn_MaHoa.setBackground(new java.awt.Color(255, 204, 204));
        btn_MaHoa.setText("Giải mã");
        btn_MaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MaHoaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setText("Reset");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Plain text");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 128, 71));
        getContentPane().add(txt_PlainText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 440, 67));

        jLabel6.setText("Key text:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, 32));
        getContentPane().add(txt_KeyText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 440, 30));

        txt_EncryptedMess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EncryptedMess1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_EncryptedMess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 440, 30));

        jLabel7.setText("Encrypted message:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, 32));

        jLabel8.setText("Decrypted message:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 32));

        txt_DercyptedMess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DercyptedMess1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_DercyptedMess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 440, 30));

        btn_giaiMa1.setBackground(new java.awt.Color(102, 255, 102));
        btn_giaiMa1.setText("Mã hóa");
        btn_giaiMa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giaiMa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_giaiMa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 40));

        btn_MaHoa1.setBackground(new java.awt.Color(102, 102, 255));
        btn_MaHoa1.setText("Giải mã");
        btn_MaHoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MaHoa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MaHoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 120, 40));

        jButton2.setBackground(new java.awt.Color(102, 255, 51));
        jButton2.setText("Reset");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 40, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RSA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 570, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 590, 300));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_EncryptedMessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EncryptedMessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EncryptedMessActionPerformed

    private void txt_DercyptedMessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DercyptedMessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DercyptedMessActionPerformed

    private void btn_giaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giaiMaActionPerformed
    }//GEN-LAST:event_btn_giaiMaActionPerformed

    private void btn_MaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MaHoaActionPerformed
    }//GEN-LAST:event_btn_MaHoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_DercyptedMess.setText("");
        txt_EncryptedMess.setText("");
        txt_PlainText.setText("");
        txt_KeyText.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_EncryptedMess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EncryptedMess1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EncryptedMess1ActionPerformed

    private void txt_DercyptedMess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DercyptedMess1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DercyptedMess1ActionPerformed

    private void btn_giaiMa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giaiMa1ActionPerformed
       // maHoa();
    }//GEN-LAST:event_btn_giaiMa1ActionPerformed

    private void btn_MaHoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MaHoa1ActionPerformed
        //giaiMa();
    }//GEN-LAST:event_btn_MaHoa1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt_DercyptedMess.setText("");
        txt_EncryptedMess.setText("");
        txt_PlainText.setText("");
        txt_KeyText.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
//            java.util.logging.Logger.getLogger(Page_RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Page_RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Page_RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Page_RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Page_RSA().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MaHoa;
    private javax.swing.JButton btn_MaHoa1;
    private javax.swing.JButton btn_giaiMa;
    private javax.swing.JButton btn_giaiMa1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_DercyptedMess;
    private javax.swing.JTextField txt_DercyptedMess1;
    private javax.swing.JTextField txt_EncryptedMess;
    private javax.swing.JTextField txt_EncryptedMess1;
    private javax.swing.JTextField txt_KeyText;
    private javax.swing.JTextField txt_KeyText1;
    private javax.swing.JTextField txt_PlainText;
    private javax.swing.JTextField txt_PlainText1;
    // End of variables declaration//GEN-END:variables
}
