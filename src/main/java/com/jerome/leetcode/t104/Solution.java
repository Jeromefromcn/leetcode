package com.jerome.leetcode.t104;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepthLeft = maxDepth(root.left, 1);
        int maxDepthRight = maxDepth(root.right, 1);
        return Math.max(maxDepthLeft, maxDepthRight);
    }

    private int maxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        depth++;
        int maxDepthLeft = maxDepth(node.left, depth);
        int maxDepthRight = maxDepth(node.right, depth);
        return Math.max(maxDepthLeft, maxDepthRight);
    }
}