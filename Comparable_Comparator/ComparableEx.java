package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student implements Comparable<Student> {
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age= " + age + ", name= " + name + "]";
    }

    public int CompareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return i.age > j.age ? 1 : -1;
            }
        };
        // Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        studs.add(new Student(19, "Rahul"));
        studs.add(new Student(20, "Theja"));
        studs.add(new Student(18, "Raj"));
        studs.add(new Student(17, "Kumar"));

        // for (Student s : studs)
        // System.out.println(s);

        Collections.sort(studs, com);
        for (Student s : studs)
            System.out.println(s);
    }
}