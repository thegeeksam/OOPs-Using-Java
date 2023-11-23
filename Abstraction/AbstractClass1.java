package Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    public abstract void eat();

    // Concrete method
    public void sleep(String animalName) {
        System.out.println(animalName + " Zzz");
    }
    // public void sleep() {
    // System.out.println("Zzz");
    // }
}

// Subclass inherit from Animal
class Lion extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Lion Roars!\n");
    }

    public void eat() {
        System.out.println("The Lion eats meat");
    }
}

class LionCub extends Lion {
    public void eat() {
        System.out.println("The Lion eats meat");
    }
}

public class AbstractClass1 {
    public static void main(String[] args) {
        Animal myLion = new Lion(); // Create a LionCub object
        myLion.animalSound();
        myLion.eat();
        myLion.sleep("Lion");
    }
}