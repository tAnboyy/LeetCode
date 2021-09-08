package sorting;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int ans = maximumProduct(arr);
        System.out.println(ans);
    }

    static public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
