package Collection_Generic.SetInterface;

import java.util.*;

// uses hash table for storage which uses a mechanism called Hashing.
// In hashing, the informational content of a key determines a unique value, called its hash code.
// The hash code is then used as an index, at which the data associated with the key is stored.
// When we insert elements into the HashSet, it is not guaranteed that it gets stored in the same order.
// It is non-synchronized
// It is faster than LinkedHashSet and TreeSet.
// Allows only one null value.
public class HashSetEx {
    public static void main(String args[]) {
        // creating a HashSet
        HashSet<String> str = new HashSet<String>();

        // displaying the initial size
        System.out.println("Size at the beginning " + str.size());

        // add elements
        str.add("Hello");
        str.add("II");
        str.add("CSE C");
        str.add("Students");
        str.add("Students");
        str.add(null);

        // displaying the HashSet
        System.out.println(str);

        // displaying the size
        System.out.println("Size after addition " + str.size());

        // remove element using value
        str.remove("Students");

        // display the new HashSet
        System.out.println(str);

        // display the new size
        System.out.println("Size after removal " + str.size());

        // contains function checks whether an element is present in a set.
        System.out.println("HashSet contains \"CSE C\": " + str.contains("CSE C"));

        // clear function removes all the elements from a set.
        str.clear();
        System.out.println("set: " + str);

        // isEmpty function checks whether a set is empty or not.
        System.out.println(str.isEmpty());

    }
}