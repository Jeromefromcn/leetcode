package com.jerome.leetcode.t234;


import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i).val != list.get(list.size() - i - 1).val) {
                return false;
            }
        }
        return true;
    }
}

