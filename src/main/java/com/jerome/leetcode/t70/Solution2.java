package com.jerome.leetcode.t70;

class Solution2 {
    public int climbStairs(int n) {
        int l2 = 1;
        int l1 = 1;
        int r = 2;
        for (int i = 3; i < n + 1; ++i) {
            l2 = l1;
            l1 = r;
            r = l2 + l1;
        }
        return r;
    }


    public static void main(String[] args) {
        System.out.println(new Solution2().climbStairs(45));
    }
}