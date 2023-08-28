/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import com.Entity.Cake;
import com.dao.CakesDAO;
import java.util.List;

/**
 *
 * @author tanlu
 */
public class CakesBean {

    private int cakeID;

    public void setCakeID(int cakeID) {
        this.cakeID = cakeID;
    }

    public List<Cake> getTop2Cakes() throws Exception {
        return new CakesDAO().getTop2Cakes();
    }
    
    public Cake getSpeciCake() throws Exception {
        return new CakesDAO().getSpeciCake(cakeID);
    }
}
