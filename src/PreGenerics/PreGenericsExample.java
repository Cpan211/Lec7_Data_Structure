package PreGenerics;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class PreGenericsExample {
    
     public static void main(String[] args) {
        List myList = new ArrayList(); // A list that can hold any type of object
        myList.add("Hello");  // Adding a String
        myList.add(10);       // Adding an Integer -- No compilation Error
        
        for (Object item : myList) {
            // Trying to cast every item in the list to String
            try {
                String strItem = (String) item; // No Compilation Error but Might throw a Runtime error
                System.out.println(strItem);
            } catch (ClassCastException e) {
                System.err.println("Error: Attempted to cast an object to an incorrect type.");
            }
        }
    }
    
}
