package datastructure.tree;

/**
 * Binary Node
 */
class BinaryNode {

    /**
     * The node value
     */
    private int value;
    /**
     * The left node
     */
    private BinaryNode left;
    /**
     * The right node
     */
    private BinaryNode right;

    /**
     * Constructor
     * @param value The value
     */
    private BinaryNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    /**
     * Create a node
     * @param value The value
     * @return Node
     */
    public static BinaryNode create(int value) {
        return new BinaryNode(value);
    }

    /**
     * Get the node value
     * @return int
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the left node
     * @return BinaryNode
     */
    public BinaryNode getLeft() {
        return left;
    }

    /**
     * Get the right node
     * @return BinaryNode
     */
    public BinaryNode getRight() {
        return right;
    }

    /**
     * Set the left node
     * @param left The node
     */
    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    /**
     * Set the right node
     * @param right The node
     */
    public void setRight(BinaryNode right) {
        this.right = right;
    }
}