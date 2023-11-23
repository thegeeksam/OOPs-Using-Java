package LambdaExpression;

//------> Lambda Example 4: parameter <------
interface StringFunction {
    String run(String str);
}

public class ParameterAdvance {
    public static void main(String[] args) {
        // passing lambda expression as a parameter to run()
        StringFunction exclaim = (s) -> s + "!";
        // passing lambda expression as a parameter to run()
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
