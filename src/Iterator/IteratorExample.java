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


        
        
//        
//   
//        List newList = new ArrayList<>(myList);
//        
//        
//        
////        System.out.println(myList);
//        
//        
//        newList.add("Pinaple");
//        System.out.println(newList);

        
        
//        System.out.println(newList);
        
//        
//        
//        
////        l.addAll(myList);
//        
//        l.add("Chris");
//        /*
//          //Another way to populate myList, 
//          List<String> myList1 = Arrays.asList("apple","banana","orange");
//
//        */
//        
//        
        // Instantiating iterator
        
        
        List<String> myList = new ArrayList<>();
        myList.add("apple"); //index 0
        myList.add("banana"); // index 1
        
        myList.add("orange"); // index 2
        
        
        Iterator<String> iterator = myList.iterator();
        
        
        
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);        
        }
        
        System.out.println(myList);

        // After using remove(), "banana" is removed from the list
//        System.out.println("List after removal: " + l);
        
//        String s = "12+134av$";
//        int num = 0;
//        for (int i =0; i< s.length(); i++){
//            char c=s.charAt(i);
//            if(Character.isDigit(c))
//                num=num*10+(int)(c-'0');
//        
        }
        
        //12134
        
        
    }

