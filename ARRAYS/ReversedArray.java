//Reverse an array.

package arrays;
import java.util.Scanner;
public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size =sc.nextInt();
    
        int arr[] = new int[size];
        System.out.print("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    
        System.out.println("Reversed array:");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
