package Collection_Generic.ListInterface;

import java.util.*;

// Stack class extends the Vector class and it is its subclass.
// It works on the principle of Last-In, First-Out.
public class StackEx {
    public static void main(String args[]) {
        // creating a Stack
        Stack<Integer> s = new Stack<Integer>();

        // displaying the initial size
        System.out.println("Size at the beginning " + s.size());

        // push elements
        s.push(99);
        s.push(28);
        s.push(17);
        s.push(74);
        s.push(1);

        // displaying the Stack
        System.out.println("New Stack" + s);

        // displaying the size
        System.out.println("Size after addition " + s.size());

        // pop the element and display it
        System.out.println("Popped element " + s.pop());

        // display the new Stack
        System.out.println("New Stack after popping" + s);

        // display the new size
        System.out.println("Size after removal " + s.size());

        // peek method to find the top-most element and display it
        System.out.println("Top-most element " + s.peek());

    }
}