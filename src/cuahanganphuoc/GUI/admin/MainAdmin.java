/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cuahanganphuoc.GUI.admin;


import cuahanganphuoc.GUI.user.*;
import cuahanganphuoc.DAO.UserDAO;
import java.awt.Button;
import java.awt.Color;
import java.text.Normalizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MainAdmin extends javax.swing.JFrame {
    JFrame activeJFrame = null;

    /**
     * Creates new form Home
     */
    public MainAdmin() {
        initComponents();
        clearMenu();
//        openChildJFrame(new Welcome());
        activeJFrame = null;
        btnUser.setText(UserDAO.adminDangDangNhap);
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
        btnQLUser = new javax.swing.JButton();
        btnQLKH = new javax.swing.JButton();
        btnQLDH = new javax.swing.JButton();
        btnQLSP = new javax.swing.JButton();
        btnQLLOAI = new javax.swing.JButton();
        btnQLMS = new javax.swing.JButton();
        btnQLCL = new javax.swing.JButton();
        btnQLKD = new javax.swing.JButton();
        btnQLSIZE = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUser = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnChilds = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1370, 750));
        setMinimumSize(new java.awt.Dimension(1370, 750));
        setPreferredSize(new java.awt.Dimension(1370, 750));
        setSize(new java.awt.Dimension(1370, 750));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        btnQLUser.setBackground(new java.awt.Color(204, 0, 0));
        btnQLUser.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLUser.setForeground(new java.awt.Color(255, 255, 255));
        btnQLUser.setText("USER");
        btnQLUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLUser);

        btnQLKH.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLKH.setText("KHÁCH HÀNG");
        btnQLKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLKH);

        btnQLDH.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLDH.setText("ĐƠN HÀNG");
        btnQLDH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDHActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLDH);

        btnQLSP.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLSP.setText("SẢN PHẨM");
        btnQLSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLSP);

        btnQLLOAI.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLLOAI.setText("LOẠI SẢN PHẨM");
        btnQLLOAI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLLOAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLLOAIActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLLOAI);

        btnQLMS.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLMS.setText("MÀU SẮC");
        btnQLMS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMSActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLMS);

        btnQLCL.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLCL.setText("CHẤT LIỆU");
        btnQLCL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLCLActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLCL);

        btnQLKD.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLKD.setText("KIỂU DÁNG");
        btnQLKD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLKD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKDActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLKD);

        btnQLSIZE.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnQLSIZE.setText("SIZE");
        btnQLSIZE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnQLSIZE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSIZEActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLSIZE);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 180, 660);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnUser.setForeground(new java.awt.Color(236, 31, 38));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuahanganphuoc/icon/user.png"))); // NOI18N
        btnUser.setText("Nhân viên 1");
        btnUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnUser);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1190, 0, 180, 60);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 31, 38));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuahanganphuoc/icon/logo.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 31, 38));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AN PHUOC STORE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1190, 60);

        pnChilds.setBackground(new java.awt.Color(255, 255, 255));
        pnChilds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(pnChilds);
        pnChilds.setBounds(180, 60, 1190, 660);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
        clearMenu();
        openChildJFrame(new frmKhachHang());
        clickMenu(btnQLKH);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        clearMenu();
        openChildJFrame(new frmSanPham());
        clickMenu(btnQLSP);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLSPActionPerformed

    private void btnQLDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDHActionPerformed
        clearMenu();
        openChildJFrame(new frmDonHang());
        clickMenu(btnQLDH);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLDHActionPerformed

    private void btnQLUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLUserActionPerformed
        clearMenu();
        openChildJFrame(new frmUser());
        clickMenu(btnQLUser);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLUserActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?")==JOptionPane.OK_OPTION){
            Login frm = new Login();
            this.dispose();
            frm.setVisible(true);
            frm.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnQLLOAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLLOAIActionPerformed
        // TODO add your handling code here:
        clearMenu();
        openChildJFrame(new frmLoaiSanPham());
        clickMenu(btnQLLOAI);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLLOAIActionPerformed

    private void btnQLMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMSActionPerformed
        // TODO add your handling code here:
        clearMenu();
        openChildJFrame(new frmMauSac());
        clickMenu(btnQLMS);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLMSActionPerformed

    private void btnQLCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLCLActionPerformed
        // TODO add your handling code here:
        clearMenu();
        openChildJFrame(new frnChatLieu());
        clickMenu(btnQLCL);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLCLActionPerformed

    private void btnQLKDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKDActionPerformed
        // TODO add your handling code here:
        clearMenu();
        openChildJFrame(new frmKieuDang());
        clickMenu(btnQLKD);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLKDActionPerformed

    private void btnQLSIZEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSIZEActionPerformed
        // TODO add your handling code here:
        clearMenu();
        openChildJFrame(new frmSize());
        clickMenu(btnQLSIZE);
        activeJFrame = null;
    }//GEN-LAST:event_btnQLSIZEActionPerformed

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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainAdmin frm = new MainAdmin();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLCL;
    private javax.swing.JButton btnQLDH;
    private javax.swing.JButton btnQLKD;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLLOAI;
    private javax.swing.JButton btnQLMS;
    private javax.swing.JButton btnQLSIZE;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JButton btnQLUser;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnChilds;
    // End of variables declaration//GEN-END:variables

    
    void openChildJFrame(JFrame childJFrame)
    {
        if (activeJFrame != null)
        {
            activeJFrame.dispose();
        }
        else
        {
            activeJFrame = childJFrame;
            childJFrame.setBounds(0, 0, pnChilds.getWidth(), pnChilds.getHeight());
            pnChilds.removeAll();
            pnChilds.add(activeJFrame.getContentPane());
            pnChilds.revalidate();
            pnChilds.repaint();
        }
    }
    void clearMenu()
    {
        btnQLUser.setBackground(Color.white);
        btnQLUser.setForeground(Color.black);
        btnQLKH.setBackground(Color.white);
        btnQLKH.setForeground(Color.black);
        btnQLDH.setBackground(Color.white);
        btnQLDH.setForeground(Color.black);
        btnQLSP.setBackground(Color.white);
        btnQLSP.setForeground(Color.black);
        btnUser.setBackground(Color.white);
        btnUser.setForeground(Color.black);
        btnQLLOAI.setBackground(Color.white);
        btnQLLOAI.setForeground(Color.black);
        btnQLMS.setBackground(Color.white);
        btnQLMS.setForeground(Color.black);
        btnQLCL.setBackground(Color.white);
        btnQLCL.setForeground(Color.black);
        btnQLKD.setBackground(Color.white);
        btnQLKD.setForeground(Color.black);
        btnQLSIZE.setBackground(Color.white);
        btnQLSIZE.setForeground(Color.black);
    }
    void clickMenu(JButton btn){
        btn.setBackground(Color.red.darker());
        btn.setForeground(Color.white);
    }
}
