package datastructures.interfaces;

public interface IContainer<E> {
    void addItem(E item);        // Adds an element to the structure
    E removeItem();              // Removes and returns an element from the structure
    void resize();               // Resizes the underlying storage when necessary
    void display();              // Displays the current elements
}
