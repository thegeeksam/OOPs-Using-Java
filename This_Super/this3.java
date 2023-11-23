package This_Super;

//The this keyword is used to invoke the 
//constructors of the current class. 
// Illustration class
class Illustration3 {

    // simple constructor
    Illustration3() {
        // invoking parameterized constructor
        this(10);
    }

    // parameterized constructor
    Illustration3(int x) {
        System.out.println("Current class parameterized constructor invoked.");
        System.out.println("Number is : " + x);
    }
}

public class this3 {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration3 obj = new Illustration3();
    }
}
