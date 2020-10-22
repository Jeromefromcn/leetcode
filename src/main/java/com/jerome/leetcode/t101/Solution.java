package com.jerome.leetcode.t101;


import java.util.ArrayList;
import java.util.List;

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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root, root);

    }

    private boolean isSymmetric(TreeNode leftRoot, TreeNode rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        }
        if (leftRoot == null || rightRoot == null) {
            return false;
        }
        return leftRoot.val == rightRoot.val
                && isSymmetric(leftRoot.left, rightRoot.right)
                && isSymmetric(leftRoot.right, rightRoot.left);
    }


}