package binarysearch;

import java.util.Scanner;

//69. binary_search.Sqrt(x)
public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = sqrt(n);
        System.out.println(ans);
    }

    private static int sqrt(int n) {

        int start = 1;
        int end = 100000;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < n / mid) {
                ans = mid;
                start = mid + 1;
            } else if (mid > n / mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return ans;
    }
}
