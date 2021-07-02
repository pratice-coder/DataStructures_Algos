package linkedlist;

public class LinkedListDemoProgram {
    Node head; // Head of the LinkedList

    /**
     * A typical LinkedList Node
     */
    class Node {
        Object data; // ->
        Node next;

        /*
            Constructor to create a standalone Node.
            next is always NULL until there is a link established to the next Node
         */
        Node(Object data) {
            this.data = data;
            next = null;
        }
    }
}
