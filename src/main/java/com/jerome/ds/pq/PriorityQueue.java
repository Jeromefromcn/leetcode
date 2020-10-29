package com.jerome.ds.pq;

public class PriorityQueue<E> {
    class Node<E> {
        E val;
        int priority;
        Node<E> next;

        Node() {

        }

        Node(E val, int priority) {
            this.val = val;
            this.priority = priority;
        }

    }

    Node<E> dummyHead;

    PriorityQueue() {
        dummyHead = new Node<>();
    }

    public void push(E val, int priority) {
        Node<E> node = new Node<>(val, priority);
        Node<E> head = dummyHead;
        while (head.next != null && priority < head.next.priority) {
            head = head.next;
        }
        node.next = head.next;
        head.next = node;
    }

    public E pop() {
        Node<E> node = dummyHead.next;
        if (node == null) {
            return null;
        }
        dummyHead.next = dummyHead.next.next;

        return node.val;
    }

    public E peek() {
        if (dummyHead.next == null) {
            return null;
        }
        return dummyHead.next.val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> head = dummyHead.next;
        while (head != null) {
            sb.append("[val = ")
                    .append(head.val)
                    .append(", priority = ")
                    .append(head.priority)
                    .append("] -> ");
            head = head.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.push(3, 4);
        pq.push(5, 8);
        pq.push(4, 5);
        System.out.println(pq.toString());
        System.out.println(pq.peek());
        System.out.println(pq.pop());
        System.out.println(pq.toString());
    }
}
