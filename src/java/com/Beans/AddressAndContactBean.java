/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import com.Entity.AddressAndContact;
import java.util.List;
import com.dao.AddressAndContactDAO;

/**
 *
 * @author tanlu
 */
public class AddressAndContactBean {
    public List<AddressAndContact> getAddressAndContacts() throws Exception {
        return new AddressAndContactDAO().getAddressAndContacts();
    }
}
