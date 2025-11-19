package datastructures.interfaces;

/**
 * Generic container interface used for fundamental linear data structures
 * such as Stack (LIFO) and Queue (FIFO).
 *
 * @param <E> the type of elements stored in the container
 */
public interface IContainer<E> {

    /**
     * Adds an element to the data structure.
     * For a stack: pushed on top.
     * For a queue: added at the end.
     *
     * @param item the element to add
     */
    void addItem(E item);

    /**
     * Removes and returns an element from the data structure.
     * For a stack: removes the top element.
     * For a queue: removes the front element.
     *
     * @return the removed element
     */
    E removeItem();

    /**
     * Resizes the underlying storage if necessary.
     * Used for array-based implementations (Stack or Queue).
     */
    void resize();

    /**
     * Displays the current elements in the data structure
     * in their logical order.
     */
    void display();
}
