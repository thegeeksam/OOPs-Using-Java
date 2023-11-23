package JavaExample;

class BaseClass {
    public void methodA() {
        // Base Class Method
        System.out.println("methodA of Base Class");
    }
}

class DerivedClass extends BaseClass {
    public void methodA() {
        // Derived Class method
        System.out.println("methodA of Derived Class");
    }
}

public class OverRiding {
    public static void main(String args[]) {
        BaseClass obj1 = new BaseClass();
        DerivedClass obj2 = new DerivedClass();
        obj1.methodA();
        obj2.methodA();
    }
}

/*
 * Note: As you can see the methodA has 2 different forms in
 * child and parent class thus we can say methodA here is polymorphic.
 */