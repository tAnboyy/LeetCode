package array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int num = 1;
        List<Integer> ans = addToArrayForm(arr, num);
        for(int an : ans) System.out.print(an + " ");
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int size = num.length-1;
        int numb = 0;
        for (int i = 0; i < num.length; i++) {
            numb += Math.pow(10, size) * num[i];
            size--;
        }
        int ans = numb + k;
        ArrayList<Integer> al = new ArrayList<>();
        while(ans>0){
            int rem = ans%10;
            al.add(rem);
            ans/=10;
        }
        Collections.reverse(al);
        return al;
    }
}
