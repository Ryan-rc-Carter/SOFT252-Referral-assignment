/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apex.library.application;

import Model.Serialiser;
import Model.Book;
import Model.Dvd;

/**
 *
 * @author rcarter4
 */
public class ApexLibraryApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Book b = new Book("Dummies guide to Netbeans", 1, 600, "book", false);
        System.out.println(b.getTypeName());
        Serialiser books = new Serialiser ("test.ser");
        books.writeObject(b);
        
        
        Dvd d = new Dvd("Planet Earth", 2, 500, "dvd", false);
        System.out.println(b.getTypeName());
        Serialiser dvds = new Serialiser ("testDvds.ser");
        dvds.writeObject(b);
        
        
        
    }
    
}
