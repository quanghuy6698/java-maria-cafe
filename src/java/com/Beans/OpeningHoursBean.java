/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import com.Entity.OpeningHours;
import com.dao.OpeningHoursDAO;

/**
 *
 * @author tanlu
 */
public class OpeningHoursBean {

    public OpeningHours getOpeningHours() throws Exception {
        return new OpeningHoursDAO().getOpeningHours();
    }
}
