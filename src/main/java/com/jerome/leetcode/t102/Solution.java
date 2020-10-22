package com.jerome.leetcode.t102;


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        preorderTraversal(root, list, 0);
        return list;
    }

    private void preorderTraversal(TreeNode node, List<List<Integer>> list, int level) {
        if (node == null) {
            return;
        }
        if (level >= list.size()) {
            List<Integer> levelList = new ArrayList<>();
            levelList.add(node.val);
            list.add(levelList);
        } else {
            list.get(level).add(node.val);
        }
        preorderTraversal(node.left, list, level+ 1);
        preorderTraversal(node.right, list, level + 1);
    }
}