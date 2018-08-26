package datastructure.tree;

/**
 * Binary Tree
 *
 *
 * <p>
 *     Perfect Tree: 2^n+1 - 1
 * </p>
 *
 * <p>
 *     <b>Time Complexity:</b>
 * </p>
 * <ul>
 *     <li>Average Space: Θ(n)</li>
 *     <li>Average Search: O(log n)</li>
 *     <li>Average Insert: O(log n)</li>
 *     <li>Average Delete: O(log n)</li>
 *     <li>Worst Space: Θ(n)</li>
 *     <li>Worst Search: O(log n)</li>
 *     <li>Worst Insert: O(log n)</li>
 *     <li>Worst Delete: O(log n)</li>
 * </ul>
 */
public class BinaryTree {
    /**
     * The root
     */
    private BinaryNode root;

    /**
     * Constructor
     *
     * @param values The values to add
     */
    private BinaryTree(int... values) {
        root = null;
        for (int value : values) {
            add(value);
        }
    }

    /**
     * Create a new BinaryTree
     *
     * @param values The values to add
     * @return BinaryTree
     */
    public static BinaryTree create(int... values) {
        return new BinaryTree(values);
    }

    /**
     * Add a node to a tree
     *
     * @param value the value
     */
    public void add(int value) {
        root = addNode(root, value);
    }

    /**
     * Add a node to the tree (Recursively)
     *
     * @param root  The current node
     * @param value The value
     * @return BinaryNode
     */
    private BinaryNode addNode(BinaryNode root, int value) {
        if (root == null) {
            return BinaryNode.create(value);
        }

        if (value < root.getValue()) {
            root.setLeft(addNode(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(addNode(root.getRight(), value));
        }
        return root;
    }

    /**
     * Check if the tree is balanced
     *
     * @return boolean
     */
    public boolean balanced() {
        return balanced(root);
    }

    /**
     * Check if the tree is balanced
     *
     * @param root The root node
     * @return boolean
     */
    private boolean balanced(BinaryNode root) {
        int left = getHeight(root.getLeft());
        int right = getHeight(root.getRight());
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return left == right;
    }

    /**
     * Get the diameter of the tree
     * @return int
     */
    public int diameter() {
        return diameter(root);
    }

    /**
     * Get the diameter of the tree
     * @param root The root node
     * @return int
     */
    private int diameter(BinaryNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.getLeft());
        int right = getHeight(root.getRight());
        int leftDiameter = diameter(root.getLeft());
        int rightDiameter = diameter(root.getRight());
        return Math.max(
                left + right + 1,
                Math.max(leftDiameter, rightDiameter)
        );
    }

    /**
     * Check if a value exists in the tree
     *
     * @param value The value
     * @return boolean
     */
    public boolean exists(int value) {
        return exists(root, value);
    }

    /**
     * Check if a value exists in the tree
     *
     * @param root  The root node
     * @param value The value
     * @return boolean
     */
    private boolean exists(BinaryNode root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.getValue()) {
            return true;
        }
        return value < root.getValue()
                ? exists(root.getLeft(), value)
                : exists(root.getRight(), value);
    }

    /**
     * Get the height of the tree
     *
     * @return int
     */
    public int getHeight() {
        return getHeight(root);
    }

    /**
     * Get the height of the tree
     *
     * @param root The root node
     * @return int
     */
    private int getHeight(BinaryNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(
                getHeight(root.getLeft()),
                getHeight(root.getRight())
        ) + 1;
    }

    /**
     * Get the root of the tree
     * @return BinaryNode
     */
    public BinaryNode getRoot() {
        return root;
    }

    /**
     * Get the size of the tree
     *
     * @return int
     */
    public int getSize() {
        return getSize(root);
    }

    /**
     * Get the size of the tree (Recursively)
     *
     * @param root The root node
     * @return int
     */
    private int getSize(BinaryNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize(root.getLeft()) + getSize(root.getRight());
    }

    /**
     * Check if the tree is BST
     * @return boolean
     */
    public boolean isBst() {
        return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Check if the tree is BST
     * @param root The root of the tree
     * @param minValue The minimal value
     * @param maxValue The maximal value
     * @return boolean
     */
    private boolean isBst(BinaryNode root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (root.getValue() < minValue || root.getValue() > maxValue) {
            return false;
        }
        return (isBst(root.getLeft(), minValue, root.getValue() - 1) &&
                isBst(root.getRight(), root.getValue() +  1, maxValue));
    }
}