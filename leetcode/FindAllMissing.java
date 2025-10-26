package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static List<Integer> findDisapperedNumbers(int[] nums){
        int i=0;
        while(i < nums.length){
            int current = nums[i]-1;
            if(nums[i] != nums[current]){
                swap(nums,i,current);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        
        System.out.println(findDisapperedNumbers(nums));
    }
}
