package com.jerome.leetcode.t23;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//Definition for singly-linked list.
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

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0
                || Arrays.stream(lists).mapToInt(a -> a.val).sum() == 0) {
            return null;
        }
        Queue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (int i = 0; i < lists.length; i++) {
            heap.offer(lists[i]);
        }
        ListNode dummyHead = new ListNode();
        ListNode head = dummyHead;
        while (!heap.isEmpty()) {
            head.next = heap.poll();
            head = head.next;
            if (head.next != null) {
                heap.offer(head.next);
            }
        }
        return dummyHead.next;
    }
}