package arrays;

import java.util.Scanner;

public class SearchInFullySorted2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define a sorted 2D matrix where
        // each row is sorted and the first element of each row
        // is greater than the last element of the previous row
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Element to be searched
        int target = 3;

        // Call the binary search function for 2D array
        searchMatrix(arr, target);

        sc.close();
    }

    // Function to search an element in a 2D sorted matrix
    static void searchMatrix(int[][] arr, int target) {
        int rows = arr.length;       // Total number of rows
        int cols = arr[0].length;    // Total number of columns

        // Treat the 2D matrix as a 1D sorted array
        int start = 0;               
        int end = rows * cols - 1;   // Last index in the virtual 1D array

        // Perform binary search
        while (start <= end) {
            // Find the middle index
            int mid = start + (end - start) / 2;

            // Convert 1D mid index into 2D coordinates
            int row = mid / cols;   // Row number
            int col = mid % cols;   // Column number

            // Check if the middle element is the target
            if (arr[row][col] == target) {
                System.out.println("Element found at:");
                System.out.println("Row = " + row + ", Column = " + col);
                return; // Exit after finding the element
            } 
            // If target is greater, ignore left half
            else if (arr[row][col] < target) {
                start = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                end = mid - 1;
            }
        }

        // If element not found after loop ends
        System.out.println("Element not found in the matrix.");
    }
}
