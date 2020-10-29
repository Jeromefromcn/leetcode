package com.jerome.ds.linked;

public class Node<E> {
    private E val;
    private Node<E> next;

    public Node() {
    }

    public Node(E val) {
        this.val = val;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
