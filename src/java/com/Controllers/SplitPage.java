/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controllers;

import com.context.DataConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tanlu
 */
public class SplitPage {

    private final int PAGE_SIZE = 6;

    public int getTotalCakes() throws Exception {
        String query = "select count(*) from Cakes ";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int rows = 0;
        try {
            conn = DataConnection.connToMssql();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                rows = rs.getInt(1);
            }
            DataConnection.closeResultSet(rs);
            DataConnection.closePrepareStatement(ps);
            DataConnection.closeConn(conn);
        } catch (Exception e) {
            DataConnection.closeResultSet(rs);
            DataConnection.closePrepareStatement(ps);
            DataConnection.closeConn(conn);
        }
        return rows;
    }

    public int getTotalPages() throws Exception {
        return 1 + (getTotalCakes() - 1) / PAGE_SIZE;
    }

    public int getPAGE_SIZE() {
        return PAGE_SIZE;
    }

}
