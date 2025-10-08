package arrays;

import java.util.Scanner;

public class searchSortedRowsCols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define a 2D matrix where each row and column is sorted
        int arr[][] = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };

        // Read the target element from user input
        int target = sc.nextInt();

        // Call the staircase search function
        searchTarget(arr, target);
        
        sc.close();
    }

    // Function to search in a matrix where rows and columns are sorted
    static boolean searchTarget(int[][] arr, int target) {
        int rows = 0;                 // Start from the first row
        int cols = arr[0].length - 1; // Start from the last column (top-right corner)

        // Loop until we go out of bounds
        while (rows < arr.length && cols >= 0) {

            // If the current element is the target, print its position
            if (arr[rows][cols] == target) {
                System.out.println("Found at: Row " + rows + ", Column " + cols);
                return true;  // Exit after finding the target
            }
            // If current element is greater than target, move left
            else if (arr[rows][cols] > target) {
                cols--;
            } 
            // If current element is smaller than target, move down
            else {
                rows++;
            }
        }

        // If we exit the loop, the element was not found
        System.out.println("Not found");
        return false;
    }
}
