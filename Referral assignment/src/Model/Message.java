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
 * 
 * This class is specifically for messages that are automatically sent when
 * resources are due or overdue.
 * 
 * 
 */
public class Message {
    
    private String senderID;
    private String messageContents;
    
    
    public Message (String tempSenderID, String tempMessageContents){
        
        senderID = tempSenderID;
        messageContents = tempMessageContents;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getMessageContents() {
        return messageContents;
    }

    public void setMessageContents(String messageContents) {
        this.messageContents = messageContents;
    }
    
    
    
}
