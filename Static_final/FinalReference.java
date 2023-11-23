package Static_final;

public class FinalReference {
    public static void main(String[] args) {
        // Final reference variable
        final StringBuffer strBuffer = new StringBuffer("Hello, II CSE C!!!");

        // Printing the element in strBuffer
        System.out.println(strBuffer);

        // changing internal state of object reference by
        // final reference variable strBuffer
        strBuffer.append("World");

        // Printing the element in strBuffer
        System.out.println(strBuffer);
    }
}
