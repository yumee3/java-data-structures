package datastructures.stack;

import datastructures.interfaces.IContainer;

public class ArrayStack<E> implements IContainer<E> {

    E[] tab;
    int size;

    public ArrayStack()
    {
        this.tab = (E[]) new Object[5];
        size = 0;
    }


    @Override
    public void addItem(E item)
    {
        if (size == tab.length)
        {
            resize();
        }
        tab[size++] = item;
    }

    @Override
    public E removeItem()
    {
        if (size < 0)
        {
            return null;
        }
        return tab[--size];
    }

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

    @Override
    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println(tab[i]);
        }
    }
}
