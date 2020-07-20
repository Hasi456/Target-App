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
public class Target {
    
    private String name;
    private double amount;
    private Date targetDate;
    
    public String getName(){ //Getter | Accessor
        if(name.contains("Girl")){ //Info Hiding
           name = name.replace("Girl", "Friend");
        }
        return name;
    }
    
    public void setName(String name){   //Setter | Mutators
        this.name = name;
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
        if(amount>0){   //Data Validation
            this.amount = amount;
        }
    }

    /**
     * @return the targetDate
     */
    public Date getTargetDate() {
        return targetDate;
    }

    /**
     * @param targetDate the targetDate to set
     */
    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return getName()+" "+getAmount(); 
    }
    
    
    
    
}
