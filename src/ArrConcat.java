//1929. Concatenation of Array

import java.util.ArrayList;
import java.util.Arrays;

public class ArrConcat {
    public static void main(String[] args) {
        int[] arr = new int[5];
        ArrayList<Integer> arr2 = new ArrayList<>(5);

        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int len = a1.length + a2.length;
        int[] ans = new int[len];
        int pos = 0;

        for (int v1 : a1) {
            ans[pos] = v1;
            pos++;
        }
        for (int v2 : a2) {
            ans[pos] = v2;
            pos++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
