package This_Super;

// The super keyword is used to invoke an immediate parent class constructor.
// parent class
class Parent3 {

  // parent class constructor
  Parent3() {
    System.out.println("Hi I am Parent class constructor.");
  }
}

// child class extending parent class
class Child3 extends Parent3 {

  // child class constructor
  Child3() {
    // invoking parent class constructor

    // super();
    System.out.println("Hi I am Child class constructor.");
    // super();
  }

  void print() {
    System.out.println("Hello");
  }
}

public class Super3 {

  public static void main(String[] args) {
    // creating instance of child class
    Child3 obj = new Child3();
    obj.print();
  }
}
