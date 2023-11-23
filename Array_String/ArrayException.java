package Array_String;

public class ArrayException {
    public static void main(String[] args) {
        // declaring and initializing an array
        int myArray[] = new int[5];

        myArray[0] = 3;
        myArray[2] = 6;
        myArray[4] = 9;
        myArray[6] = 12; // index 6 not exists

        for (int i : myArray) {
            System.out.println(i);
        }
    }
}
