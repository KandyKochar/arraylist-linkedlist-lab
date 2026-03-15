package ArraysLinked;


import java.util.LinkedList;

public class LinkedListLab {

    public static void main(String[] args) {

    	// Creating a LinkedList object that will store Integer values.
        // LinkedList is another class from the Java Collections Framework.
        // Unlike ArrayList, it stores elements as nodes connected by references
        LinkedList<Integer> linkedList = new LinkedList<Integer>();


        // Adding elements to the LinkedList using the add() method.
        // Elements are inserted sequentially at the end of the list.
        // Here we add five integer values.
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Accessing the first element using the get(index) method.
        // Just like ArrayList, LinkedList also uses zero-based indexing.
        // Index 0 always refers to the first element of the list.
        System.out.println("First element: " + linkedList.get(0));

        // Inserting elements at specific positions in the list.
        // addFirst() inserts an element at the beginning of the list.
        
        linkedList.addFirst(15);

        // addLast() inserts an element at the end of the list.
        
        linkedList.addLast(55);

        // Removing an element from the list using removeLast().

        linkedList.removeLast();

     // Printing the entire LinkedList to display its current contents.
        System.out.println("Updated LinkedList: " + linkedList);
    }
}