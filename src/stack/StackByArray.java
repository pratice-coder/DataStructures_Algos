package stack;

/**
 * @author Abinash Dash
 * STACK - It is a linear data structure which follows the LIFO principle
 *         LIFO - Last In First Out
 */
public class StackByArray {

    private static int DEFAULT_SIZE = 5;
    private Object[] array;
    private int top = -1;

    public StackByArray() {
        super();
        array = new Object[DEFAULT_SIZE];
    }

    public StackByArray(int size) {
        super();
        DEFAULT_SIZE = size;
        array = new Object[DEFAULT_SIZE];
    }

    /**
     * Pushes the element to the Stack
     * @param  data Data of type Object that needs to be pushed
     * @return true -> if the push is successful
     *         false otherwise
     */
    public boolean push(Object data) {
        if(isFull()) {
            System.out.println("Stack is full. Please pop element to push further");
            return false;
        }

        if(data!=null) {
            array[++top] = data;
            return true;
        }
        return false;
    }

    /**
     * Pops out the element froma stack.
     * @return poppedItem The item that needs to be taken out.
     * Note - After popping out, the top pointer needs to be aimed to pos-1
     */
    public Object pop() {
        Object poppedItem = null;
        if(isEmpty()) {
            System.out.println("Stack is Empty. Please push element to pop further");
            return null;
        }
        poppedItem = array[top];
        top--;

        return poppedItem;
    }

    /**
     * Gives the element at the top position.
     * Note - peek() does not remove the element from Stack
     * @return  element at top of stack
     */
    public Object peek() {
        return array[top];
    }

    /**
     * Checks whether stack is full or not
     * @return true -> if the stack is full
     *         false otherwise
     */
    private boolean isFull() {
        return (top >= (array.length-1));
    }

    /**
     * Checks whether stack is empty or not
     * @return true -> if the stack is empty
     *         false otherwise
     */
    private boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Traverse across all the elements in a Stack DS
     */
    public void traverse() {
        if(array==null || array.length==0)
            System.out.println("Stack is empty. Nothing to traverse.");

        for(int index=0;index<=top;index++) {
            System.out.println(array[index] + "\t");
        }
    }
}
