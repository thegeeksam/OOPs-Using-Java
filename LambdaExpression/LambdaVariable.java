package LambdaExpression;
//------> Lambda Example 6: Accessing Variable <------

interface MyInter {
    public String greet(String s);
}

public class LambdaVariable {
    public static void main(String[] args) {
        // This is only permitted if the variable being referred
        // to is "effectively final," that is,
        // its value does not change after it is allocated.
        String s1 = "Hello";
        // final String s1 = "Hello";
        MyInter g1 = (str) -> {
            return s1 + ", " + str;
        };

        System.out.println(g1.greet("Agilan"));

        // Uncommenting this line will generate an error.
        // s1 = "Hi";
    }
}
