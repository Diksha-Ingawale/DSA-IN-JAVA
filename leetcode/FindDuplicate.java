package leetcode;

public class FindDuplicate {
    public static int findDuplicates(int[] nums){
        int i =0;
        while(i < nums.length){
            int currect = nums[i] - 1;
            if(nums[i] != nums[currect]){
                swap(nums, i, currect);
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length ; index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }

        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicates(nums)); 
    }
}
