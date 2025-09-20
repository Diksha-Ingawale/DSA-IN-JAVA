package arrays;
import java.util.*;

public class diagonalMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[][]= new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int leftsum=0,rightsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i==j){
                    leftsum+=arr[i][j];
                }
            }

            for(int j=n;j>0;j--){

                if(i==j){
                    rightsum+=arr[i][n-1-i];
                }
            }
        }
        System.out.println(Math.abs(leftsum-rightsum));

        sc.close();
    }
}

