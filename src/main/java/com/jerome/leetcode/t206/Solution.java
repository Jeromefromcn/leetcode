package com.jerome.leetcode.t206;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        new Solution().reverseList(node1);
    }
    public ListNode reverseList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        head = stack.peek();
        while (stack.peek() != null) {
            stack.pop().next = stack.peek();
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}