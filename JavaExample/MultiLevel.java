package JavaExample;

class ClassA {
    public void dispA() {
        System.out.println("disp() method of ClassA");
    }
}

class ClassB extends ClassA {
    public void dispB() {
        System.out.println("disp() method of ClassB");
    }
}

class ClassC extends ClassB {
    public void dispC() {
        System.out.println("disp() method of ClassC");
    }

}

public class MultiLevel {
    public static void main(String args[]) {
        ClassC c = new ClassC();
        // ClassA c = new ClassC();
        // ClassB c = new ClassC();
        c.dispA();
        c.dispB();
        c.dispC();
    }
}