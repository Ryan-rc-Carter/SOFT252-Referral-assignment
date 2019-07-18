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
public class Client extends Users{
    
    public Client(int tempId,boolean tempIsAdmin, String tempPassword, String tempFirstName, String tempLastName) {
        super(tempId, tempIsAdmin, tempPassword, tempFirstName, tempLastName);
    }
    
}
