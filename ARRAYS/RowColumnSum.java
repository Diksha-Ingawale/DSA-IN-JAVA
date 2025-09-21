//Print sum of each row and each column separately.
package arrays;
import java.util.Scanner;
public class RowColumnSum {
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
    
        for(int i=0;i<rows;i++){
            int rsum = 0;
            for(int j=0;j<cols;j++){
                rsum += arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row is:"+rsum);
        }

        for(int j =0;j<cols;j++){
            int csum =0;
            for(int i=0;i<rows;i++){
                csum+=arr[i][j];
            }
            System.out.println("Sum of "+(j+1)+" col is:"+csum);
        }
        sc.close();
    }
}
