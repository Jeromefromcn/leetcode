package com.jerome.leetcode.t486;

class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return game(nums, 0, nums.length - 1) >= 0;
    }

    private int game(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        int choseLeft = nums[start] - game(nums, start + 1, end);
        int choseRight = nums[end] - game(nums, start, end -1);
        return Math.max(choseLeft, choseRight);
    }
}