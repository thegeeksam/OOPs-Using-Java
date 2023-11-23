package mypack;
import mypack.*;
public class MultiLevel{
    public static void main(String args[]){
        ClassC c = new ClassC();
        c.dispA();
        c.dispB();
        c.dispC();
    }
}

/*
javac MyPackageClass.java
javac -d . MyPackageClass.java
java mypack.MyPackageClass
*/