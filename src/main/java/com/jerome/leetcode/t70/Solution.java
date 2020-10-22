package com.jerome.leetcode.t70;

class Solution {
    public int climbStairs(int n) {
        int count = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            count += climbStairs(n - 1);
            count += climbStairs(n - 2);
            return count;
        }
    }


    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));
    }
}