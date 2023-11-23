package WrapperClass;

public class UnboxingExample {
    public static void main(String args[]) {

        // Integer a = new Integer(5);
        Integer a = 5;

        // Converting Integer to int explicitly
        int first = a.intValue();

        // Unboxing, now compiler will write a.intValue() internally
        int second = a; // Unboxing

        System.out.println(a);
        System.out.println(first);
        System.out.println(second);
    } // Refer WrapperToPrimitive.java also
}
