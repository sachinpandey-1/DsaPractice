package arraymediam;

import java.util.ArrayList;

public class MatrixInSpiralManner {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> spiral = new ArrayList<>();
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiral.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                spiral.add(mat[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral.add(mat[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(mat[i][left]);
                }
                left++;
            }


        }

        System.out.println("Spiral Order Matrix:");
        for (int val : spiral) {
            System.out.print(val + " ");


        }
    }
}

