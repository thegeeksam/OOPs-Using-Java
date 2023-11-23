package Collection_Generic.ListInterface;

import java.util.*;

public class LinkedListEx {
    public static void main(String args[]) {
        // creating a LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // displaying the initial size
        System.out.println("Size at the beginning " + list.size());

        // add elements
        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        System.out.println(list);

        list.addFirst("C");
        list.addLast("C#");

        list.add(2, "Python");

        // displaying the LinkedList
        System.out.println("Modified Linked List " + list);

        // displaying the size
        // System.out.println("Size after addition " + list.size());

        // Removing elements from the LinkedList based on index "Position"
        list.remove(5);
        System.out.println(list);
        // Removing elements from the LinkedList based on Object "Value"
        list.remove("C#");
        System.out.println(list);

        // Sorting the LinkedList
        list.sort(null);
        // Traversing the LinkedList
        System.out.println(list.contains("C++"));

        // Searching the LinkedList for an element
        System.out.println(list.indexOf("Python"));

        // display the new LinkedList
        System.out.println("New Linked List " + list);

        // display the new size
        System.out.println("Size after removal " + list.size());
    }
}