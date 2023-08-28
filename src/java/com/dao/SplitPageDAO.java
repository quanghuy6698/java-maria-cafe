/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Controllers.SplitPage;
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
public class SplitPageDAO {

    public List<Cake> getCakes(int page) throws Exception {
        SplitPage splitPage = new SplitPage();
        List<Cake> listCakes = new ArrayList<>();
        if (page == 0) {
            page = 1;
        }

        int from = (page - 1) * splitPage.getPAGE_SIZE() + 1;
        int to = page * splitPage.getPAGE_SIZE();
        String query = "exec GetProducts ?, ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String imageFolder = new DataConnection().getImageFolder();
            con = DataConnection.connToMssql();
            ps = con.prepareStatement(query);
            ps.setInt(1, from);
            ps.setInt(2, to);
            rs = ps.executeQuery();
            while (rs.next()) {
                String imagePath = imageFolder + rs.getString("imagePath");
                String name = rs.getString("name");
                String desc = rs.getString("description");
                double price = rs.getDouble("price");
                int cakeID = rs.getInt("CakeID");
                listCakes.add(new Cake(cakeID, name, desc, imagePath, price));
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
        return listCakes;
    }

    public int getTotalPages() throws Exception {
        return new SplitPage().getTotalPages();
    }
}
