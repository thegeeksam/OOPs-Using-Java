package Static_final;

public class StaticVariable {
    String studentName;
    String course;
    static String College;
    // static String College = "SECE";

    public static void main(String[] args) {
        StaticVariable Student1 = new StaticVariable();
        StaticVariable Student2 = new StaticVariable();
        StaticVariable Student3 = new StaticVariable();
        Student1.studentName = "RAGAPRIYA K";
        Student1.course = "OOPs with Java";
        Student1.College = "SECE";
        System.out.println(Student1.studentName + " " + Student1.course + " " +
                Student1.College + "\n");

        Student2.studentName = "PURNIMA S";
        Student2.course = "Data Analysis with Python";
        Student2.College = "SECE1";

        Student3.studentName = "Rangesh";
        Student3.course = "Data Analysis with R";
        // Student2.College = "SECE1";

        // System.out.println(Student1.studentName + " " + Student1.course + " " +
        // Student1.College + "\n");

        System.out.println(Student2.studentName + " " + Student2.course + " " + Student2.College + "\n");
        System.out.println(Student3.studentName + " " + Student3.course + " " + Student3.College + "\n");

    }
}