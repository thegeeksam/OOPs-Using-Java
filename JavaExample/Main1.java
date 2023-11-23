package JavaExample;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running.");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.run();

        Vehicle obj2 = new Vehicle();
        obj2.run();
    }
}