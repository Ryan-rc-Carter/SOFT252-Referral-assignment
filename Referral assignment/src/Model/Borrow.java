/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.Serializable;
import java.time.LocalDate;



/**
 *
 * @author Ryan
 */
public class Borrow {
    
    private String borrower;
    private int resourceID;
    private String resourceName;
    private LocalDate returnDate;
    private int daysBorrowed;
    private boolean extensionRequested;
    private boolean overdue;
    
    public Borrow (String tempBorrower, int tempResourceID, String tempResourceName, LocalDate tempReturnDate, int tempDaysBorrowed, boolean tempExtensionRequested, boolean tempOverdue){
        
        
        borrower = tempBorrower;
        resourceID = tempResourceID;
        resourceName = tempResourceName;
        returnDate = tempReturnDate;
        daysBorrowed = tempDaysBorrowed;
        extensionRequested = tempExtensionRequested;
        overdue = tempOverdue;
        
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

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate daysRemaining) {
        this.returnDate = daysRemaining;
    }

    public int getDaysBorrowed() {
        return daysBorrowed;
    }

    public void setDaysBorrowed(int daysBorrowed) {
        this.daysBorrowed = daysBorrowed;
    }

    public boolean isExtensionRequested() {
        return extensionRequested;
    }

    public void setExtensionRequested(boolean extensionRequested) {
        this.extensionRequested = extensionRequested;
    }

    public boolean isOverdue() {
        return overdue;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }
    
    
    
}
