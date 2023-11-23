package Static_final;

// Java code to demonstrate the use of static nested classes
public class StaticClass {
    private static String programmingLanguage = "JAVA";

    // declaring a static nested class
    static class staticNestedClass {
        // can access name variable here as it is static variable
        // non-static method
        public void display() {
            System.out.println(programmingLanguage);
        }
    }

    public static void main(String args[]) {
        StaticClass.staticNestedClass ins1 = new StaticClass.staticNestedClass();
        ins1.display();
    }
}
