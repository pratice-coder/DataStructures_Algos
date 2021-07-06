package linkedlist;

public class DoublyLinkedListDemoProgram1 {
    Node head;

    static class Node {
        Object data;
        Node next,prev;

        public Node(Object data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListDemoProgram1 program1 = new DoublyLinkedListDemoProgram1();

        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        program1.head = firstNode;
        firstNode.prev = null;

        firstNode.next = secondNode;
        secondNode.prev = firstNode;
        secondNode.next = thirdNode;
        thirdNode.prev = secondNode;
        thirdNode.next = fourthNode;
        fourthNode.prev = thirdNode;

        fourthNode.next = null;

        program1.print();
        System.out.println();
        program1.printReverse(fourthNode);
    }

    public void print() {
        Node node = head;

        while(node!=null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
    }

    /**
     * Traverse the DLL from backwards
     * Note - Here I have taken Last node as param. So just use the prev
     *        pointer to get the node data.
     * @param node  The last node
     */
    public void printReverse(Node node) {

        while(node!=null) {
            System.out.print(node.data + "\t");
            node = node.prev;
        }

    }
}
