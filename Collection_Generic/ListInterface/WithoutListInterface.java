package Collection_Generic.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class WithoutListInterface {
    public static void main(String[] args) {
        // Creating the list of Integer references using ArrayList
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        // Creating the list of Integer reference using LinkedList class
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        // Creating the list of Integer references using the stack
        Stack<Integer> list3 = new Stack<Integer>();

        // Creating the list of Integer reference using the vector class
        Vector<Integer> list4 = new Vector<Integer>();
    }
}
