package Collection_Generic.ListInterface;

import java.util.*;

public class ArrayListEx {
    public static void main(String args[]) {
        // create an ArrayList of String type
        // Creating the list of Integer references using ArrayList
        ArrayList<String> str = new ArrayList<String>();

        // 1. Initialize an ArrayList with add()

        str.add("II");
        str.add("CSE");
        str.add("C");

        // print the ArrayList
        System.out.println("ArrayList is" + str);

        // 2. Initialize ArrayList using asList method
        ArrayList<String> str1 = new ArrayList<String>(
                Arrays.asList("I",
                        "love",
                        "Java"));

        // print the ArrayList
        System.out.println("ArrayList is " + str1);

        // 3. Initialize ArrayList using List.of() method
        // Creating ArrayLis using list interface
        List<String> str2 = new ArrayList<>(
                List.of("Coding",
                        "is",
                        "Fun"));

        // to print the ArrayList
        System.out.println("ArrayList is " + str2);

    }
}
