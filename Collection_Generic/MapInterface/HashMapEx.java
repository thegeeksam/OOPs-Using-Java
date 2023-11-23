package Collection_Generic.MapInterface;

// import java.util.Map;
import java.util.HashMap;

// It uses a hash table for storing key-value pairs.
// If we want to access a value in hash map,
// we must know its key.
// doesn't maintain insertion order.
// It may have one null key and multiple null values.
public class HashMapEx {
    public static void main(String args[]) {
        // Creating a HashMap
        HashMap<Integer, Double> hm = new HashMap<Integer, Double>();

        // adding key value pairs using put()
        hm.put(1, 1.9);
        hm.put(4, 4.6);
        hm.put(15, 5.5);
        hm.put(32, 3.7);
        hm.put(2, null);
        hm.put(null, null); // null key and null value
        // hm.put(null,0);
        hm.put(5, null);
        // hm.put(2, 21.8);
        System.out.println(hm);

        // Finding the value for a key using get()
        System.out.println("The Value for 1 is " + hm.get(1));

        // Changing the value for an existing key using put()
        hm.put(1, 1.5);
        hm.put(2, 3.8);
        System.out.println(hm);

        // Getting the hash code value for an element
        // System.out.println(hm.get(1).hashCode());
        // System.out.println(hm.put(17, 34.5).hashCode());

        // Checking the key using containsKey()
        System.out.println("Is key 1 present? " + hm.containsKey(1));

        // Removing the key-value pair using remove()
        hm.remove(1);
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);
    }
}
