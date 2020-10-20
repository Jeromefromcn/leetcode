package com.jerome.leetcode.t36;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][] boxes = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int value = board[i][j] - '1';
                rows[i][value]++;
                columns[value][j]++;
                int boxRowIndex = (i / 3) * 3 + j / 3;
                boxes[boxRowIndex][value]++;
                if (rows[i][value] > 1 || columns[value][j] > 1
                        || boxes[boxRowIndex][value] > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}