package Array_String;

public class MuiltiDimensional {
    public static void main(String[] args) {
        // declaring and initializing arrays
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        // Printing Array1 in matrix format
        System.out.println("Elements of Array 1 are:");
        for (int i = 0; i < 3; i++) { // for-loop for number of rows
            for (int j = 0; j < 3; j++) { // for-loop for number of columns
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Printing Array2 in matrix format
        System.out.println("Elements of Array 2 are:");
        for (int i[] : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
