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
public class Client extends User{   

        public Client(String tempUsername, String tempPassword, boolean tempIsAdmin, String tempFirstName, String tempLastName){
            super(tempUsername, tempPassword, tempIsAdmin, tempFirstName, tempLastName);
        }
}
