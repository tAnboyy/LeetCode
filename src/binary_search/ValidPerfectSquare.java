package binary_search;//367. Valid Perfect Square

import java.math.BigInteger;
import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPerfectSquare(n);
        System.out.println(ans);
    }

    private static boolean isPerfectSquare(int n) {
        if (n == 1) return true;

        int start = 1;
        int end = 100000;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long)mid * mid;
            if (sq == n) return true;
            else if (sq > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
