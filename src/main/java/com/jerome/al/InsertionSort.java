package com.jerome.al;

public class InsertionSort {
    private void sort(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            int insert = nums[i];
            int index = i - 1;
            while (index >= 0 && nums[index] > insert) {
                nums[index + 1] = nums[index];
                index--;
            }
            nums[index + 1] = insert;

        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 3, 2, 1};
        new InsertionSort().sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
