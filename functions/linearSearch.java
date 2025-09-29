package functions;

import java.util.Scanner;

public class linearSearch {
    public static int LinearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();

        int result = LinearSearch(arr, target);
        if(result != -1){
            System.out.println("Element found at index "+result);
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
