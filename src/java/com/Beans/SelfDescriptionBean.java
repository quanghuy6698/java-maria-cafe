/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import com.Entity.SelfDescription;
import com.dao.SelfDescriptionDAO;

/**
 *
 * @author tanlu
 */
public class SelfDescriptionBean {

    public SelfDescription getSelfDescriptions() throws Exception {
        return new SelfDescriptionDAO().getSelfDescriptions();
    }
}
