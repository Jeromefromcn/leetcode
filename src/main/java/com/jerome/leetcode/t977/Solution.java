package com.jerome.leetcode.t977;

class Solution {
    public int[] sortedSquares(int[] A) {
        int length = A.length;
        int np = -1;
        for(int i = 0; i < length; i ++) {
            if(A[i] < 0) {
                np = i;
            } else {
                break;
            }
        }
        int[] result = new int[length];
        int nnp = np + 1;
        for(int i = 0; i < length; i++) {
            if(np < 0) {
                result[i] = A[nnp] * A[nnp];
                ++nnp;
            } else if (nnp == length) {
                result[i] = A[np] * A[np];
                --np;
            } else if(A[np] * A[np] < A[nnp] * A[nnp]) {
                result[i] = A[np] * A[np];
                --np;
            } else {
                result[i] = A[nnp] * A[nnp];
                ++nnp;
            }
        }
        return result;
    }

}