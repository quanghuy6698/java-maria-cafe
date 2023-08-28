/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Beans.*;
import com.Entity.SelfDescription;
import com.context.DataConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tanlu
 */
public class SelfDescriptionDAO {

    public SelfDescription getSelfDescriptions() throws Exception {

        String query = "select * from SelfDescriptions";
        String imageFolder = new DataConnection().getImageFolder();
        String imagePath = null, title = null, content = null, sign = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DataConnection.connToMssql();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                imagePath = imageFolder + rs.getString("imagePath");
                title = rs.getString("title");
                content = rs.getString("description");
                sign = rs.getString("sign");
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
        return new SelfDescription(title, content, imagePath, sign);
    }
}
