package com.hll.design._09Iterator;

/**
 * Created by linglong.he on 2020/9/2.
 */
public interface Collection_<E> {

    void add(E object);

    int size();

    Iterator_<E> iterator();


}

interface Iterator_<E> {
    boolean hasNext();

    E next();
}

class ArrayList_<E> implements Collection_<E> {

    private E[] obj = (E[]) new Object[10];
    private int index;

    public void add(E object) {
        if (index == obj.length) {
            E[] o = (E[]) new Object[obj.length * 2];
            System.arraycopy(obj, 0, o, 0, obj.length);
            obj = o;
        }
        obj[index] = object;
        index++;
    }

    public int size() {
        return index;
    }

    public Iterator_<E> iterator() {
        return new ListIterator_<E>();
    }

    private class ListIterator_<E> implements Iterator_<E> {

        private int current;

        public boolean hasNext() {
            return current < index;
        }

        public E next() {
            E e = (E) obj[current];
            current++;
            return e;
        }
    }
}


class LinkList_<E> implements Collection_<E> {

    private Node_<E> header;
    private Node_<E> tail;

    private int size;

    public void add(E object) {
        Node_ n = tail;
        Node_ node_ = new Node_(n, object, null);
        tail = node_;
        if (n == null)
            header = node_;
        else {
            n.next = node_;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Iterator_<E> iterator() {
        return null;
    }

    private class LinkedIterator<E> implements Iterator_<E> {

        private int current;

        public boolean hasNext() {
            return current < size;
        }

        public E next() {
            current++;
            return null;
        }
    }


    private class Node_<E> {
        private E o;
        private Node_ next;
        private Node_ pre;

        public Node_(Node_<E> pre, E o, Node_<E> next) {
            this.pre = pre;
            this.o = o;
            this.next = next;
        }

    }

}


