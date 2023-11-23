package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// if we wish to sort this collection based on several criteria/fields,
// we can use the Comparator interface.

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        // super();
        this.age = age;
        this.name = name;
    }
}

public class LambdaComparator {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        // Adding person details to list
        list.add(new Person(20, "SivaRam"));
        list.add(new Person(19, "SivaSakthi"));
        list.add(new Person(06, "Agilan"));

        System.out.println("Sorting on the basis of the name of the person...");

        // implementing lambda expression
        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));

        // printing sorted list
        for (Person p : list) {
            System.out.println(p.name + " " + p.age);

        }
    }

}
