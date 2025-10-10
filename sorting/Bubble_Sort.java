package sorting;

import java.util.Arrays;

public class Bubble_Sort {

    // Method to perform Bubble Sort
    static void bubble(int[] arr) {
        boolean swapped; // to check if any swapping happened in a pass

        // Outer loop runs for each pass
        for (int i = 0; i < arr.length; i++) {
            swapped = false; // assume no swap has happened yet

            // Inner loop for comparing adjacent elements
            // After each pass, the largest element moves to the end,
            // so we reduce the range by 'i'
            for (int j = 1; j < arr.length - i; j++) {

                // If current element is smaller than the previous one, swap them
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true; // a swap happened
                }
            }

            // If no swapping occurred in the inner loop, the array is already sorted
            if (!swapped) {
                break; // exit early for better efficiency
            }
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {4, 3, 5, 2, 1};

        // Call bubble sort function
        bubble(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
