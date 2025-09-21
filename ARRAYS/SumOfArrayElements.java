//Sum of all elements.

package arrays;
import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size =sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }

        System.out.println("Sum of an array elements is:"+sum);
        sc.close();
    }
}
