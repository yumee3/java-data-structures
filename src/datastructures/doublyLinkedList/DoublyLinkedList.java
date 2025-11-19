package datastructures.doublyLinkedList;

import datastructures.interfaces.IDoublyLinkedList;

/**
 * Implementation of a doubly linked list.
 * Supports insertion and removal from both ends.
 *
 * @param <E> the type of elements stored in the list
 */
public class DoublyLinkedList<E> implements IDoublyLinkedList<E> {

    /**
     * Internal node class storing value and links to neighbors.
     */
    class Node {
        E value;
        Node next;
        Node prev;

        public Node(E value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node first;
    private Node last;

    @Override
    public void addFirst(E e) {
        Node n = new Node(e);
        if (first == null) {
            first = n;
            last = n;
        } else {
            first.prev = n;
            n.next = first;
            first = n;
        }
    }

    @Override
    public void addLast(E e) {
        Node n = new Node(e);
        if (last == null) {
            first = n;
            last = n;
        } else {
            last.next = n;
            n.prev = last;
            last = n;
        }
    }

    @Override
    public E removeFirst() {
        if (first == null) return null;

        E e = first.value;

        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.next;
            first.prev = null;
        }

        return e;
    }

    @Override
    public E removeLast() {
        if (last == null) return null;

        E e = last.value;

        if (first == last) {
            first = null;
            last = null;
        } else {
            last = last.prev;
            last.next = null;
        }

        return e;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}