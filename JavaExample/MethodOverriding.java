package JavaExample;

class BaseClass {
    public void methodA() {
        // Base class method
        System.out.println("methodA of Base Class");
    }
}

class DerivedClass extends BaseClass {
    public void methodA() {
        // Derived Class method
        System.out.println("methodA of Derived Class");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        BaseClass obj1 = new BaseClass();
        DerivedClass obj2 = new DerivedClass();
        obj1.methodA();
        obj2.methodA();
    }
}
