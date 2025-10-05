//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);

        if (ans[0] != -1) { // only search right side if found
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    public static int search(int[] nums, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid; // potential answer
                if (findFirstIndex) {
                    end = mid - 1; // move left
                } else {
                    start = mid + 1; // move right
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
