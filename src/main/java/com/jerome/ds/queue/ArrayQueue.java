package com.jerome.ds.queue;

public class ArrayQueue<E> {
    int front;
    int rear;
    int size;
    int capacity;
    private final Object[] queue;

    public ArrayQueue(int capacity) {
        queue = new Object[capacity];
        this.capacity = capacity;
        size = 0;
        front = 0;
        rear = 1;
    }

    public boolean enqueue(E e) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return false;
        }
        queue[rear] = e;
        rear = (rear + 1) % capacity;
        size++;
        return true;

    }

    public E dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        E e = (E) queue[front];
        front = (front + 1) % capacity;
        size--;
        return e;

    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) queue[front];
    }

    public boolean isFull() {
        return size >= capacity;
    }

    public boolean isEmpty() {
        return size <= 0;
    }
}
