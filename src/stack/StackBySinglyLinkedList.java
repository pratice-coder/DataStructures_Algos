package stack;

/**
 * @author  Abinash Dash
 * Stack implementation using SinglyLinkedList Data structure
 */
public class StackBySinglyLinkedList {
    Node head;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data=data;
            next=null;
        }
    }

    /**
     * Pushes the element to the Stack
     * @param data element of type Object that needs to be pushed
     * @return true -> if the insertion is successful
     *         false otherwise
     */
    public boolean push(Object data) {
        if(data==null)
            return false;
        else {
            Node node = new Node(data);
            node.next = head;
            head = node;
            return true;
        }
    }

    /**
     * Pops out the element from the stack
     * @return  the popped item of type Object
     */
    public Object pop() {
        Object poppedItem;
        if(head==null)
            return null;

        poppedItem = head.data;
        head = head.next;

        return poppedItem;
    }

    /**
     * Gives a element at top of the stack
     * @return the top element at stack
     */
    public Object peek() {
        return head.data;
    }

    /**
     * Prints all the elements of a stack
     */
    public void iterate() {
        if(head==null) {
            System.out.println("Stack is empty. Nothing to iterate");
            return;
        }
        Node node = head;
        while(node!=null) {
            System.out.print(node.data + "\t");
            node=node.next;
        }
    }
}
