package Abstraction;

abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

public class AbstractClass {

    public static void main(String cseC[]) {
        Animal myObj = new Animal();
        // will generate an error because we cannot create an instance of an abstract
        // class
    }
}