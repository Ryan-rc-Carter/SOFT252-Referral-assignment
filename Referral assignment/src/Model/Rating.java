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
public class Rating {
    
    private int userRating;
    private double averageRating;
    private ArrayList<Integer> ratingList;
    
    

    
    public void Rating(int tempUserRating, ArrayList<Integer> tempRatingList, double tempAverageRating){
        
        userRating = tempUserRating;
        ratingList = tempRatingList;
        averageRating = tempAverageRating;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public double getAverageRating() {
        
        
        
        
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
    
    
    
    
    
}
