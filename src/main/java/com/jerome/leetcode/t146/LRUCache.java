package com.jerome.leetcode.t146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private class LinkNode {
        private int key;
        private int value;
        private LinkNode prev;
        private LinkNode next;
        public LinkNode() {}
        public LinkNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    private Map<Integer, LinkNode> cache = new HashMap<>();
    private LinkNode dummyHead;
    private LinkNode dummyTail;
    private int capacity;
    private int size;

    public LRUCache(int capacity) {
        size = 0;
        this.capacity = capacity;
        dummyHead = new LinkNode();
        dummyTail = new LinkNode();
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public int get(int key) {
        LinkNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(LinkNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(LinkNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void put(int key, int value) {
        LinkNode node = cache.get(key);
        if (node == null) {
            node = new LinkNode(key, value);
            cache.put(key, node);
            addToHead(node);
            size++;
            if (size > capacity) {
                LinkNode tail  = removeTail();
                cache.remove(tail.key);
                size--;
            }

        } else {
            node.value = value;
            moveToHead(node);
        }


    }

    private LinkNode removeTail() {
        LinkNode node = dummyTail.prev;
        removeNode(node);
        return node;
    }

    private void addToHead(LinkNode node) {
        dummyHead.next.prev = node;
        node.next = dummyHead.next;
        node.prev = dummyHead;
        dummyHead.next = node;
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */