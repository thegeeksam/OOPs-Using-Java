package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx1 {
    public static void main(String[] args) {
        // Defining Own logic for sorting using Comparator
        // Comparator is a functional interface in Java that can sort objects.
        // It is used for the custom ordering of objects.
        // It has a method called compare() which compares two objects and
        // returns an integer value based on the comparison.
        // -1: Returns a negative value if the first argument’s value is less than the
        // value of the second argument.
        // 1: Returns a positive value if the first argument’s value is greater than the
        // value of the second argument.
        // 0: Returns a zero value if the first argument’s value is equal to the value
        // of the second argument.
        Comparalstor<Integer> cc = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };
        // Using lambda expression
        Comparator<Integer> cc1 = (i, j) -> i % 10 > j % 10 ? 1 : -1;

        Comparable<Integer> c = new Comparable<Integer>() {
            public int compareTo(Integer i) {
                return 0;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        System.out.println("Original Content: " + nums);
        // Default Sorting
        Collections.sort(nums);
        System.out.println("Sorted Content: " + nums);
        // Custom Sorting - Sorting based on last digit
        Collections.sort(nums, cc1);
        System.out.println("Newly Sorted Content: " + nums);

    }
}
