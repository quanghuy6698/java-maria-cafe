/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Beans.*;
import com.Entity.SharePage;
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
public class SharePageDAO {

    public List<SharePage> getSharePages() throws Exception {
        List<SharePage> sharePages = new ArrayList<>();

        String query = "select * from SharePages";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DataConnection.connToMssql();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String host = rs.getString("host");
                String link = rs.getString("link");
                sharePages.add(new SharePage(host, link));
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
        return sharePages;
    }
}
