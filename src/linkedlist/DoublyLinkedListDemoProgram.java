package linkedlist;

public class DoublyLinkedListDemoProgram {
    Node head; // Head pointer of the DLL which points to the first Node

    /**
     * A typical standalone Node which has three elements in it
     * 1. data
     * 2. pointer to the next Node
     * 3. pointer to the previous Node
     * Note - Prev pointer of the first node is always NULL
     *        Next pointer of the last node is always NULL
     */
    class Node {
        Object data; // Item of type Object (DLL can contain all kinds of data)
        Node next,prev; // next and previous nodes are null until the link is not
                        // established between the nodes.

        public Node(Object data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
}
