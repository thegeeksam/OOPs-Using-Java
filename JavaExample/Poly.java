package JavaExample;

class Computer {
    public void show() {
        System.out.println("in A show");
    }

    public void hello() {
        System.out.println("hello");
    }
}

class Laptop extends Computer {
    public void show() {
        System.out.println("in B show");
    }

    public void hello() {
        System.out.println("hello in Laptop");
    }
}

class C extends Computer {
    public void show() {
        System.out.println("in C show");
    }
}

public class Poly {
    public static void main(String[] args) {
        // A obj=new B();
        // obj.show();

        Computer obj = new Laptop();
        obj.show();
        obj.hello();

        // obj = new Laptop();
        // obj.show();

        // obj = new C();
        // obj.show();

        // obj=new D();

        // Laptop obj1=new Laptop();
        // Computer obj1=new Laptop();

    }
}