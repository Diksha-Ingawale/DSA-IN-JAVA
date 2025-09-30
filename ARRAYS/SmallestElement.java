package arrays;

import java.util.Scanner;

public class SmallestElement {

    // Returns the smallest element in the array
    public static int calcSmallestElement(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        if (size > 0) {
            System.out.print("Enter array elements: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int result = calcSmallestElement(arr);
            System.out.println("Smallest element is: " + result);
        } else {
            System.out.println("Array is empty, no smallest element");
        }

        sc.close();
    }
}
