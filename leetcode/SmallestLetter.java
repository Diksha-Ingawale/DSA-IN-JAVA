package leetcode;

import java.util.Scanner;

public class SmallestLetter {
    public static char findSmallestletter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= arr[mid]) {
                start = mid + 1; // search in right half
            } else {
                end = mid - 1;   // search in left half
            }
        }

        // Wrap around if no greater element found
        return arr[start % arr.length];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        char arr[] = new char[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        char target = sc.next().charAt(0);

        char result = findSmallestletter(arr, target);
        System.out.println(result);

        sc.close();
    }
}
