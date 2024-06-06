/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inventoriaja.frame;

import com.inventoriaja.core.Database;
import com.inventoriaja.core.EditUser;
import com.inventoriaja.core.SwingHelper;
import com.inventoriaja.model.Barang;
import com.inventoriaja.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class EditUserFrame extends javax.swing.JFrame {

    private Database database;
    
    ArrayList<User> user = new ArrayList<User>();
    
    public User User;
    public int userId;
    private String val;
    
    /**
     * Creates new form EditUserFrame
     */
    
    public EditUserFrame(String val) throws SQLException{
        initComponents();
        setTitle("Edit User");
        this.val = val;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fullFillData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Role");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Admin");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Manager");

        jLabel1.setText("Edit User");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Staff");

        jLabel2.setText("Password");

        jLabel3.setText("Email");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        try {
            String nama = jTextField1.getText();
            String email = jTextField2.getText();
            String password = new String(jPasswordField1.getPassword()); // Use getPassword() instead of getSelectedText()
            String role = SwingHelper.getSelectedButtonText(buttonGroup1);
            
            PreparedStatement stmt = Database.executePrepareStmt("UPDATE user SET nama =?, email =?, password =?, role =? WHERE createdAt =?;");
//            PreparedStatement stmt = Database.executePrepareStmt("UPDATE user SET nama =?, email =?, password =?, role =? WHERE userId =?;");
//            PreparedStatement stmt = Database.executePrepareStmt("UPDATE user SET nama =?, email =?, password =?, role =? WHERE createdAt = '"+val+"';");
            
            stmt.setString(1, nama);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, role);
            stmt.setString(5, val); // Set the createdAt parameter
            stmt.executeUpdate();

//            stmt.setString(1, nama);
//            stmt.setString(2, email);
//            stmt.setString(3, password);
//            stmt.setString(4, role);
//            stmt.setInt(5, userId); // Set the userId parameter
//            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "User telah di update", "Berhasil", JOptionPane.WARNING_MESSAGE);
            stmt.close();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(EditUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            String nama = jTextField1.getText();
//            String email = jTextField2.getText();
//            String password = new String(jPasswordField1.getPassword()); // Use getPassword() instead of getSelectedText()
//            String role = SwingHelper.getSelectedButtonText(buttonGroup1);
//
//            if (EditUser.getUserbyName(nama)!= null) {
//                int userId = EditUser.getUserbyName(nama).getId(); // Get the user ID from the existing user object
//
//                PreparedStatement stmt = Database.executePrepareStmt("UPDATE user SET nama =?, email =?, password =?, role =? WHERE id =?");
//                stmt.setString(1, nama);
//                stmt.setString(2, email);
//                stmt.setString(3, password);
//                stmt.setString(4, role);
//                stmt.setInt(5, userId);
//                stmt.executeUpdate();
//
//                JOptionPane.showMessageDialog(null, "User telah di update", "Berhasil", JOptionPane.WARNING_MESSAGE);
//                stmt.close();
//                this.setVisible(false);
//            } else {
//                JOptionPane.showMessageDialog(null, "User not found!");
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error updating user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//            Logger.getLogger(TambahUserFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
//            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditUserFrame().setVisible(true);
//            }
//        });
//    }
    
    private void fullFillData() {
        
//        try {
//            PreparedStatement stmt = Database.executePrepareStmt("SELECT barang_id FROM transaksi WHERE createdAt = '" + val + "';");
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                PreparedStatement stmt2 = Database.executePrepareStmt("SELECT b.nama, t.stok, t.tipe FROM transaksi t "
//                        + "JOIN barang b ON t.barang_id = b.id "
//                        + "WHERE b.id = '" + rs.getInt("barang_id") + "' AND t.createdAt = '" + val + "';");
//                ResultSet rs2 = stmt2.executeQuery();
//                if (rs2.next()) {
//                    String barang = rs2.getString("nama");
//                    int stok = rs2.getInt("stok");
//                    String tipe = rs2.getString("tipe");
//                    model.setSelectedItem(barang);
//                    jSpinner2.setValue(stok);
//                    
//                    if (tipe.equals("masuk")) {
//                        jRadioButton1.setSelected(true);
//                        jRadioButton2.setSelected(false);
//                    } else if (tipe.equals("keluar")) {
//                        jRadioButton2.setSelected(true);
//                        jRadioButton1.setSelected(false);
//                    }
//                }
//                rs2.close();
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }


        try (PreparedStatement stmt = Database.executePrepareStmt("SELECT nama, email, password, role FROM user WHERE createdAt =?;")) {
            stmt.setString(1, val);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nama = rs.getString("nama");
                    String email = rs.getString("email");
                    String password = rs.getString("password");
                    String role = rs.getString("role");
                    // Use the retrieved values here
                } else {
                    System.out.println("No user found with createdAt = " + val);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }          


//        try { 
//            PreparedStatement stmt = Database.executePrepareStmt("SELECT id FROM user WHERE createdAt = '" + val + "';");
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                PreparedStatement stmt2 = Database.executePrepareStmt("SELECT nama, email, password, role FROM user "
//                        + "WHERE id = '" + rs.getInt("id") + "' AND createdAt = '" + val + "';");
//                ResultSet rs2 = stmt2.executeQuery();
//                if (rs2.next()) {
//                    String nama = rs2.getString("nama");
//                    String email = rs2.getString("email");
//                    String password = rs2.getString("password");
//                    String role = rs2.getString("role");
//                }
//                rs2.close();
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
