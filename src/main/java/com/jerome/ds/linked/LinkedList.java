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
}
