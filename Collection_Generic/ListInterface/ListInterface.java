package Collection_Generic.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
    public static void main(String[] args) {
        // Creating the list of Integer references
        List<Integer> list1 = new ArrayList<Integer>();

        // Creating the list of Integer reference using LinkedList
        List<Integer> list2 = new LinkedList<Integer>();

        // Creating the list of Integer references using the stack
        List<Integer> list3 = new Stack<Integer>();

        // Creating the list of Integer reference using the vector class
        List<Integer> list4 = new Vector<Integer>();

    }
}
