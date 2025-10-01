package arrays;

import java.util.Scanner;

public class MaxElementIn2D {

    // Returns the maximum element in the 2D array
    public static int findMaxElement(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter no. of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = findMaxElement(arr);
        System.out.println("Maximum element in 2D array is: " + result);
        sc.close();
    }
}
