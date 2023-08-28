/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entity;

/**
 *
 * @author tanlu
 */
public class SharePage {
    private String host, link;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public SharePage() {
    }

    public SharePage(String host, String link) {
        this.host = host;
        this.link = link;
    }
    
    
}
