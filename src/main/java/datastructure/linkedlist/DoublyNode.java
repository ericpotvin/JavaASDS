package datastructure.linkedlist;

/**
 * Node class
 */
class DoublyNode {

    /**
     * The node value
     */
    private int value;

    /**
     * The next node
     */
    private DoublyNode next;

    /**
     * The next node
     */
    private DoublyNode previous;

    /**
     * Constructor
     * @param value The value
     */
    private DoublyNode(int value) {
        this.value = value;
        next = null;
        previous = null;
    }

    /**
     * Create a node
     * @param value The value
     * @return Node
     */
    public static DoublyNode create(int value) {
        return new DoublyNode(value);
    }

    /**
     * Get the value of a Node
     * @return int
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the next node
     * @return Node
     */
    public DoublyNode getNext() {
        return next;
    }

    /**
     * Set the next node
     * @param next The next node
     */
    public void setNext(DoublyNode next) {
        this.next = next;
    }

    /**
     * Get the previous node
     * @return SimpleNode
     */
    public DoublyNode getPrevious() {
        return previous;
    }

    /**
     * Set the previous node
     * @param previous The node
     */
    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }
}
