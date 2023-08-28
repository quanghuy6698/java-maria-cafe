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
public class SelfDescription {
    private String title, content, imagePath, sign;

    public SelfDescription() {
    }

    public SelfDescription(String title, String content, String imagePath, String sign) {
        this.title = title;
        this.content = content;
        this.imagePath = imagePath;
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    
}
