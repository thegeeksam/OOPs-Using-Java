package Static_final;

public class StaticBlock {
    // static variable declaration
    static int area;
    static int radius;
    
    // static block declaration
    static {
        System.out.println("Invoked java static block!");
        // initializing radius and area static variable
        radius = 4;
        area = radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("In the main() function");
        System.out.println("Area of square with radius " + radius + ": " + area);
    }
}
