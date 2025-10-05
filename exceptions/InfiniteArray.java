package exceptions;

import java.util.Scanner;

public class InfiniteArray {

    public static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // If mid is outside the array, shrink the search range
                end = mid - 1;
            }
        }
        return -1;
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // expand the search range until target <= arr[end] OR we reach out of array
        while (true) {
            try {
                if (target <= arr[end]) {
                    break;
                }
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e) {
                // if accessing arr[end] causes exception, end is too big → shrink
                break;
            }
        }

        return BinarySearch(arr, target, start, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = sc.nextInt();

        System.out.println(ans(arr, target));
        sc.close();
    }
}
