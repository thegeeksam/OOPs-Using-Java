package Collection_Generic.MapInterface;

import java.util.Map;
import java.util.TreeMap;

// does not allow null key but allow multiple null values.
// maintains order. 
// stores keys in sorted and ascending order.
// Slow Compared to HashMap and LinkedHashMap 
public class TreeMapEx {
    public static void main(String[] args) {

        // Creating an empty TreeMap
        Map<String, Integer> tmap = new TreeMap<>();

        // Inserting entries in the Map
        // using put() method
        tmap.put("Uthayaa", 174);
        tmap.put("Rajkumar", 171);
        tmap.put("Vekkash", 176);

        System.out.println(tmap);

        System.out.println(tmap.keySet());
        System.out.println(tmap.values());

        // Iterating over LinkedHashMap
        // This will generate exception
        for (String key : tmap.keySet()) {
        // Printing key-value pairs
        System.out.println(key + " = " + tmap.get(key));
        }

        // for (String Key : tmap.keySet()) {
        // // Printing key-value pairs
        // System.out.println(Key + " = " + tmap.get(Key));
        // }

    }
}

// Ignore this section
/*
 * // Iterating over Map
 * for (Map.Entry<String, Integer> i : tmap.entrySet())
 * 
 * // Printing key-value pairs
 * System.out.println(i.getKey() + " "
 * + i.getValue());
 */