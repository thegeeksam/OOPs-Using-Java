package Collection_Generic.ListInterface;

import java.util.*;

// Vectors in Java are used for creating dynamic array
// Vectors are synchronized, which implies that at a time,
// only one thread is able to access the code while other threads
// have to wait. Due to this, Vectors are slower in performance 
// as they acquire a lock on a thread.
public class VectorEx {
    public static void main(String args[]) {
        // creating a Vector
        Vector<Integer> v = new Vector<Integer>();

        // displaying the size
        System.out.println("Size at the beginning " + v.size());

        // add elements
        v.add(19);
        v.add(88);
        v.add(1);
        v.add(39);

        // displaying the Vector
        System.out.println(v);

        // displaying the size
        System.out.println("Size after addition " + v.size());

        // remove element at index 3
        // Integer  a = asdkjfbasdkg
        v.remove(3);

        // display the new Vector
        System.out.println(v);

        // display the new size
        System.out.println("Size after removal " + v.size());
        Vector<Integer> v1 = new Vector<Integer>(
                Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(v1);
    }
}