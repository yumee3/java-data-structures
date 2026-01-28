package datastructures.interfaces;

/**
 * Generic interface representing a Tree data structure.
 *
 * A tree is a hierarchical data structure composed of nodes,
 * where each node can have zero or more children.
 *
 * This interface defines basic operations such as adding,
 * removing, searching nodes, and traversing the tree
 * using different traversal strategies.
 *
 * @param <E> the type of elements stored in the tree
 */
public interface ITree<E> {

    /**
     * Adds a child element to the tree.
     *
     * Depending on the tree implementation (binary tree,
     * n-ary tree, etc.), the position of the child may vary.
     *
     * @param child the element to add as a child
     * @return the added child element
     */
    E addChild(E child);

    /**
     * Removes a child element from the tree.
     *
     * If the element exists, it is removed along with
     * its potential subtree.
     *
     * @param child the element to remove
     * @return the removed child element
     */
    E removeChild(E child);

    /**
     * Searches for a specific element in the tree.
     *
     * @param child the element to search for
     * @return true if the element exists in the tree,
     *         false otherwise
     */
    boolean researchChild(E child);

    /**
     * Traverses the tree using Pre-Order traversal.
     *
     * Pre-Order traversal visits:
     * 1. The current node
     * 2. The left subtree
     * 3. The right subtree
     */
    void preOrder();

    /**
     * Traverses the tree using In-Order traversal.
     *
     * In-Order traversal visits:
     * 1. The left subtree
     * 2. The current node
     * 3. The right subtree
     *
     * Mainly used in Binary Search Trees (BST)
     * to retrieve sorted elements.
     */
    void inOrder();

    /**
     * Traverses the tree using Post-Order traversal.
     *
     * Post-Order traversal visits:
     * 1. The left subtree
     * 2. The right subtree
     * 3. The current node
     *
     * Commonly used for deleting trees or
     * evaluating expressions.
     */
    void postOrder();
}
