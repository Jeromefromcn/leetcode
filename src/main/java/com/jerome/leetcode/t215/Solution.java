package com.jerome.leetcode.t215;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.offer(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

}