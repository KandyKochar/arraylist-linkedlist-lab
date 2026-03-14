package ArraysLinked;

import java.util.ArrayList;

public class ArrayListLab {

    public static void main(String[] args) {


        // Creating an ArrayList object that will store String elements.
        // ArrayList is part of the Java Collections Framework and works like a dynamic array.
        // It automatically resizes as elements are added or removed.
        ArrayList<String> arrayList = new ArrayList<String>();

        // Adding elements to the ArrayList using the add() method.
        // Each element is inserted sequentially at the end of the list.
        // Here we add five names 
     
        arrayList.add("Shaurya");
        arrayList.add("Kandy");
        arrayList.add("Anmol");
        arrayList.add("Anastassia");
        arrayList.add("Eli");

        // Accessing an element using the get(index) method.
        // ArrayList uses zero-based indexing, so the third element is at index 2.
        // This retrieves and prints the value stored at that position.System.out.println("Third element: " + arrayList.get(2));
        System.out.println("Third element: " + arrayList.get(2));
        
        // Modifying an existing element using the set(index, value) method.
        // This replaces the value currently stored at index 1.
        // Change the second element to "Ben"
        arrayList.set(1, "Ben");

        // Removing an element using the remove(index) method.
        // Removing the first element causes the remaining elements to shift left.
        // After removal, the list automatically adjusts its indices.
        arrayList.remove(0);

        // Print the entire list
        System.out.println("Updated ArrayList: " + arrayList);
    }
}
