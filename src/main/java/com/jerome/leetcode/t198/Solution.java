package com.jerome.leetcode.t198;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int preMax = nums[0];
        int max = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = max;
            max = Math.max(max, preMax + nums[i]);
            preMax = temp;
        }
        return max;
    }
}