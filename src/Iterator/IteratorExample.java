package Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;

/**
 *
 * @author chris
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        
        /*
          //Another way to populate myList, 
          List<String> myList1 = Arrays.asList("apple","banana","orange");

        */
        
        
        // Instantiating iterator
        Iterator<String> iterator = myList.iterator();
        
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // Let's remove the element "banana"
            if (element.equals("banana")) {
                iterator.remove();
            }
        }

        // After using remove(), "banana" is removed from the list
        System.out.println("List after removal: " + myList);
    }

}
