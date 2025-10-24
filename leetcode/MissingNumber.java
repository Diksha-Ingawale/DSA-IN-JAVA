package leetcode;

//import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int current = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[current]){
                swap(arr,i,current);
            }else{
                i++;
            }
        }

        for(int index =0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,0};
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        
        // System.out.println("Enter array elements: ");
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        System.out.println("Missing Number is : " + missingNumber(arr));
    }
}
