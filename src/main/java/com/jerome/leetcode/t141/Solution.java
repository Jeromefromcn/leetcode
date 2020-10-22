package com.jerome.leetcode.t141;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public static void main(String[] args) {
        new Solution().hasCycle(new ListNode(1));
    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if(!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}