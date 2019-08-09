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
public class State {
    
    
    private final int available = 0;
    private final int unavailable = 1;
    private final int overdue = 2;
    private int state;
    
    public State(){
        this.state = 0;
    }
    
    public void Borrow(){
        switch(this.state){
            case 0:
                this.state = 1;
                break;
            case 1:
                this.state = 1;
                break;
            case 3:
                this.state = 1;
                break;
        }
    }
    
    public void Return(){
        switch(this.state){
            case 0:
                this.state = 2;
                break;
            case 1:
                this.state = 2;
                break;
            case 3:
                this.state = 2;
                break;
        }
    }
    
    public void OverdueReturn(){
        switch(this.state){
            case 0:
                this.state = 1;
                break;
            case 1:
                this.state = 1;
                break;
            case 3:
                this.state = 1;
                break;
    
        }
    }
    
}
