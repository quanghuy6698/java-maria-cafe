/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Entity.OpeningHours;
import com.context.DataConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tanlu
 */
public class OpeningHoursDAO {

    public OpeningHours getOpeningHours() throws Exception {
        String query = "select * from OpeningHourss";
        String closed = null, weekend = null, weekdays = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DataConnection.connToMssql();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                closed = rs.getString("closed");
                weekend = rs.getString("weekend");
                weekdays = rs.getString("weekdays");
            }
            DataConnection.closeResultSet(rs);
            DataConnection.closePrepareStatement(ps);
            DataConnection.closeConn(con);
        } catch (Exception e) {
            DataConnection.closeResultSet(rs);
            DataConnection.closePrepareStatement(ps);
            DataConnection.closeConn(con);
            throw e;
        }
        return new OpeningHours(weekend, weekdays, closed);
    }
}
