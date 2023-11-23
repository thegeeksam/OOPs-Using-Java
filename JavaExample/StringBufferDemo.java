package JavaExample;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sri ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        //
        sb.append("Eshwar");
        System.out.println(sb);

        String str = sb.toString();

        // sb.deleteCharAt(2);
        // sb.insert(0,"Java");
        sb.insert(6, "java");
        sb.setLength(30);
        // sb.ensureCapacity(100);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.insert(6, "ProgrammingW");
        System.out.println(sb.capacity());
        System.out.println(sb.hashCode());
    }
}
