package com.jerome.leetcode.t283;

class Solution {
    public void moveZeroes(int[] nums) {
        int zeroesCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroesCount++;
            } else {
                for (int j = 0; j < zeroesCount; j++) {
                    nums[i - zeroesCount] = nums[i];
                }
            }
        }
        for (int i = nums.length - 1; i >= nums.length - zeroesCount; i--) {
            nums[i] = 0;
        }
    }
}