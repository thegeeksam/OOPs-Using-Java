package Inheritance;

public class Bike extends Automobile {
    // Constructor
    public Bike() {
        // super();
        System.out.println("child class constructor invoked");
    }

    // Instance Initializer block
    {
        System.out.println("instance initializer block is invoked");
    }
}
