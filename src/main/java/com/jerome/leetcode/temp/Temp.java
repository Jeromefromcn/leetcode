package com.jerome.leetcode.temp;

public class Temp {
    public static void main(String[] args) {

        String s = "1234324";
        int start = 1;
        int end = 5;
        System.out.println(s.substring(start, end + 1));
        System.out.println(s.substring(0,1));
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