package Collection_Generic.MapInterface;

import java.util.LinkedHashMap;
// import java.util.Map;

// allows one null key and multiple null values.
// maintains order in which key-value pairs are inserted.
public class LinkedHashMapEx {
    public static void main(String[] args) {

        // Creating an empty LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Inserting entries in the Map
        // using put() method
        lhm.put("Uthayaa", 174);
        lhm.put("Rajkumar", 171);
        lhm.put("Vekkash", 175);
        lhm.put(null, null);// null key and null value
        lhm.put(null, 0);
        lhm.put("Rahman", null);
        lhm.put("Vekkash", 176);
        System.out.println(lhm);

        System.out.println(lhm.keySet());
        System.out.println(lhm.values());

        // Iterating over LinkedHashMap
        for (String Key : lhm.keySet()) {
            // Printing key-value pairs
            System.out.println(Key + " = " + lhm.get(Key));
        }
    }
}
