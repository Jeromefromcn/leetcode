package com.jerome.ds.heap;

import com.google.common.base.Strings;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MaxHeap {
    int[] array;
    int capacity;
    int size;

    MaxHeap(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int val) {
        if (size == capacity) {
            capacity = capacity * 2;
            array = Arrays.copyOf(array, capacity);
        } else {
            array[size++] = val;
            heapifyUp();
        }
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && array[parent(index)] < array[index]) {
            swap(parent(index), index);
            index = parent(index);
        }

    }

    private void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public int poll() {
        if (size > 0) {
            int element = array[0];
            array[0] = array[size - 1];
            size--;
            heapifyDown();
            return element;
        } else {
            throw new NoSuchElementException();
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int maxChildIndex = leftChild(index);
            if (hasRightChild(index)
                    && array[maxChildIndex] < array[rightChild(index)]) {
                maxChildIndex = rightChild(index);
            }
            if (array[index] > array[maxChildIndex]) {
                break;
            }
            swap(index, maxChildIndex);
            index = maxChildIndex;
        }
    }

    public int peek() {
        if (size() > 0) {
            return array[0];
        } else {
            throw new NoSuchElementException();
        }
    }

    private boolean hasLeftChild(int index) {
        return leftChild(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChild(index) < size;
    }

    private boolean hasParent(int index) {
        return index > 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(1000);
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(8);
        System.out.println(maxHeap.toString());
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.toString());
    }
}
