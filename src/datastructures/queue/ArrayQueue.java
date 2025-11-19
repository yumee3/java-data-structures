package datastructures.queue;

import datastructures.interfaces.IContainer;

/**
 * Array-based implementation of a queue (FIFO).
 * Uses circular indexing for efficient enqueue/dequeue.
 *
 * @param <E> the type of elements stored in the queue
 */
public class ArrayQueue<E> implements IContainer<E> {

    private E[] tab;
    private int size;
    private int in;
    private int out;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        this.tab = (E[]) new Object[5];
        this.size = 0;
        this.in = 0;
        this.out = 0;
    }

    /**
     * Enqueues an element at the end of the queue.
     */
    @Override
    public void addItem(E item) {
        if (size == tab.length) {
            resize();
        }
        tab[in] = item;
        in = (in + 1) % tab.length;
        size++;
    }

    /**
     * Dequeues and returns the oldest element in the queue.
     *
     * @return the removed element, or null if empty
     */
    @Override
    public E removeItem() {
        if (size == 0) {
            return null;
        }
        E value = tab[out];
        out = (out + 1) % tab.length;
        size--;
        return value;
    }

    /**
     * Resizes the internal array when full.
     * Copies elements in logical order (starting from 'out').
     */
    @SuppressWarnings("unchecked")
    @Override
    public void resize() {
        int oldLength = tab.length;
        E[] newTab = (E[]) new Object[oldLength * 2];

        for (int i = 0; i < size; i++) {
            newTab[i] = tab[(out + i) % oldLength];
        }

        tab = newTab;
        out = 0;
        in = size;
    }

    /**
     * Displays the queue content in FIFO order.
     */
    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(tab[(out + i) % tab.length]);
        }
    }
}
