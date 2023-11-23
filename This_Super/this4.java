package This_Super;

//The this keyword can be passed as an argument in a method 
//representing an object of a class. 

class Illustration4 {
    int value = 5;

    // print method
    void print(Illustration4 ob) {
        System.out.println("ob.value = " + ob.value);
    }

    void invoke() {
        // print method is invoked by passing this as an argument
        print(this);
    }
}

public class this4 {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration4 obj = new Illustration4();
        obj.invoke();
    }
}
