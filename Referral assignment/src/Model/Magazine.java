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
public class Magazine extends Resource{
    
    public Magazine(String tempResourceName, int tempTypeInt, int tempDeweyClass, String tempTypeName, Boolean tempOverdue){
        super(tempResourceName, tempTypeInt, tempDeweyClass, tempTypeName, tempOverdue);
    
    }
}