package com.jerome.ds.linked;

public class DpNode<E> {
    private E val;
    private DpNode<E> next;
    private DpNode<E> prev;

    public DpNode() {
    }

    public DpNode(E val) {
        this.val = val;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public DpNode<E> getNext() {
        return next;
    }

    public void setNext(DpNode<E> next) {
        this.next = next;
    }

    public DpNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DpNode<E> prev) {
        this.prev = prev;
    }
}
