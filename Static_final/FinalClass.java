package Static_final;

// Final Class
final class X {
    public void displayX() {
        System.out.println("Hello World!");
    }
}

// This will generate Error
// Since we cannot inherit a final class
// class Y extends X { // Error
// public void displayY() {
// System.out.println("Welcome!");
// }
// }

public class FinalClass {
    public static void main(String[] args) {
        // Y varY = new Y();
    }
}
