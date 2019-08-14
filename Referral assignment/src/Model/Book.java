/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;



/**
 *
 * @author Ryan
 */
public class Book extends Resource{
    
    public Book(String tempResourceName, int tempID, int tempDeweyClass, String tempTypeName, boolean tempAvailable, double tempRating, ArrayList<Integer> tempRatingList){
        super(tempResourceName, tempID, tempDeweyClass, tempTypeName,tempAvailable, tempRating, tempRatingList);
    
    }
    
}
