package JavaExample;

class Member {
    String Name, Address;
    int Age;
    long Pnumber;
    float Salary;

    Member(int a, String name, String Addr, long pnum, float sal) {
        Age = a;
        Name = name;
        Address = Addr;
        Pnumber = pnum;
        Salary = sal;
    }

    public void printSalary() {
        System.out.println("Salary is:" + Salary);

    }
}

class Employee extends Member {
    String specialization, dept;

    Employee(int a, String name, String Addr, long pnum, String spl, String dep, float Sal) {
        super(a, name, Addr, pnum, Sal);
        specialization = spl;
        dept = dep;

    }

    public void printDetails() {
        System.out.println("Your Name is:" + Name);
        System.out.println("Age is:" + Age);
        System.out.println("Phone Number is:" + Pnumber);
        System.out.println("Address is:" + Address);
        System.out.println("Specilization is:" + specialization);
        System.out.println("Department is:" + dept);
    }

}

class Manager extends Member {
    String specialization, dept;

    Manager(int a, String name, String Addr, long pnum, String spl, String dep, float sal) {
        super(a, name, Addr, pnum, sal);
        specialization = spl;
        dept = dep;
    }

    public void printDetails() {
        System.out.println("Your Name is: " + Name);
        System.out.println("Age is: " + Age);
        System.out.println("Phone Number is: " + Pnumber);
        System.out.println("Address is: " + Address);
        System.out.println("Specilization is: " + specialization);
        System.out.println("Department is: " + dept);
    }

}

public class Assignment2 {
    public static void main(String args[]) {
        Employee e = new Employee(45, "Arasu", "Coimbatore", 9821347, "Finance", "Accounts", 35000);
        Manager m = new Manager(55, "NaveenArasu", "Coimbatore", 94532234, "Finance", "Accounts", 67000);
        e.printDetails();
        e.printSalary();
        m.printDetails();
        m.printSalary();
    }
}
// Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary,' which prints the salary of the
// members.
// Two classes, 'Employee' and 'Manager', inherit the 'Member' class. The
// 'Employee' and
// 'Manager' classes have data members 'specialization' and 'department',
// respectively.
// Now, assign name, age, phone number, address, and salary to an employee and
// manager
// by making an object of both classes and printing the same.