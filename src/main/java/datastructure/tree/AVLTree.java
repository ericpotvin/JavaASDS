package datastructure.tree;

/**
 * AVLTree - Adelson-Velsky and Landis

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
public class AVLTree {
    /**
     * The root node
     */
    private AVLNode root;

    /**
     * Constructor
     *
     * @param values The values to add
     */
    private AVLTree(int... values) {
        root = null;
        for (int value : values) {
            add(value);
        }
    }

    /**
     * Create a new LinkedList
     *
     * @param values The values to add
     * @return AVLTree
     */
    public static AVLTree create(int... values) {
        return new AVLTree(values);
    }



    public void add(int value) {
        root = add(root, value);
    }

    private AVLNode add(AVLNode node, int value) {
        if (node == null) {
            return AVLNode.create(value);
        }

        // Same as BST
        if (value > node.getValue()) {
            node.setLeft(add(node.getLeft(), value));
        }
        else {
            node.setRight(add(node.getRight(), value));
        }

        node.setHeight(
                Math.max(height(node.getLeft()), height(node.getRight()) + 1)
        );

        // Do we need to rotate the tree?
        int heightDiff = heightDiff(node);

        if (heightDiff < -1) {
            if (heightDiff(node.getRight()) > 0) {
                node.setRight(rightRotate(node.getRight()));
                return leftRotate(node);
            }
            else {
                return leftRotate(node);
            }
        }
        else if (heightDiff > 1) {
            if (heightDiff(node.getLeft()) < 0) {
                node.setLeft(leftRotate(node.getLeft()));
                return rightRotate(node);
            }
            else {
                return rightRotate(node);
            }
        }

        return node;
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
    private int getSize(AVLNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize(root.getLeft()) + getSize(root.getRight());
    }

    //
    // Privates

    private int height(AVLNode node) {
        return node == null ? 0 : node.getHeight();
    }

    private int heightDiff(AVLNode node) {
        return node == null ? 0 : height(node.getLeft()) - height(node.getRight());
    }

    private AVLNode leftRotate(AVLNode node) {
        AVLNode right = node.getRight();
        node.setRight(right.getLeft());
        right.setLeft(node);
        node.setHeight(
                Math.max(height(node.getLeft()), height(node.getRight())) + 1
        );
        right.setHeight(
                Math.max(height(right.getLeft()), height(right.getRight())) + 1
        );
        return right;
    }

    private AVLNode rightRotate(AVLNode node) {
        AVLNode left = node.getLeft();
        node.setLeft(left.getRight());
        left.setRight(node);
        node.setHeight(
                Math.max(height(node.getLeft()), height(node.getRight())) + 1
        );
        left.setHeight(
                Math.max(height(left.getLeft()), height(left.getRight())) + 1
        );
        return left;
    }
}