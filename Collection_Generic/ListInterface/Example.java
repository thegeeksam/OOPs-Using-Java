package Collection_Generic.ListInterface;

import java.util.LinkedList;

public class Example {
    public static void main(String args[]) {
        // creating a LinkedList
        LinkedList<Integer> list = new LinkedList<Integer>();

        // displaying the initial size
        // add elements
        list.add(12);
        list.add(13);
        list.add(1);
        System.out.println(10);

        list.addFirst(45);
        list.addLast(36);

        list.add(2, 123);

        // displaying the LinkedList
        System.out.println(list);

        // displaying the size
        // System.out.println("Size after addition " + list.size());
        Integer a = 1;
        list.remove(a);
        list.remove(1);
        System.out.println(list);

        System.out.println(list);

        // display the new LinkedList
        System.out.println("New Linked List " + list);

        // display the new size
        System.out.println("Size after removal " + list.size());
    }
}
