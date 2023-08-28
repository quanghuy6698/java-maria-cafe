/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import com.Entity.Cake;
import com.dao.SplitPageDAO;
import java.util.List;

/**
 *
 * @author tanlu
 */
public class SplitPageBean {

    private int page = 1;

    public void setPage(int page) {
        this.page = page;
    }

    public List<Cake> getCakes() throws Exception {
        return new SplitPageDAO().getCakes(page);
    }

    public int getTotalPages() throws Exception {
        return new SplitPageDAO().getTotalPages();
    }
}
