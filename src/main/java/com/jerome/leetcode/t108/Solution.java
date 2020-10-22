package com.jerome.leetcode.t108;


import javafx.scene.transform.Rotate;

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public static void main(String[] args) {
        new Solution().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        root.left = findRoot(nums, 0, nums.length / 2 - 1);
        root.right = findRoot(nums, nums.length / 2 + 1, nums.length - 1);
        return root;
    }

    private TreeNode findRoot(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(nums[(end + start) / 2]);
        root.left = findRoot(nums, start, (end + start) / 2 - 1);
        root.right = findRoot(nums, (end + start) / 2 + 1, end);
        return root;
    }
}