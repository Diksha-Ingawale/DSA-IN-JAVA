//Find sum of all elements in the matrix.

package arrays;
import java.util.*;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows =sc.nextInt();

        System.out.print("Enter number of cols:");
        int cols =sc.nextInt();
    
        int arr[][] = new int[rows][cols];
        System.out.print("Enter array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    
        int sum = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of 2D array is: "+sum);
        sc.close();
    }
}
