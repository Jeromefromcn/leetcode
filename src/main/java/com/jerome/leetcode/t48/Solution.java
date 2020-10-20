package com.jerome.leetcode.t48;

class Solution {
    public static void main(String[] args) {
        new Solution().rotate(new int[][]{new int[]{1, 2, 3},
                new int[]{4, 5, 6}, new int[]{7, 8, 9}});
    }

    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int temp;
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[length - i - 1][j];
                matrix[length - i - 1][j] = temp;
            }
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}