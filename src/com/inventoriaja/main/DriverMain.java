/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventoriaja.main;

import com.inventoriaja.frame.*;
import java.sql.SQLException;


/**
 *
 * @author SWIFT
 */
public class DriverMain {
    public static void main(String[] args) throws SQLException {
        var login = new LoginFrame();
        login.setVisible(true);
    }
}