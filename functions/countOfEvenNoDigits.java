//1295. Find Numbers with Even Number of Digits
package functions;

import java.util.Scanner;
class countOfEvenNoDigits {
    public static int findNumbers(int[] nums) {
        int countofevendigits = 0;

        for(int i=0; i<nums.length; i++){
            int countofdigit = 0;

            while(nums[i] > 0){
                countofdigit++;
                nums[i]/=10;
            }

            if(countofdigit % 2 == 0){
                countofevendigits++;
            }
        }
        
        return countofevendigits;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(findNumbers(nums));
        sc.close();
    }
}