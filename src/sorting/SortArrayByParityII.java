package sorting;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int[] ans = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortArrayByParity(int[] arr) {
        int i = 0, j = 1, n = arr.length;
        while (i < n && j < n) {
            while (i < n && arr[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && arr[j] % 2 != 0) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(arr, i, j);
            }
        }
        return arr;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
