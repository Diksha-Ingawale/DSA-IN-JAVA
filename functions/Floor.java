package functions;

import java.util.Scanner;

public class Floor {
    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Edge case: if target is smaller than the smallest element
        if (target < arr[0]) {
            return -1; // no floor exists
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid]; // target found
            }
        }

        // at the end of loop, "end" will be pointing to the floor value
        return arr[end];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(floor(arr, target));
        sc.close();
    }
}
