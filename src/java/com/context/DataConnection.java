/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author tanlu
 */
public class DataConnection {

    private static Connection conn = null;
    private static String connURL = "";
    private static String user = "";
    private static String pass = "";

    private static void initConfig() {
        try {
            InitialContext initialContext = new InitialContext();
            Context environmentContext = (Context) initialContext.lookup("java:/comp/env");
            connURL = (String) environmentContext.lookup("myConnURL");
            user = (String) environmentContext.lookup("dbUser");
            pass = (String) environmentContext.lookup("dbPass");
        } catch (NamingException e) {
            System.out.println("Cannot read config");
            System.out.println(e.getMessage());
        }
    }
    
    public String getImageFolder() throws Exception {
        String imageFolder = null;
        try {
            InitialContext initialContext = new InitialContext();
            Context environmentContext = (Context) initialContext.lookup("java:/comp/env");
            imageFolder = (String) environmentContext.lookup("imageFolder");
        } catch (NamingException e) {
            System.out.println("Cannot read config");
            System.out.println(e.getMessage());
            throw e;
        }
        return imageFolder;
    }

    public static void closeConn(Connection conn) throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
    public static void closeResultSet(ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
    }
    public static void closePrepareStatement(PreparedStatement ps) throws SQLException {
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
    }

    public static Connection connToMssql() throws SQLException, ClassNotFoundException {
//        String url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        initConfig();
        return DriverManager.getConnection(connURL, user, pass);
    }

}
