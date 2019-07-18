/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rcarter4
 */
public abstract class Users {
    
    private int id;
    private String password;
    private boolean isAdmin;
    private String firstName;
    private String lastName;
    
    public Users (int tempId, boolean tempIsAdmin, String tempPassword, String tempFirstName, String tempLastName){
    
        id = tempId;
        password = tempPassword;
        isAdmin = tempIsAdmin;
        firstName = tempFirstName;
        lastName = tempLastName;
        
    }   

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
    
    
    
    
}
