package com.jerome.leetcode.t53;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = max;
        for (int i = 1; i < nums.length; i++) {
            if (current < 0) {
                current = nums[i];
            } else {
                current = current + nums[i];
            }
            max = Math.max(max, current);
        }
        return max;
    }
}