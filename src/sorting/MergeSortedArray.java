package sorting;
//88. Merge Sorted Array

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 0};
        int[] arr2 = {2};
        merge(arr1, 1, arr2, 1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void merge(int[] arr1, int m, int[] arr2, int n) {
        if (arr1.length == 0 || arr2.length == 0) {
            return;
        } else if (arr1.length == 1 && arr1[0] == 0) {
            arr1[0] = arr2[0];
            return;
        } else if (arr1.length == 1) {
            return;
        }

        for (int i = arr1.length - 1; i >= 0; i--) {

            if (m == 0) {
                while (i >= 0) {
                    arr1[i] = arr2[n - 1];
                    i--;
                    n--;
                }
                break;
            }

            if (arr1[m - 1] > arr2[n - 1]) {
                arr1[i] = arr1[m - 1];
                m--;
            } else {
                arr1[i] = arr2[n - 1];
                n--;
            }
            if (n == 0) {
                break;
            }
        }
    }
}
