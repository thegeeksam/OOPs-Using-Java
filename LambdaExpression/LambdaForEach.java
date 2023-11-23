package LambdaExpression;

//------> Lambda Example 3: ForEach Loop <------
import java.util.ArrayList;

public class LambdaForEach {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        // Without lambda expression
        for (int i : numbers) {
            // FOOD FOR THOUGHT: Why does this generate an error?
            // System.out.println(numbers.get(i));
            System.out.println(i);
        }
        // Using lambda expression
        System.out.println("Using lambda expression: ");
        // simplest lambda expression contains a single parameter and an expression:
        numbers.forEach((n) -> System.out.println(n));
    }
}
