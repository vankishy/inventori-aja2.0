/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventoriaja.core;

import com.inventoriaja.model.Barang;
import com.inventoriaja.model.User;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SWIFT
 */
public class DeleteTransaksi {
    private Database database;
    
    public static void deleteData(String value) {
        try {
            Database.execute("DELETE FROM transaksi WHERE createdAt = '"+ value +"';");
            JOptionPane.showMessageDialog(null, "Data telah berhasil dihapus", "Message", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
