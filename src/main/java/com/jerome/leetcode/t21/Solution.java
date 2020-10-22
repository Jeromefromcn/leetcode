package com.jerome.leetcode.t21;

import java.util.ArrayList;
import java.util.Comparator;
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<ListNode> list = new ArrayList<>();
        while (l1 != null) {
            list.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            list.add(l2);
            l2 = l2.next;
        }
        if (list.isEmpty()) {
            return null;
        }
        list.sort(Comparator.comparingInt(o -> o.val));
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size()) {
                list.get(i).next = list.get(i + 1);
            }
        }
        return list.get(0);
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