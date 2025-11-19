package datastructures.interfaces;

/**
 * Interface defining the basic operations of a doubly linked list.
 *
 * @param <E> the type of elements stored in the list
 */
public interface IDoublyLinkedList<E> {

    /**
     * Inserts an element at the beginning of the list.
     *
     * @param e the element to add
     */
    void addFirst(E e);

    /**
     * Inserts an element at the end of the list.
     *
     * @param e the element to add
     */
    void addLast(E e);

    /**
     * Removes and returns the first element of the list.
     *
     * @return the removed element
     */
    E removeFirst();

    /**
     * Removes and returns the last element of the list.
     *
     * @return the removed element
     */
    E removeLast();

    /**
     * Checks whether the list is empty.
     *
     * @return true if empty, false otherwise
     */
    boolean isEmpty();
}
