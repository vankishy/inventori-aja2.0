/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventoriaja.core;
import java.sql.*;
import com.inventoriaja.model.User;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aaron
 */

public class EditUser { 
    
    public static User getIDuser(User user) {
        return getUserbyID(user.getId());
    }
    
    public static User getUserbyID(int id) {
        
        String sql = "SELECT * FROM user WHERE id=?";
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
                User user = new User(idUser, nama, email, password, role, "");
                return user;
            }
        } catch (SQLException e) {
            System.out.println("Error Get Cabang Id:" + e.getMessage());
        }
        return null;
    }
    
    public static boolean updateUser(int id, String nama, String email, String password, String role) {
        String sql = "UPDATE user SET nama = ?, email = ?, password = ?, role = ? WHERE id = ?";
        try {
            PreparedStatement stmt = Database.executePrepareStmt(sql);
            
            stmt.setString(1, nama);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, role);
            stmt.setInt(5, id);
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            Logger.getLogger(CabangQuery.class.getName()).log(Level.SEVERE, "Error updating data", e);
        }
        return false;
    }
}
