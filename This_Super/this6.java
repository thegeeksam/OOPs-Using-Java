package This_Super;

// The this keyword is used to return the current instance of a class.
// Methods of the class can be called directly at the time of
// creating an object using this

// illustration class
class Illustration6 {

    Illustration6 getIllustration() {
        // returing the instance of current class
        return this;
    }

    void print() {
        System.out.println("Hello World!");
    }
}

public class this6 {

    public static void main(String[] args) {
        new Illustration6().getIllustration().print();
    }
}
