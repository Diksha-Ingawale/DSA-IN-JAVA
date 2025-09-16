import java.util.Scanner;

public class MaxOfArray {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];

        for(int i=0;i<size;i++){
            if(arr[0]< arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number="+ max);
        sc.close();
    }
}
