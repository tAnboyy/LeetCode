package sorting;

import java.util.Arrays;

//268. Missing Number
public class Missing {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        if(nums.length == 1) {
            if(nums[0] == 1) return 0;
            else return 1;
        }
        Arrays.sort(nums);
        if(nums[0] != 0) return 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1] + 1) {
                return nums[i] - 1;
            }
        }
        return nums.length;
    }
}
