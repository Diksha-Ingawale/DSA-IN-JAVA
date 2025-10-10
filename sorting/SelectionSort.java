package sorting; // Package name

import java.util.Arrays;
// import java.util.Scanner; // (Not needed here but can be used for user input)

public class SelectionSort {

    // Method to perform Selection Sort
    static void selection(int[] arr) {
        // Loop runs from start to end of the array
        for (int i = 0; i < arr.length; i++) {
            // last index for current iteration (sorted part starts from the end)
            int last = arr.length - i - 1;

            // find index of maximum element from 0 to 'last'
            int maxIndex = getmaxIndex(arr, 0, last);

            // swap the found maximum element with the element at 'last'
            swap(arr, maxIndex, last);
        }
    }

    // Method to find the index of maximum element between 'start' and 'end'
    public static int getmaxIndex(int arr[], int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;  // update index of maximum element
            }
        }
        return max;
    }

    // Method to swap two elements in the array
    public static void swap(int arr[], int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    public static void main(String[] args) {
        // Example array to sort
        int arr[] = {1, 4, 2, 56, 3};

        // Call the selection sort function
        selection(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
