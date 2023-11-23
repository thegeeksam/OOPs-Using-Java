package This_Super;

// The “this” keyword is used to invoke the methods of 
// the current object or class.     

class Illustration2 {

    // current class method
    void app() {
        System.out.print("My name is ");
    }

    void name() {
        // invoking current class scaler method.
        this.app();
        System.out.println("Ravi.");
    }
}

public class this2 {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration2 obj = new Illustration2();
        obj.name();
    }
}
