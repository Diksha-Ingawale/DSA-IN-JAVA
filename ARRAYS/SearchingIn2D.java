package arrays;

import java.util.Scanner;

public class SearchingIn2D {

    // Returns the position of target element as a string, or "-1" if not found
    public static String searchIn2D(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return "(" + i + "," + j + ")";
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of row: ");
        int row = sc.nextInt();

        System.out.print("Enter size of column: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        String result = searchIn2D(arr, target);

        if (!result.equals("-1")) { // Compare with string "-1"
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
