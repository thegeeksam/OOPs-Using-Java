package JavaExample;

class Base {
    void BaseMethod() {
        System.out.println("Base method called.");
    }
}

class Derived1 extends Base {
    void Derived1Method() {
        System.out.println("Derived1 method called.");
    }
}

class Derived2 extends Base {
    void Derived2Method() {
        System.out.println("Derived2 method called.");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived1 obj1 = new Derived1();
        Derived2 obj2 = new Derived2();

        obj1.BaseMethod();
        obj1.Derived1Method();

        obj2.BaseMethod();
        obj2.Derived2Method();
    }
}