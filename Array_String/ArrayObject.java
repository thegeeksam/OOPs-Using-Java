package Array_String;

class Student {
    Student(int id, String name) {
        System.out.println("Student ID is " + id + " and name is " + name);
    }
}

public class ArrayObject {
    public static void main(String[] args) {
        // declaring an array of Object
        Student obj[] = new Student[3];

        obj[0] = new Student(142, "RIZWANA");
        obj[1] = new Student(156, "Siva");
        obj[2] = new Student(181, "VINCY");
        // Student obj1[] = new Student[5];
    }
}
