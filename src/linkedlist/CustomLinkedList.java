package linkedlist;

import sun.jvm.hotspot.code.CompressedStream;

/**
 * @author Abinash Dash
 */
public class CustomLinkedList {
    Node head;
    public static int LENGTH = 0;

    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * Inserts data to the beginning of a SinglyLinkedList
     * @param  data data of type Object that needs to be inserted
     * @return true -> if the insertion is successful
     *         false -> otherwise
     */
    public boolean insertAtFirst(Object data) {
        if(data == null)
            return false;
        else {
            Node node = new Node(data); // Create a new Node
            node.next = head; // next of newly created node should be set to the head of
                              // existing linkedlist
            head = node; // as the newly created node is concatenated to the beginning of
                         // linkedlist, head should point to the new node.
            return true;
        }
    }

    /**
     * Inserts data to the end of a LinkedList
     * @param  data data of type Object that needs to be inserted
     * @return true -> if the insertion is successful
     *         false -> otherwise
     */
    public boolean insertAtLast(Object data) {
        Node node = head;
        if(data == null || node == null)
            return false;
        else {

            return true;
        }
    }

    /**
     * Inserts data at a specific index of a LinkedList
     * @param  data  data of type Object that needs to be inserted
     * @param  index specific position at where the data needs to be
     *               inserted
     * @return true -> if the insertion is successful
     *         false -> otherwise
     */
    public boolean insertAtSpecificIndex(Object data, int index) {
        return false;
    }

    /**
     * Finds the length of a LinkedList
     * TODO Do this in Recursive way
     * @return LENGTH -> a static instance, that gives the length of a LinkedList
     */
    public int length() {
        Node node = head;
        while(node!=null) {
            LENGTH ++;
            node = node.next;
        }
        return LENGTH;
    }

    /**
     * Search a sepcific element in a LinkedList
     * TODO Do this in Recursive way
     * @param data data of type Object that needs to be searched
     * @return  1 -> if the element is found
     *          -1 -> if not found
     */
    public int search(Object data) {
        int isFound = -1;
        Node node = head;

        while(node!=null) {
            if(node.data.equals(data)) {
                isFound = 1;
                break;
            }
            node = node.next;
        }
        return isFound;
    }

    /**
     * Finds the index of a specific data in LinkedList
     * TODO Do this in a recursive way
     * @param  data The data for which the position needs to be found
     * @return position of the element in LinkedList if found
     *         -1 otherwise
     */
    public int indexOf(Object data) {
        int counter = 0;
        if(data==null)
            return -1;

        Node node = head;
        while(node!=null){
            if(node.data.equals(data)) {
                return counter;
            }
            counter++;
            node = node.next;
        }
        return -1;
    }

    /**
     * Finds the data at a requested index of  LinkedList
     * TODO Do this in a recursive way
     * @param index The index for which the search has to happen
     * @return  the found object
     *          if not found then returns NULL
     */
    public Object findAt(int index) {
        int counter = 0;
        if(index < 0)
            return null;

        Node node = head;
        while(node!=null) {
            if(counter==index) {
                return node.data;
            }
            counter ++;
            node=node.next;
        }
        return null;
    }

    /**
     * Finds the middle element in a LinkedList using 2 pointers technique
     * 2 pointer technique - Use 2 pointers while traversing
     *                       1. first pointer -> moves 2 places ahead
     *                       2. slow pointer -> moves only 1 place ahead
     *                       By the time fast pointer reaches to the end of LinkedList,
     *                       slow pointer will be at middle
     * Note - Applies to both ODD and EVEN length LinkedList
     * @return data of type Object which is the middle of the LinkedList
     */
    public Object findMiddleElement() {
        if(head==null)
            return null;

        Node first = head;
        Node slow = head;
        while(first!=null && first.next!=null){
            slow = slow.next;
            first = first.next.next;
        }
        return slow.data;
    }

    /**
     * Traverse across the linkedlist to print the nodes information
     */
    public void printData() {
        Node node = head;
        while(node!=null){
            System.out.println("Data = " + node.data);
            node = node.next;
        }
    }
}
