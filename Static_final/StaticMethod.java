package Static_final;

// Java code to demonstrate the use of static methods in a program
class Employee {
    private int employeeId;
    private String employeeName;

    // companyName static variable as it will be the same for all employees
    static String companyName;

    // constructer to initilize Employee objects
    public Employee(String employeeName) {
        this.employeeName = employeeName;
        this.employeeId = setEmployeeId();
    }

    // using a static count variable to
    // set consecutive employeeId to each Employee object
    static int count = 0;

    // static method to set consecutive employeeId for each employee object
    static int setEmployeeId() {
        count++;
        return count;
    }

    // static method to set company name common for every object
    static void setCompanyName(String company) {
        companyName = company;
    }

    // instance method
    void getEmployeeInfo() {
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Company Name: " + companyName);
        System.out.println("-----------------------");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // using setCompanyName static method
        // with the class name directly to set the
        // static companyName variable common for all objects
        Employee.companyName = "Alphabet";

        Employee e1 = new Employee("VETHAVARSHINI R");
        Employee e2 = new Employee("THIKSHA RUBINI S"); 
        Employee e3 = new Employee("SWETHA N");

        e1.getEmployeeInfo();
        e2.getEmployeeInfo();
        e3.getEmployeeInfo();
    }
}
