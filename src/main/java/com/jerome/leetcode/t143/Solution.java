package com.jerome.leetcode.t143;

import java.util.*;

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
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int front = 0;
        int end = list.size() - 1;
        while (front < end) {
            list.get(front).next = list.get(end);
            if (front + 1 <= end) {
                list.get(end).next = list.get(front + 1);
            }
            front++;
            end--;
            if (front >= end) {
                list.get(front).next = null;
            }
        }

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        new Solution().reorderList(node);

    }
}

class ListNode {
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