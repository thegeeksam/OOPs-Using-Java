package LambdaExpression;

//------> LambdaExample 5: Thread <------

// java.lang.Runnable is an interface that is to be 
// implemented by a class whose instances are intended 
// to be executed by a thread.
public class LambdaThread {
    public static void main(String[] args) {

        // Thread Example without lambda
        // creating runnable interface object
        // and overriding run function using
        // anonymous class.

        Runnable t1 = new Runnable() {
            public void run() {
                System.out.println("This is 🧵thread1...");
            }
        };

        Thread thread1 = new Thread(t1);
        thread1.start(); // Calling start() will create new thread.

        // Thread Example with lambda
        // using Lambda to override the function.

        Runnable t2 = () -> System.out.println("This is 🧵thread2...");

        Thread thread2 = new Thread(t2);
        thread2.start();
    }
}
