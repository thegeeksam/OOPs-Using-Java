package JavaString;

public class LiteralNew {
    public static void main(String args[]) {
        // String Literal
        String str1 = "Hello";// , II CSE C!";
        // New String is not created.
        // str2 is pointing to the old string value only.
        String str2 = "Hello";// , II CSE C!";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // using new keyword
        String str3 = new String("Hello, II CSE C");
        System.out.println(str3.hashCode());
        String str4 = new String("Hello, II CSE C");
        System.out.println(str4.hashCode());
    }
}