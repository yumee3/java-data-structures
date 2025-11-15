package datastructures;

import datastructures.interfaces.IContainer;
import datastructures.queue.ArrayQueue;
import datastructures.stack.ArrayStack;

public class Main {

    public static void main(String[] args) {

        // =============================
        //           STACK DEMO
        // =============================
        IContainer<Integer> stack = new ArrayStack<>();

        // Push elements onto the stack
        stack.addItem(1);
        stack.addItem(2);
        stack.addItem(3);
        stack.addItem(4);
        stack.addItem(5);

        // Pop last inserted element (LIFO)
        stack.removeItem();
        System.out.println("Last element removed from stack: " + stack.removeItem());

        System.out.println("\nStack content:");
        stack.display();


        // =============================
        //           QUEUE DEMO
        // =============================
        IContainer<Integer> queue = new ArrayQueue<>();

        // Enqueue elements
        queue.addItem(1);
        queue.addItem(2);
        queue.addItem(3);
        queue.addItem(4);
        queue.addItem(5);

        // Dequeue the oldest elements (FIFO)
        queue.removeItem();
        queue.removeItem();
        queue.removeItem();

        // Add more elements to test wrap-around or resizing
        queue.addItem(6);
        queue.addItem(7);
        queue.addItem(8);
        queue.addItem(9);

        System.out.println("\nQueue content:");
        queue.display();
    }
}
