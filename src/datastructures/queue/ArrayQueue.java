package datastructures.queue;

import datastructures.interfaces.IContainer;

public class ArraQueue<E> implements IContainer<E> {

    E[] tab;
    int size;
    int in;
    int out;

    public ArraQueue()
    {
        this.tab = (E[]) new Object[5];
        size = in = out = 0;
    }

    @Override
    public void addItem(E item)
    {
        if (size == tab.length)
        {
            resize();
        }
        tab[in] = item;
        in = (in + 1) % tab.length;
        size++;
    }

    @Override
    public E removeItem()
    {
        if (size == 0) {
            return null;
        }
        E value = tab[out];
        out = (out + 1) % tab.length;
        size--;
        return value;
    }

    @Override
    public void resize()
    {
        int oldLength = tab.length;
        E[] newTab = (E[]) new Object[oldLength * 2];

        for (int i = 0; i < size; i++)
        {
            newTab[i] = tab[(out + i) % oldLength];
        }

        tab = newTab;
        out = 0;
        in = size;
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++)
        {
            System.out.println(tab[(out + i) % tab.length]);
        }
    }
}
