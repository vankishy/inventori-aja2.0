/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventoriaja.core;
import java.sql.*;
import javax.swing.JOptionPane; 
import com.inventoriaja.model.User;
/**
 *
 * @author Aaron
 */
public class EditUser {    
    public static User getUser(int id){
        String sql = "SELECT * FROM users WHERE id=?";
        try {
            PreparedStatement stmt = Database.executePrepareStmt(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int idUser = rs.getInt("id");
                String nama = rs.getString("nama");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("role");
                String createdAt = rs.getString("created_at");
                
                User user = new User(idUser, nama, email, password, role, createdAt);
                return user;
            }
        } catch (SQLException e) {
            System.out.println("Error Get user Id:" + e.getMessage());
        }
        return null;
    }
    
    public static void updateUser(String nama, String email, String password, String role){
        try {
            // Koneksi ke database
            Connection conn = DriverManager.getConnection("jdbc:mysql://103.161.184.223/inventoriaja", "inventoriaja", "inventoriaja");
            String sql = "UPDATE users SET nama =?, email =?, password =?, role =? WHERE id =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nama);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4, role);
//            pst.setInt(5, id);

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "User berhasil diupdate.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "User tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengupdate data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
