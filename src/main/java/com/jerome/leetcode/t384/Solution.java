package com.jerome.leetcode.t384;

import java.util.Random;

class Solution {

    private int[] a1;
    private int[] a2;

    public Solution(int[] nums) {
        a1 = nums;
        a2 = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        a1 = a2.clone();
        return a1;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int ri;
        int temp;
        Random r = new Random();
        for (int i = a1.length - 1; i >= 0; i--) {
            ri = r.nextInt(i + 1);
            temp = a1[i];
            a1[i] = a1[ri];
            a1[ri] = temp;
        }
        return a1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */