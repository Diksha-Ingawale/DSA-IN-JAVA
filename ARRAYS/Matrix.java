package arrays;
import java.util.*;

public class Matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of array:");
        int n=sc.nextInt();

        int arr[][]= new int[n][n];

        System.out.print("Enter values for 2D array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("2D Matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
