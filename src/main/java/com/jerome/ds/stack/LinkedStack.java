package com.jerome.ds.stack;

public class LinkedStack<E> {

    private class StackNode<E> {
        E val;
        StackNode<E> next;

        StackNode() {

        }

        StackNode(E val) {
            this.val = val;
        }
    }

    private final StackNode<E> dummyTop;

    public LinkedStack() {
        dummyTop = new StackNode<>();
    }

    public void push(E e) {
        StackNode<E> node = new StackNode<>(e);
        node.next = dummyTop.next;
        dummyTop.next = node;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        StackNode<E> node = dummyTop.next;
        dummyTop.next = node.next;
        return node.val;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return dummyTop.next.val;
    }

    public boolean isEmpty() {
        return dummyTop.next == null;
    }
}
