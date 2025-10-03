package arrays;
import java.util.Scanner;
class FindPeakIndex {
    public static int findPeakElement(int[] nums) {
        int peakIndex = 0;
        int max = nums[0];

        for(int i=0; i<nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
                peakIndex = i;
            }
        }
        return peakIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findPeakElement(nums));
       
        sc.close();
    }
}