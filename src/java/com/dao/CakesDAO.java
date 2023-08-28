/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Entity.Cake;
import com.context.DataConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanlu
 */
public class CakesDAO {

    public List<Cake> getTop2Cakes() throws Exception {
        List<Cake> cakes = new ArrayList<>();

        String query = "select top 2 * from Cakes";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String imageFolder = new DataConnection().getImageFolder();
            con = DataConnection.connToMssql();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String imagePath = imageFolder + rs.getString("imagePath");
                String name = rs.getString("name");
                String desc = rs.getString("description");
                double price = rs.getDouble("price");
                int cakeID = rs.getInt("CakeID");
                cakes.add(new Cake(cakeID, name, desc, imagePath, price));
            }
            DataConnection.closeResultSet(rs);
            DataConnection.closePrepareStatement(ps);
            DataConnection.closeConn(con);
        } catch (Exception e) {
            DataConnection.closeResultSet(rs);
            DataConnection.closePrepareStatement(ps);
            DataConnection.closeConn(con);
        }
        return cakes;
    }

    public Cake getSpeciCake(int cakeID) throws Exception {
        Cake cake = null;
        String query = "select * from Cakes where cakeID = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String imageFolder = new DataConnection().getImageFolder();
            con = DataConnection.connToMssql();
            ps = con.prepareStatement(query);

            ps.setInt(1, cakeID);
            rs = ps.executeQuery();
            while (rs.next()) {
                String imagePath = imageFolder + rs.getString("imagePath");
                String name = rs.getString("name");
                String desc = rs.getString("description");
                double price = rs.getDouble("price");
                cake = new Cake(cakeID, name, desc, imagePath, price);
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
        return cake;
    }
}
