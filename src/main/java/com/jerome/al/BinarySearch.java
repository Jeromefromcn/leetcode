package com.jerome.al;

public class BinarySearch {

    private int sort(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == k) {
                return mid;
            } else if (nums[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(new BinarySearch().sort(new int[]{3, 4, 6, 20, 40, 45, 51, 62, 70, 99, 110}, 20));
    }
}
