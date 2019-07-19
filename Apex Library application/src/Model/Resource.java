/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ryan
 */
public abstract  class Resource {
    
    private String resourceName;
    private int typeInt;
    private String typeName;
    private Boolean overdue;
    
    
    public Resource (String tempResourceName, int tempTypeInt, String tempTypeName, Boolean tempOverdue){
    
        resourceName = tempResourceName;
        typeInt = tempTypeInt;
        typeName = tempTypeName;
        overdue = tempOverdue;       
        
        
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public int getTypeInt() {
        return typeInt;
    }

    public void setTypeInt(int typeInt) {
        this.typeInt = typeInt;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Boolean getOverdue() {
        return overdue;
    }

    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }
    
    
    
    
    
}
