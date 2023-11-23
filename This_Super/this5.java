package This_Super;

// The “this” keyword can be passed as
// an argument in the constructor call.
class A {

    // instance variable
    B tmp;

    // parameterized constructor
    A(B tmp) {
        this.tmp = tmp;
    }

    // print method
    void print() {
        System.out.println("The number is : " + tmp.val);
    }
}

class B {

    // instance variable
    int val = 50;

    // constructor
    B() {
        // creating instance of A
        // passing “this” as an argument in constructor call
        A obj = new A(this);
        obj.print();
    }
}

public class this5 {

    public static void main(String[] args) {
        B b = new B();
    }
}
