package com.jerome.al;

public class BubbleSort {
    private void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 3, 2, 1};
        new BubbleSort().sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
