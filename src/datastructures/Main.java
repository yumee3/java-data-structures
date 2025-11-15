import datastructures.interfaces.ITab;
import datastructures.queue.Queue;
import datastructures.stack.Stack;

public class Main {

    public static void main(String[] args) {

        // =============================
        //           STACK DEMO
        // =============================
        ITab<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.addItem(1);
        stack.addItem(2);
        stack.addItem(3);
        stack.addItem(4);
        stack.addItem(5);

        // Pop last inserted element (LIFO)
        stack.removeItem();
        System.out.println("Last element removed from stack: " + stack.removeItem());

        System.out.println("\ndatastructures.stack.Stack content:");
        stack.display();


        // =============================
        //           QUEUE DEMO
        // =============================
        ITab<Integer> queue = new Queue<>();

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

        System.out.println("\ndatastructures.queue.Queue content:");
        queue.display();
    }
}
