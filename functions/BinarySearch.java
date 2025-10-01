package functions;

import java.util.Scanner;

public class BinarySearch {
    public static int search(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){     //search left half
                end = mid-1;
            }else{                          //search right half
                start = mid+1;
            }
        }
        return -1;                          //not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of an array:");
        int size = sc.nextInt();

        System.out.print("Enter array elements:");
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element which you want to search:");
        int target = sc.nextInt();

        int result =  search(arr,target);
        if(result == -1){
            System.out.println("Element not found ");
        }else{
            System.out.println("Element found at index " +result);
        }
        sc.close();
    }
}
