package Array_String;

public class CloneArray {
    public static void main(String[] args) {
        // declaring and initializing an array
        int myArray[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        // clone myArray by using clone property
        int cloneArray[][] = myArray.clone();

        // checking whether both arrays are the same or not
        System.out.println(myArray == cloneArray);

        // checking whether both arrays have the same elements
        System.out.println(myArray[1] == cloneArray[1]);
    }
}
