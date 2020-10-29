package com.jerome.ds.stack;

public class ArrayStack<E> {
    private static final int CAPACITY = 1000;
    private Object[] stack;
    private int top;

    public ArrayStack() {
        top = -1;
        stack = new Object[CAPACITY];
    }

    public boolean push(E e) {
        if (top >= CAPACITY - 1) {
            System.out.println("Stack overflow!");
            return false;
        }
        stack[top++] = e;
        return true;
    }

    public E pop() {
        if (top < 0) {
            System.out.println("Stack underflow!");
            return null;
        }
        return (E) stack[top--];
    }

    public E peek() {
        if (top < 0) {
            System.out.println("Stack underflow!");
            return null;
        }
        return (E) stack[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }
}
