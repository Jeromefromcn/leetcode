package com.jerome.ds.linked;


import java.util.Objects;

public class LinkedList<E> {
    private int size;
    private final Node<E> dummyHead;
    private Node<E> tail;

    public LinkedList() {
        size = 0;
        dummyHead = new Node<>();
        tail = null;
    }

    public void insert(Node<E> node) {
        if (dummyHead.getNext() == null) {
            dummyHead.setNext(node);
        }
        tail.setNext(node);
        tail = node;
        size++;
    }

    public Node<E> delete(Node<E> node) {
        if (size <= 0) {
            return null;
        }
        Node<E> head = dummyHead;
        while (head.getNext() != null) {
            if (Objects.equals(node.getVal(), head.getNext().getVal())) {
                head.setNext(head.getNext().getNext());
                size--;
                if (head.getNext() == null) {
                    tail = null;
                }
                return node;
            }
            head = head.getNext();
        }
        return null;
    }

    public E find(E val) {
        if (size <= 0) {
            return null;
        }
        Node<E> head = dummyHead;
        while (head.getNext() != null) {
            if (Objects.equals(val, head.getNext().getVal())) {
                return head.getNext().getVal();
            }
            head = head.getNext();
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> head = dummyHead.getNext();
        while (head != null) {
            sb.append(head.getVal()).append(" -> ");
            head = head.getNext();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        head.setNext(n1);
        Node<Integer> n2 = new Node<>(3);
        n1.setNext(n2);
        Node<Integer> n3 = new Node<>(4);
        n2.setNext(n3);
        System.out.println(head.toString());
        Node reversedHead = reverse(head);
        System.out.println(reversedHead);
    }

    private static Node<Integer> reverse(Node<Integer> head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node<Integer> reversedHead = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return reversedHead;
    }
}
