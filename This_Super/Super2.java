package This_Super;

// The super keyword is used to invoke an immediate 
// parent class method.

// parent class
class Parent2 {

    // declaring display method parent class
    void display() {
        System.out.println("Hi I am parent method.");
    }
}

// child class extending parent class
class Child2 extends Parent2 {

    // declaring display method in Child class
    void display() {
        System.out.println("Hi I am child method.");
    }

    void print() {
        // invoking display method from parent class
        super.display();
        // display method from child class
        display();
    }
}

public class Super2 {

    public static void main(String[] args) {
        // creating instance of child class
        Child2 obj = new Child2();
        obj.print();
    }
}
