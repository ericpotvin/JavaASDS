package datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Traversal class
 */
public class Traversal {

    /**
     * The list
     */
    private List<Object> values;
    /**
     * The binary tree
     */
    private BinaryNode root;

    /**
     * Constructor
     */
    Traversal(BinaryNode root) {
        reset();
        this.root = root;
    }

    /**
     * Reset the list
     */
    private void reset() {
        this.values = new ArrayList<>();
    }

    /**
     * Get the values
     * @return List
     */
    public List<Object> getValues() {
        return values;
    }

    /**
     * Create the instance
     * @param binaryTree The binary tree
     * @return Traversal
     */
    public static Traversal create(BinaryTree binaryTree) {
        return new Traversal(binaryTree.getRoot());
    }

    /**
     * Breadth first traversal or Level order traversal using Queue
     */
    public void bfs() {
        reset();
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode current = queue.poll();
            values.add(current.getValue());
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
    }

    /**
     * Perform the InOrder traversal: (Left, Root, Right)
     */
    public void inOrder() {
        reset();
        inOrder(root);
    }

    /**
     * Perform the InOrder traversal
     * @param node The node
     */
    private void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        values.add(node.getValue());
        inOrder(node.getRight());
    }

    /**
     * Perform the PreOrder traversal: (Root, Left, Right)
     */
    public void preOrder() {
        reset();
        preOrder(root);
    }

    /**
     * Perform the PreOrder traversal
     * @param node The node
     */
    private void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        values.add(node.getValue());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    /**
     * Perform the PostOrder traversal: (Left, Right, Root)
     */
    public void postOrder() {
        reset();
        postOrder(root);
    }

    /**
     * Perform the PostOrder traversal
     * @param node The node
     */
    private void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        values.add(node.getValue());
    }
}
