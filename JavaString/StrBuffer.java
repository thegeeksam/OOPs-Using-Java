package JavaString;

public class StrBuffer {
    public static void main(String[] args) {
        // StringBuffer is mutable
        // StringBuffer s = new StringBuffer();
        StringBuffer s = new StringBuffer("SECE: ");
        System.out.println(s.capacity()); // Capacity is 16 by default
        // Error: Can't convert StringBuffer to String
        // s = s + "Hello";
        System.out.println(s.length());

        // Append some content to StringBuffer
        System.out.println(s.append("Hello, II CSE C!"));
        System.out.println(s.capacity());
        System.out.println(s.length());

        // If the capacity of StringBuffer gets full after adding
        // an extra String, the new capacity of StringBuffer will be
        // (previousCapacity + 1) * 2
        System.out.println(s.append("!"));
        System.out.println(s.length());
        System.out.println(s.capacity());

    }
}
