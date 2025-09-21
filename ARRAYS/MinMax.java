//Find maximum and minimum element in an array.

package arrays;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements of an Array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<=min){
                min = arr[i];
            }else{
                max = arr[i];
            }
        }
        System.out.print("Min Value: "+min+", Max Value: "+max);

        sc.close();
    }
}
