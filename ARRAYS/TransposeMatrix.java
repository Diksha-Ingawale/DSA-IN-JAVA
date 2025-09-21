package arrays;
import java.util.*;
public class TransposeMatrix {
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
    
        System.out.println("Original array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        int transpose[][]=new int[cols][rows];
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                transpose[i][j]=arr[j][i];
                System.out.print(" "+transpose[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
