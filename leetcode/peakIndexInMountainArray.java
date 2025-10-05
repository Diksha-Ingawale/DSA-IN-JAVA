//https://leetcode.com/problems/peak-index-in-a-mountain-array/

package leetcode;
import java.util.Scanner;
public class peakIndexInMountainArray {
    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) { // use < not <=
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in decreasing part of array
                // mid might be the answer, so move end = mid
                end = mid;
            } else {
                // You are in increasing part
                start = mid + 1;
            }
        }

        // start and end point to the same element — the peak
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,3,2,1};

        System.out.println(peakIndex(arr));
        sc.close();
    }
}
