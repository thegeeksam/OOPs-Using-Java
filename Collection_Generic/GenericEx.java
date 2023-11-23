package Collection_Generic;

public class GenericEx {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(64);

        // Calling generic method with String argument
        genericDisplay("Hello CSE!");

        // Calling generic method with double argument
        genericDisplay(2.45);
    }
}