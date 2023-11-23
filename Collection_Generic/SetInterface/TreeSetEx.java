package Collection_Generic.SetInterface;

import java.util.Set;
import java.util.TreeSet;

// The TreeSet class implements the Set Interface.
// It uses a tree to store the elements.
// TreeSet contains unique elements.
// The access and retrieval time is very fast.
// TreeSet is non-synchronized means multiple threads at a time can access the code. 
// It is faster than LinkedHashSet but slower TreeSet.
// null value not allowed, throw NullPointerException if inserted
public class TreeSetEx {
    public static void main(String[] args) {
        // Creating a TreeSet
        // Set<String> ts = new TreeSet<>();
        TreeSet<String> ts = new TreeSet<>();

        // Display the initial size
        System.out.println("Size at the beginning " + ts.size());

        // Elements are added using add() method
        ts.add("TamilNadu");
        ts.add("Kerala");
        ts.add("Karnataka");
        ts.add("AndraPradesh");
        ts.add("Telangana");

        // displaying the TreeSet
        System.out.println(ts);

        // displaying the size
        System.out.println("Size after addition " + ts.size());

        // Duplicates will not get inserted into the TreeSet
        ts.add("Assam");
        
        // Elements get stored in Ascending order
        System.out.println(ts);
        // Implementation for reversed() is available in TreeSet not in Set
        System.out.println(ts.reversed());
        ts.remove("Kerala");
        System.out.println(ts);
        ts.addFirst("Arunachal Pradesh");
        ts.addLast("Maharashtra");
        System.out.println(ts);
    }
}