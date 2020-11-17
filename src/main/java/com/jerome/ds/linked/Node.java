package com.jerome.ds.linked;

import java.util.*;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> head = this;
        while (head != null) {
            sb.append(head.getVal()).append(" -> ");
            head = head.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(set);
    }
}
