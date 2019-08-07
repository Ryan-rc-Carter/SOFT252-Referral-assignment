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
public class Resource {
    
    private String resourceName;
    private int id;
    private int deweyClass;
    private String typeName;
    private String overdue;    

    public Resource (String tempResourceName, int tempId, int tempDeweyClass, String tempTypeName, String tempOverdue){
    
        resourceName = tempResourceName;
        id = tempId;
        deweyClass = tempDeweyClass;
        typeName = tempTypeName;
        overdue = tempOverdue;       
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getDeweyClass() {
        return deweyClass;
    }

    public void setDeweyClass(int deweyClass) {
        this.deweyClass = deweyClass;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }
    
    
    
}
