package arrays;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size =sc.nextInt();
    
        int arr[] = new int[size];
        System.out.print("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    
        System.out.print("Enter key for searching:");
        int key = sc.nextInt();
        
        boolean found = false;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println(key+" found at "+i+" position");
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println(key+" is not found");
        }
        sc.close();
    }
}
