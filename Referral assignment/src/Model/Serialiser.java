/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Ryan
 */
public class Serialiser {
    private String fileName;
    
    public Serialiser(String tempFileName){
        fileName = tempFileName;
    }
    
    public void setName(String tempFileName){
        fileName = tempFileName;
    }
    
    public String getName(){
        return fileName;
    }
    
    
    public Serializable readObject(){
        Serializable loadedObject = null;
        try {
         FileInputStream fileInput = new FileInputStream(fileName);
         
         ObjectInputStream in = new ObjectInputStream(fileInput);
         
         loadedObject = (Serializable) in.readObject();
         
         in.close();
         
         fileInput.close();
         
         System.out.println("Data loaded from: "+ fileName);
         
        } catch (IOException i) {
            
            System.out.println("File not found");
            
            
            
        } catch (ClassNotFoundException c) {
            
            System.out.println("Class not found");
            
            
        }
        return loadedObject;
        
    }

public boolean writeObject(Serializable object){
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(object);
            
            out.close();
            
            fileOut.close();
            
            System.out.println("Serialized data is saved in: " + fileName);
            
            return true;
            
         } catch (IOException i) {
             
         
            System.out.println("Failed to load!");
                                    
            return false;    
         }   
    }    
}
