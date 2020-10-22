package com.jerome.leetcode.t98;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<TreeNode> list = new ArrayList<>();
        inorderTraversal(root, list);
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i).val >= list.get(i + 1).val) {
                return false;
            }
        }
        return true;
    }

    private void inorderTraversal(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, list);
        list.add(node);
        inorderTraversal(node.right, list);
    }



}