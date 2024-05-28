/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventoriaja.core;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import com.inventoriaja.model.Cabang;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yazidal
 */
public class CabangQuery {
    
    public static boolean deleteCabang(int id) {
        String sql = "DELETE FROM cabang WHERE id=?";
        try {
            PreparedStatement stmt = Database.executePrepareStmt(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(CabangQuery.class.getName()).log(Level.SEVERE, "Error updating data", e);
        }
        
        return false;
    }
    
    public static Cabang getCabangById(int id) {
        String sql = "SELECT * FROM cabang WHERE id=?";
        try {
            PreparedStatement stmt = Database.executePrepareStmt(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int idCabang = rs.getInt("id");
                String nama = rs.getString("nama");
                String nohp = rs.getString("nohp");
                String alamat = rs.getString("alamat");
                Cabang cabang = new Cabang(idCabang, nama, alamat, nohp, "");
                return cabang;
            }
        } catch (SQLException e) {
            System.out.println("Error Get Cabang Id:" + e.getMessage());
        }
        return null;
    }
    
    public static boolean updateCabang(int id, String nama, String alamat, String nohp) {
        String sql = "UPDATE cabang SET nama = ?, alamat = ?, nohp = ? WHERE id = ?";
        try {
            PreparedStatement stmt = Database.executePrepareStmt(sql);
            
            stmt.setString(1, nama);
            stmt.setString(2, alamat);
            stmt.setString(3, nohp);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            Logger.getLogger(CabangQuery.class.getName()).log(Level.SEVERE, "Error updating data", e);
        }
        return false;
    }
}
