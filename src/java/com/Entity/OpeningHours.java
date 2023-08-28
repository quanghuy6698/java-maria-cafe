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
public class OpeningHours {
    private String weekend, weekdays, closed;

    public OpeningHours() {
    }

    public OpeningHours(String weekend, String weekdays, String closed) {
        this.weekend = weekend;
        this.weekdays = weekdays;
        this.closed = closed;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }

    public String getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }
    
    
    
}
