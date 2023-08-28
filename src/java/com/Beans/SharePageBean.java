/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import com.Entity.SharePage;
import com.context.DataConnection;
import com.dao.SharePageDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanlu
 */
public class SharePageBean {

    public List<SharePage> getSharePages() throws Exception {
        return new SharePageDAO().getSharePages();
    }
}
