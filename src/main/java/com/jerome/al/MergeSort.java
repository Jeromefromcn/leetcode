package com.jerome.al;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 5, 6, 3, 3, 2, 1};
        new MergeSort().sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void sort(int[] nums) {
        int[] helper = new int[nums.length];
        doMerge(nums, helper, 0, nums.length - 1);
    }

    private void doMerge(int[] nums, int[] helper, int left, int right) {
        if (right - left < 1) {
            return;
        }
        int mid = left + (right - left) / 2;
        doMerge(nums, helper, left, mid);
        doMerge(nums, helper, mid + 1, right);
        merge(nums, helper, left, mid, right);
    }

    private void merge(int[] nums, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = nums[i];
        }

    }
}
