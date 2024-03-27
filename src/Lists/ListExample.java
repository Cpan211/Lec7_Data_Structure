/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lists;

import java.util.*;

/**
 *
 * @author chris
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("is");
        words.add("awesome");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.print(word + " ");
            if (word.equals("is") || word.equals("Java")) {
                iterator.remove();
            }
        }
        
        

//        a.World Hello
//        b.Hello World
//        c.World World
//        d.Hello Hello
        // Create a List using ArrayList
        List<String> myList = new ArrayList<>();

        // Add elements to the list
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        // Print the elements of the list
        System.out.println("List: " + myList);

        // Add an element at a specific index
        myList.add(1, "grape");

        // Print the list after adding at index
        System.out.println("List after adding at index: " + myList);

        // Get an element at a specific index
        String elementAtIndex = myList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        // Remove an element
        myList.remove("banana");

        // Print the list after removal
        System.out.println("List after removal: " + myList);

        // Create a sublist
        List<String> subList = myList.subList(0, 2);
        System.out.println("Sublist: " + subList);

        // Set an element at a specific index
        myList.set(0, "kiwi");

        // Print the list after setting an element
        System.out.println("List after setting element: " + myList);

    }

}
