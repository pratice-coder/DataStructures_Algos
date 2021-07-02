package linkedlist;

public class LinkedListDemoProgram1 {
    Node head;

    static class Node {
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListDemoProgram1 program1 = new LinkedListDemoProgram1();

        /**
         * Standalone Nodes creation
         */
        Node first = new Node(1); // First Node
        Node second = new Node(2); // Second Node
        Node third = new Node(3); // Third Node

        program1.head = first; // Head is associated to first Node
        first.next = second; // Next of first Node associated with Second
        second.next = third; // Next of second Node associated with Third

        program1.printNodes();
    }

    /**
     * Print all the Nodes information in a LinkedList
     */
    void printNodes() {
        Node node = head;
        while(node!=null){
            System.out.println("Data : " + node.data);
            node = node.next;
        }
    }
}
