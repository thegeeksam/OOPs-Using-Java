package This_Super;

class Code {
    int value = 10;

    Code() {
    }

    Code(int var) {
        // this.value = var;
        this.value = var;
    }

    void print() {
        System.out.println("Value of Current instance Variable : " + value);
    }
}

public class This {
    public static void main(String[] args) {
        // creating an instance of Illustration class
        Code obj = new Code(20);
        obj.print();
        Code obj1 = new Code();
        obj1.print();
    }
}