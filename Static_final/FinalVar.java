package Static_final;

public class FinalVar {
    public static void main(String[] args) {
        // Declare a final variable
        final int myNumber = 10;

        // Attempting to reassign the final variable
        // Uncommenting this line will cause an error
        // myNumber = 20;

        // Using the final variable in some calculations
        int result = myNumber * 5;
        System.out.println("Result: " + result);
    }
}
