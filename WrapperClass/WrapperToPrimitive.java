package WrapperClass;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        // creates objects of wrapper class
        Integer aObj = Integer.valueOf(23);
        Double bObj = Double.valueOf(5.55);

        // converts into primitive types
        // int a = aObj.intValue();
        int a = aObj;
        // double b = bObj.doubleValue();
        double b = bObj;

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
    }
}
