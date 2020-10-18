package com.jerome.leetcode.t203;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode currentNode = dummyHead;
        while (currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode.val == val) {
                currentNode.next = nextNode.next;
                nextNode.next = null;
            } else {
                currentNode = currentNode.next;
            }
        }

        return dummyHead.next;
    }
}