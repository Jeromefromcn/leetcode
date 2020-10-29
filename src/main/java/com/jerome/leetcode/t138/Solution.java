package com.jerome.leetcode.t138;

import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        List<Node> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        List<Node> clone = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            clone.add(new Node(list.get(i).val));
        }
        for (int i = 0; i < clone.size() - 1; i++) {
            Node node = clone.get(i);
            node.next = clone.get(i + 1);
            node.random = list.get(i).random == null ? null : clone.get(list.indexOf(list.get(i).random));
        }
        clone.get(clone.size() - 1).random
                = list.get(clone.size() - 1).random == null ? null : clone.get(list.indexOf(list.get(clone.size() - 1).random));
        return clone.get(0);
    }
}