package JavaString;

public class StrBufferMethods {
    public static void main(String[] args) {
        // Important methods of StringBuffer class
        StringBuffer sb = new StringBuffer("Hello");

        // 5 is the length of Hello. So, capacity is 16 + 5 = 21.
        System.out.println(sb.capacity());
        System.out.println(sb.length()); // Length is 5
        sb.append(" Java"); // Append Java to Hello
        // Capacity is still 21
        // System.out.println(sb + " " + sb.capacity() + " " + sb.length());

        // Insert Java at index 1
        // sb.insert(1, "Java");
        // System.out.println(sb);

        // Replace the characters from index 1 to 3 with CSE
        // sb.replace(1, 3, "CSE");
        // System.out.println(sb);

        // Delete the characters from index 1 to 3
        // sb.delete(1, 3);
        // System.out.println(sb);

        // Reverse the string
        // sb.reverse();
        // System.out.println(sb);
        // Reverse again
        // sb.reverse();
        // System.out.println(sb);

        // Set the character at index 1 to i
        System.out.println(sb);
        sb.setCharAt(1, 'i');
        System.out.println(sb);
        // System.out.println(sb + " " + sb.length() + " " + sb.capacity());
        // sb.append("01234567890");
        // System.out.println(sb + " " + sb.capacity());

        // Set the length of the string to 3
        // sb.setLength(3);
        // System.out.println(sb + " " + sb.capacity());

        // sb.ensureCapacity(100);
        // System.out.println(sb + " " + sb.capacity());''
        String s = sb.toString();
        s += " 0123456789";
        System.out.println(s);
    }
}
