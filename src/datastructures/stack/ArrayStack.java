package datastructures.stack;

import datastructures.interfaces.IContainer;

/**
 * Array-based implementation of a stack (LIFO).
 *
 * @param <E> the type of elements stored in the stack
 */
public class ArrayStack<E> implements IContainer<E> {

    private E[] tab;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.tab = (E[]) new Object[5];
        this.size = 0;
    }

    /**
     * Pushes an element onto the top of the stack.
     */
    @Override
    public void addItem(E item)
    {
        if (size == tab.length)
        {
            resize();
        }
        tab[size++] = item;
    }

    /**
     * Removes and returns the last pushed element (top of the stack).
     *
     * @return the removed element, or null if empty
     */
    @Override
    public E removeItem()
    {
        if (size == 0)
        {
            return null;
        }
        return tab[--size];
    }

    /**
     * Doubles the capacity of the internal array.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void resize()
    {
        E[] newTab = (E[]) new Object[tab.length * 2];
        for (int i = 0; i < size; i++)
        {
            newTab[i] = tab[i];
        }
        tab = newTab;
    }

    /**
     * Displays stack contents from bottom to top.
     */
    @Override
    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println(tab[i]);
        }
    }
}
