package com.jerome.ds.linked;


public class DpLinkedList<E> {
    private int size;
    private final DpNode<E> dummyHead;
    private final DpNode<E> dummyTail;

    public DpLinkedList() {
        size = 0;
        dummyHead = new DpNode<>();
        dummyTail = new DpNode<>();
        dummyHead.setNext(dummyTail);
        dummyTail.setPrev(dummyHead);
    }

    public void addFirst(DpNode<E> node) {
        dummyHead.getNext().setPrev(node);
        dummyHead.setNext(node);
        size++;
    }

    public void addLast(DpNode<E> node) {
        dummyTail.getPrev().setNext(node);
        dummyTail.setPrev(node);
        size++;
    }


    public int getSize() {
        return size;
    }
}
