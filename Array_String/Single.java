package Array_String;

import java.util.Scanner;

public class Single {
  public static void main(String[] args) {
    // creating object of Scanner class
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter length of Array: ");
    int arrLength = scan.nextInt();

    int[] anArray = new int[arrLength];
    System.out.println("Enter the elements of the Array");
    for (int i = 0; i < arrLength; i++) {
      // taking array input
      anArray[i] = scan.nextInt();
    }
    // pint arrays Object
    System.out.println(anArray);
    // print arrays Object
    System.out.println(anArray.toString());
    // print elements of array
    System.out.println("Elements of One dimensional array are:");
    for (int i : anArray) {
      System.out.print(i + " ");
    }

  }
}