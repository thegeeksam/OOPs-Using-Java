package Collection_Generic.SetInterface;

import java.util.*;

// It maintains a linked list of entries in the set and 
// hence maintains the order in which they were inserted.
// LinkedHashSet is non-synchronized means multiple threads at a time can access the code. 
// It is slower than HashSet and TreeSet.
// Allows only one null value.

public class LinkedHashSetExp {
    public static void main(String args[]) {
        // creating a HashSet
        LinkedHashSet<String> str = new LinkedHashSet<String>();

        // displaying the initial size
        System.out.println("Size at the beginning " + str.size());

        // add elements
        str.add("Hello");
        str.add("II");
        str.add("CSE C");
        str.add("Students");
        str.add("Students");

        // displaying the LinkedHashSet
        System.out.println(str);

        // displaying the size
        System.out.println("Size after addition " + str.size());

        // remove element using value
        str.remove("Students");

        // display the new LinkedHashSet
        System.out.println(str);

        // display the new size
        System.out.println("Size after removal " + str.size());
        str.addFirst("hello");
        str.addLast(null);
        System.out.println(str.contains("Hello"));
        System.out.println(str);
    }
}
