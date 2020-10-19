package com.jerome.leetcode.t122;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{2, 1, 4, 5, 2, 9, 7}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        if (prices.length == 2) {
            if (prices[1] > prices[0]) {
                return prices[1] - prices[0];
            } else {
                return 0;
            }
        }
        int count = 0;
        int low = 0, high = 1, next = 2;
        while (next < prices.length) {
            if (prices[low] > prices[high]) {
                low++;
                high++;
                next++;
            } else if (prices[high] < prices[next]) {
                high++;
                next++;
            } else {
                count += prices[high] - prices[low];
                low = high;
                high = low + 1;
                next = high + 1;
            }
        }
        if (prices[high] > prices[low]) {
            return count + prices[high] - prices[low];
        } else {
            return count;
        }
    }
}