/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventoriaja.core;
import java.sql.*;
import com.inventoriaja.core.Database;
import javax.swing.JOptionPane; 
import com.inventoriaja.model.Barang;
import com.inventoriaja.model.Cabang;
/**
 *
 * @author wilda
 */
public class EditBarang {
    
    public static Barang getKodeBarang(String kodeBarang){
        String sql = "SELECT * FROM barang WHERE set kode=?";
        try {
            PreparedStatement stmt = Database.executePrepareStmt(sql);
            stmt.setString(1, kodeBarang);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int idBarang = rs.getInt("id");
                String nama = rs.getString("nama");
                String kategori = rs.getString("kategori");
                int harga = rs.getInt("harga");
                int stok = rs.getInt("stok");
                String kode = rs.getString("kode");
                int idCabang = rs.getInt("cabangId");
                
                Barang barang = new Barang(idBarang, kode , nama, kategori, stok, harga, idCabang, "");
                return barang;
            }
        } catch (SQLException e) {
            System.out.println("Error Get barang Id:" + e.getMessage());
        }
        return null;
    }
    
    public static void updateBarang(String kodeBarang,String namaBarang, String kategoriBarang, int hargaBarang, int stokBarang){
        try {
            // Koneksi ke database
            Connection conn = DriverManager.getConnection("jdbc:mysql://103.161.184.223/inventoriaja", "inventoriaja", "inventoriaja");
            String sql = "UPDATE barang SET nama = ?, kategori = ?, harga = ?, stok = ? WHERE kode = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, namaBarang);
            pst.setString(2, kategoriBarang);
            pst.setInt(3, hargaBarang);
            pst.setInt(4, stokBarang);
            pst.setString(5, kodeBarang);

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Barang berhasil diupdate.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Barang tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengupdate data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
