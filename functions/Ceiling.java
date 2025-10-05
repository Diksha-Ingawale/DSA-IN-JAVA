package functions;

import java.util.Scanner;

public class Ceiling {
    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(target > arr[arr.length-1]){
                return -1;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1 ;                
            }
            else{
                return arr[mid];
            }
        }

        return arr[start] ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(ceiling(arr, target));
        sc.close();
    }
}
