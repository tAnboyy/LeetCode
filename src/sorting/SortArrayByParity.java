package sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int[] ans = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));
    }

    static public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] % 2 != 0) {
                swap(nums, start, end);
                end--;
            } else {
                start++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
