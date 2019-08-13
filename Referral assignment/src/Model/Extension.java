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
public class Extension {
    
    private String requester;
    private int resourceID;
    private String resourceName;
    
    
    public Extension(String tempRequester, int tempResourceID, String tempResourceName){
        
        requester = tempRequester;
        resourceID = tempResourceID;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    
    
    
}
