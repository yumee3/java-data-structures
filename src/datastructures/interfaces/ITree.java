package datastructures.interfaces;

public interface ITree<E> {
    E addChild(E child);
    E removeChild(E child);
    boolean researchChild(E child);
    void preOrder();
    void inOrder();
    void postOrder();
}
