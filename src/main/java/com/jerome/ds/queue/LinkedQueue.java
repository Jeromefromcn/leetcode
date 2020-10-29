package com.jerome.ds.queue;

import java.util.HashMap;
import java.util.Map;

public class LinkedQueue<E> {

    private class QueueNode<E> {
        E val;
        QueueNode<E> next;

        QueueNode() {

        }

        QueueNode(E val) {
            this.val = val;
        }
    }

    private final QueueNode<E> dummyFront;
    private QueueNode<E> rear;

    public LinkedQueue() {
        dummyFront = new QueueNode<>();
    }

    public void enqueue(E e) {
        QueueNode<E> node = new QueueNode<>(e);
        if (isEmpty()) {
            dummyFront.next = node;
            rear = node;
        } else {
            node.next = dummyFront.next;
            dummyFront.next = node;
        }
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        QueueNode<E> node = dummyFront.next;
        dummyFront.next = node.next;
        if (node.next == null) {
            rear = null;
        }
        return node.val;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return dummyFront.next.val;
    }

    public boolean isEmpty() {
        return dummyFront.next == null;
    }

}
