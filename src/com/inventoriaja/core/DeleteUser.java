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
 * @author Aaron
 */
public class DeleteUser {
    private Database database;
    
    public static void deleteUser(String user) {
        try {
            Database.execute("DELETE FROM user WHERE nama = '"+ user +"';");
            JOptionPane.showMessageDialog(null, "Data telah berhasil dihapus", "Message", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
