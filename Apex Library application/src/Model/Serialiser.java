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
    private String name;
    
    public Serialiser(String fileName){
        name = fileName;
    }
    
    /**
     *
     * @param filename
     */
    public void setName(String fileName){
        name = fileName;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }
    
    /**
     *
     * @return
     */
    public Serializable readObject(){
        Serializable loadedObject = null;
        try {
         FileInputStream fileIn = new FileInputStream(name);
         
         ObjectInputStream in = new ObjectInputStream(fileIn);
         
         loadedObject = (Serializable) in.readObject();
         
         in.close();
         
         fileIn.close();
         
         System.out.println("Data loaded from: "+ name);
         
        } catch (IOException i) {
            
            System.out.println("File not found");
            
            i.printStackTrace();
            
        } catch (ClassNotFoundException c) {
            
            System.out.println("Class not found");
            
            c.printStackTrace();
        }
        return loadedObject;
    }
    
    /**
     *
     * @param object
     * @return
     */
    public boolean writeObject(Serializable object){
        try {
            FileOutputStream fileOut = new FileOutputStream(name);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(object);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in: " + name);
            return true;
         } catch (IOException i) {
            System.out.println("Failed to load!");
            i.printStackTrace();
            return false;
         }
    }
}
