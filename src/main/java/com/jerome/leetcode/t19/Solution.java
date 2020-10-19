package com.jerome.leetcode.t19;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static void main(String[] args) {

        new Solution().run();
    }

    private void run() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        first.next = second;

        removeNthFromEnd(first, 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        if (n == 1) {
            nodes.get(nodes.size() - 2).next = null;
        } else if (n == nodes.size()) {
            nodes.get(0).next = null;
            return nodes.get(1);
        } else {
            nodes.get(nodes.size() - n - 1).next = nodes.get(nodes.size() - n + 1);
        }
        return nodes.get(0);
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}

