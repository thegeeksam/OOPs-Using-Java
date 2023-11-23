package WrapperClass;

public class WrapperObject {
    public static void main(String xyz[]) {
        Integer num = new Integer(77); // int
        Integer num2 = new Integer("Hello"); // String
        Double num3 = new Double(77.0); // double argument
        Float num4 = new Float(77.0f); // float argument
        Character c1 = new Character('s'); // character
        Boolean b = new Boolean(true); // value stored - true

        System.out.println(num + " " + num2 + " " + num3
                + " " + num4 + " " + c1 + " " + b);
    }
}