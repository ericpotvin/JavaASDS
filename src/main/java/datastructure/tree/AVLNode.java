package datastructure.tree;

/**
 * AVLNode Class
 */
class AVLNode {

    /**
     * The value of the node
     */
    private int value;
    /**
     * The height of the node
     */
    private int height;
    /**
     * The left node
     */
    private AVLNode left;
    /**
     * the right node
     */
    private AVLNode right;

    /**
     * Constructor
     * @param value The value
     */
    private AVLNode(int value) {
        this.value = value;
        height = 1;
    }

    /**
     * Create a new node
     * @param value The value
     * @return AVLNode
     */
    public static AVLNode create(int value) {
        return new AVLNode(value);
    }

    /**
     * Get the value
     * @return int
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the height of the node
     * @return int
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the height of the node
     * @param height The height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the left node
     * @return AVLNode
     */
    public AVLNode getLeft() {
        return left;
    }

    /**
     * Set the left node
     * @param left The left node
     */
    public void setLeft(AVLNode left) {
        this.left = left;
    }

    /**
     * Get the right node
     * @return AVLNode
     */
    public AVLNode getRight() {
        return right;
    }

    /**
     * Set the right node
     * @param right The right node
     */
    public void setRight(AVLNode right) {
        this.right = right;
    }
}
