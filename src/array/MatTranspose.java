package array;

import java.util.Arrays;

public class MatTranspose {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        int[][] ans = transpose(mat);
        System.out.println(Arrays.toString(ans));
    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] tsp = new int[matrix[0].length][];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < matrix[i].length; j++) tsp[j][i] = matrix[i][j];

        return tsp;
    }
}
