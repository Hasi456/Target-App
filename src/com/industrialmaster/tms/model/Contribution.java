/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.industrialmaster.tms.model;

import java.util.Date;

/**
 *
 * @author Nadun Shyn
 */
public class Contribution {
    private Target target;
    private double amount;
    private Date date;

    /**
     * @return the target
     */
    public Target getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
