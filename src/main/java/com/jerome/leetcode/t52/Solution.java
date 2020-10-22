package com.jerome.leetcode.t52;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().totalNQueens(5));
    }
    public int totalNQueens(int n) {
        int[][] chessboard = new int[n][n];
        return next(0, chessboard, n);
    }

    private int next(int countQueen, int[][] chessboard, int n) {
        // 如果所有皇后都放置下了, 说明有一个解
        if(countQueen == n) {
            return 1;
        }
        int count = 0;
        // 判断是否可以放置皇后
        for (int j = 0; j < n; j++) {
            if (chessboard[countQueen][j] == 0) {
                int[][] newBoard = new int[chessboard.length][chessboard.length];
                for (int i = 0; i < chessboard.length; i++) {
                    newBoard[i] = chessboard[i].clone();
                }
                setChessboard(countQueen, j, newBoard);
                count += next(countQueen + 1, newBoard, n);
            }
        }
        return count;

    }

    void setChessboard(int i, int j, int[][] chessboard) {
        chessboard[i][j] = 1;
        int n = chessboard.length;
        for (int x = 0; x < chessboard.length; x++) {
            if (chessboard[i][x] == 0) {
                chessboard[i][x] = -1;
            }
            if (chessboard[x][j] == 0) {
                chessboard[x][j] = -1;
            }
            // 处理斜着的
            if ((i + x + 1) < n && (j + x + 1) < n
                    && chessboard[i + x + 1][j + x + 1] == 0) {
                chessboard[i + x + 1][j + x + 1] = -1;
            }
            if ((i - x - 1) >= 0 && (j - x - 1) >= 0
                    && chessboard[i - x - 1][i - x - 1] == 0) {
                chessboard[i - x - 1][i - x - 1] = -1;
            }
            if ((i + x + 1) < n && (j - x - 1) >= 0
                    && chessboard[i + x + 1][j - x - 1] == 0) {
                chessboard[i + x + 1][j - x - 1] = -1;
            }
            if ((i - x - 1) >= 0 && (i + x + 1) < n
                    && chessboard[i - x - 1][i + x + 1] == 0) {
                chessboard[i - x - 1][i + x + 1] = -1;
            }

        }
    }
}