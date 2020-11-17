package com.jerome.al;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 5, 6, 3, 3, 2, 1};
        new SelectionSort().sort(nums);
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
        if (nums == null) {
            return;
        }
        int selectionIndex;
        for (int i = 0; i < nums.length - 1; i++) {
            selectionIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[selectionIndex] > nums[j]) {
                    selectionIndex = j;
                }
            }
            swap(nums, i, selectionIndex);
        }
    }
}
