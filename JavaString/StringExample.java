package JavaString;

public class StringExample {
    public static void main(String[] args) {
        // char[] cse = { 'C', 'S', 'E' };
        // System.out.println(cse);
        // String cse1 = "CSE";
        // System.out.println(cse1);

        // String str1 = "Hello, II CSE C!";
        // System.out.println(str1);

        // String str2 = "Hello, II CSE C!";
        // System.out.println(str2);

        // System.out.println(str1.hashCode());
        // System.out.println(str2.hashCode());

        String str3 = new String("Hello, II CSE C!");
        System.out.println(str3);

        String str4 = new String("Hello, II CSE C!");
        System.out.println(str4);
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        Integer i = 10;
        Integer j = 10;

        System.out.println(i.hashCode());
        System.out.println(j.intValue());
        System.out.println(Integer.hashCode(j));
        // Can't invoke hashCode() on primitive types
        // int i1 = 10, i2 = 10;
        // System.out.println(i1.hashCode());
        // System.out.println(i2.hashCode());

    }
}
