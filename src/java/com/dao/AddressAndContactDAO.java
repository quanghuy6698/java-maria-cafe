/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Entity.AddressAndContact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.context.DataConnection;

/**
 *
 * @author tanlu
 */
public class AddressAndContactDAO {

    public List<AddressAndContact> getAddressAndContacts() throws Exception {
        List<AddressAndContact> contacts = new ArrayList<>();
        String query = "select * from AddressAndContact";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DataConnection.connToMssql();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String description = rs.getString("description");
                contacts.add(new AddressAndContact(phone, email, address, description));
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
        return contacts;
    }

}
