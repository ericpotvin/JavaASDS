package datastructure.linkedlist;

/**
 * Node class
 */
class SimpleNode {

    /**
     * The node value
     */
    protected int value;

    /**
     * The next node
     */
    protected SimpleNode next;

    /**
     * Constructor
     * @param value The value
     */
    SimpleNode(int value) {
        this.value = value;
        next = null;
    }

    /**
     * Create a node
     * @param value The value
     * @return Node
     */
    public static SimpleNode create(int value) {
        return new SimpleNode(value);
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
    public SimpleNode getNext() {
        return next;
    }

    /**
     * Set the next node
     * @param next The next node
     */
    public void setNext(SimpleNode next) {
        this.next = next;
    }
}
