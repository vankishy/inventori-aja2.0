package com.inventoriaja.core;


import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Indra Mahesa
 */
public class Database {
    private static Database instance = null;
    public static Connection conn;
    public static Statement stmt;
    
    public static synchronized Database getInstance() throws SQLException
    {
        if (instance == null)
            instance = new Database();
 
        return instance;
    }
    
    private Database() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://103.161.184.223/inventoriaja", "inventoriaja", "inventoriaja");
        stmt = conn.createStatement();
    }
        
    public static ResultSet executeQuery(String sql) throws SQLException {
        return stmt.executeQuery(sql);
    }
    
    public static boolean execute(String sql) throws SQLException {
        return stmt.execute(sql);
    }
    
    public static PreparedStatement executePrepareStmt(String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }
}
