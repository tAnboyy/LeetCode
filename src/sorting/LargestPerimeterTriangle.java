package sorting;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2};
        int ans = largestPerimeter(arr);
        System.out.println(ans);
    }

    private static int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 3; i >= 0; i--) {
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                return arr[i] + arr[i + 1] + arr[i + 2];
            }
        }
        return 0;
    }
}
