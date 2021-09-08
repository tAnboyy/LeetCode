package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//167. Two Sum II - Input array is sorted
public class TwoSumII {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int target = 20;
        int[] ans = twoSum(A, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] A, int target) {
        int[] ans = {1, 2};
        if (A.length == 2) return ans;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(target - A[i])) {
                ans[0] = map.get(target - A[i]) + 1;
                ans[1] = i + 1;
                return ans;
            }
            map.put(A[i], i);
        }
        return ans;
    }
}
