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
class Solution2 {

    public static void main(String[] args) {

        new Solution2().run();
    }

    private void run() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        first.next = second;

        removeNthFromEnd(first, 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        while (fast != null) {
            if (n < 0) {
                slow = slow.next;
            }
            n--;
            fast = fast.next;
        }
        if (n == 0) {
            return head.next;
        }
        slow.next = slow.next.next;
        return head;
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

