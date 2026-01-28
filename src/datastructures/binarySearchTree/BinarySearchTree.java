package datastructures.binarySearchTree;

import datastructures.interfaces.ITree;

/**
 * Implementation of a Binary Search Tree (BST).
 *
 * A Binary Search Tree is a hierarchical data structure where:
 * - Each node contains a value
 * - Values smaller than the current node are stored in the left subtree
 * - Values greater than the current node are stored in the right subtree
 *
 * @param <E> the type of elements stored in the tree,
 *            must be comparable to maintain ordering
 */
public class BinarySearchTree<E extends Comparable<E>> implements ITree<E> {

    /**
     * Root node of the binary search tree.
     */
    private Node root;

    /**
     * Internal node class representing a tree node.
     * Each node stores a value and references to its left and right children.
     */
    private class Node {
        private E value;
        private Node left;
        private Node right;

        /**
         * Creates a new node with the given value.
         *
         * @param value the value stored in the node
         */
        public Node(E value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Adds an element to the binary search tree.
     *
     * @param child the element to add
     * @return the added element
     */
    @Override
    public E addChild(E child) {
        root = addChildRec(root, child);
        return child;
    }

    /**
     * Recursive method to insert a value into the tree.
     *
     * @param parent the current node
     * @param child  the value to insert
     * @return the updated node
     */
    private Node addChildRec(Node parent, E child) {
        if (parent == null) {
            root = new Node(child);
        }

        int compare = child.compareTo(parent.value);

        if (compare < 0) {
            parent.left = addChildRec(parent.left, child);
        } else if (compare > 0) {
            parent.right = addChildRec(parent.right, child);
        }

        return parent;
    }

    /**
     * Removes an element from the binary search tree.
     *
     * @param child the element to remove
     * @return the removed element
     */
    @Override
    public E removeChild(E child) {
        root = removeChildRec(root, child);
        return child;
    }

    /**
     * Recursive method to remove a value from the tree.
     *
     * @param parent the current node
     * @param child  the value to remove
     * @return the updated node
     */
    private Node removeChildRec(Node parent, E child) {
        if (parent == null) {
            return null;
        }

        int compare = child.compareTo(parent.value);

        if (compare < 0) {
            parent.left = removeChildRec(parent.left, child);
        } else if (compare > 0) {
            parent.right = removeChildRec(parent.right, child);
        } else {
            // Case 1: node has no children
            if (parent.left == null && parent.right == null) {
                return null;
            }

            // Case 2: node has only one child
            if (parent.left == null) {
                return parent.right;
            } else if (parent.right == null) {
                return parent.left;
            }

            // Case 3: node has two children
            Node successor = min(parent.right);
            parent.value = successor.value;
            parent.right = removeChildRec(parent.right, successor.value);
        }

        return parent;
    }

    /**
     * Finds the node with the minimum value in a subtree.
     *
     * @param node the root of the subtree
     * @return the node containing the minimum value
     */
    private Node min(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    /**
     * Searches for an element in the binary search tree.
     *
     * @param child the element to search for
     * @return true if the element exists, false otherwise
     */
    @Override
    public boolean researchChild(E child) {
        Node res = researchChildRec(root, child);
        return res != null;
    }

    /**
     * Recursive method to search for a value in the tree.
     *
     * @param parent the current node
     * @param child  the value to search for
     * @return the node if found, null otherwise
     */
    private Node researchChildRec(Node parent, E child) {
        if (parent == null) {
            return null;
        }

        int compare = child.compareTo(parent.value);

        if (compare < 0) {
            parent.left = researchChildRec(parent.left, child);
        } else if (compare > 0) {
            parent.right = researchChildRec(parent.right, child);
        }

        return parent;
    }

    /**
     * Performs a Pre-Order traversal of the tree.
     */
    @Override
    public void preOrder() {
        preOrderRec(root);
    }

    /**
     * Recursive Pre-Order traversal.
     *
     * @param node the current node
     */
    private void preOrderRec(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preOrderRec(node.left);
        preOrderRec(node.right);
    }

    /**
     * Performs an In-Order traversal of the tree.
     */
    @Override
    public void inOrder() {
        inOrderRec(root);
    }

    /**
     * Recursive In-Order traversal.
     *
     * @param node the current node
     */
    private void inOrderRec(Node node) {
        if (node == null) {
            return;
        }

        inOrderRec(node.left);
        System.out.print(node.value + " ");
        inOrderRec(node.right);
    }

    /**
     * Performs a Post-Order traversal of the tree.
     */
    @Override
    public void postOrder() {
        postOrderRec(root);
    }

    /**
     * Recursive Post-Order traversal.
     *
     * @param node the current node
     */
    private void postOrderRec(Node node) {
        if (node == null) {
            return;
        }

        postOrderRec(node.left);
        postOrderRec(node.right);
        System.out.print(node.value + " ");
    }
}
