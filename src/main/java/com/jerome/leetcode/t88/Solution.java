package com.jerome.leetcode.t88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (p1 == m) {
                nums1[i] = nums2[p2];
                p2++;
            } else if (p2 == n) {
                nums1[i] = temp[p1];
                p1++;
            } else {
                if (temp[p1] < nums2[p2]) {
                    nums1[i] = temp[p1];
                    p1++;
                } else {
                    nums1[i] = nums2[p2];
                    p2++;
                }
            }
        }
    }
}