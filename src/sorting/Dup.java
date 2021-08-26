package sorting;
//217. Contains Duplicate

import java.util.Arrays;

public class Dup {
    public static void main(String[] args) {
        int[] arr = {1};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) return false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
}
