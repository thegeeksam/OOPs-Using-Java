package JavaString;

public class StringImmutable {
    public static void main(String args[]) {
        // Unmodified string str
        String str = "Hello";
        System.out.println(str); // Output: Hello
        // Modified string str
        System.out.println(str.hashCode());
        str = str + " World!";
        System.out.println(str.hashCode());

        // Original string str is not modified
        String str1 = "Hello";
        System.out.println(str1.hashCode());
        String str3 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str2.hashCode());

        // str2 = str2 + " World";
        // System.out.println(str2.hashCode());
        System.out.println(str1 + " " + str2);
        // In the case of objects, ''==' compares the memory locations.
        // Here is the proof
        if (str1 == str2) {
            System.out.println("str1 and str2 are equal\n");
        } else {
            System.out.println("str1 and str2 are not equal\n");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal\n");
        } else {
            System.out.println("str1 and str2 are not equal\n");
        }

        if (str1 == str3) {
            System.out.println("str1 and str2 are equal\n");
        } else {
            System.out.println("str1 and str2 are not equal\n");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 and str2 are equal\n");
        } else {
            System.out.println("str1 and str2 are not equal\n");
        }

    }
}
