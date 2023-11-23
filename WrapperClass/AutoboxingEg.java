package WrapperClass;
//Autoboxing example of int to Integer and char to Char

public class AutoboxingEg {

    public static void main(String args[]) {
        int a = 50;
        // char a = 'a';
        Integer num = new Integer(a); // Boxing
        // Converting int into Integer explicitly
        Integer first = Integer.valueOf(a);

        Integer second = a; // Autoboxing

        System.out.println(a);
        System.out.println(first);
        System.out.println(second);
    } // Refer PrimitiveToWrapper.java also
}
