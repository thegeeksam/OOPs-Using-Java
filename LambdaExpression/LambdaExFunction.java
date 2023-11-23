package LambdaExpression;

//------> Lambda Example 1: Anonymous class - 🐑Lambda expression <------

// A functional interface is an interface
// that contains only one abstract method.
// They can have only one functionality to exhibit.
@FunctionalInterface
interface CSE {
    void CseMethod();
}

public class LambdaExFunction {
    public static void main(String[] args) {
        // Before Java 8
        // without lambda, MyName implementation
        // using anonymous class
        CSE person = new CSE() {
            @Override // Optional annotation
            public void CseMethod() {
                System.out.println("Before Java 8 without lambda!");
            }
        };

        // Java 8: Using lambda expression
        CSE p2 = () -> System.out.println("Lambda Implemented!");

        person.CseMethod();
        p2.CseMethod();
    }

}
