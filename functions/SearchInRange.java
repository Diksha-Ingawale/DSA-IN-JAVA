package functions;

import java.util.Scanner;

public class SearchInRange {
    public static int SearchInRangefunction(int arr[], int start, int end, int target) {
        if (start < 0 || end >= arr.length) {
            System.out.println("Invalid range!");
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i; // index found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // target input
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        // range input
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        int result = SearchInRangefunction(arr, start, end, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found " + result);
        }
        sc.close();
    }
}
