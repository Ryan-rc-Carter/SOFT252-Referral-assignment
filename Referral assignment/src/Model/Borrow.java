/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.Serializable;


/**
 *
 * @author Ryan
 */
public class Borrow {
    
    private String borrower;
    private int resourceID;
    private String resourceName;
    private int daysRemaining;
    
    public Borrow (String tempBorrower, int tempResourceID, String tempResourceName, int tempDaysRemaining){
        
        
        borrower = tempBorrower;
        resourceID = tempResourceID;
        resourceName = tempResourceName;
        daysRemaining = tempDaysRemaining;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }

    public void setDaysRemaining(int daysRemaining) {
        this.daysRemaining = daysRemaining;
    }
    
    
    
}
