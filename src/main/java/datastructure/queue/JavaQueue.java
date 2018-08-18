package datastructure.queue;


import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

/**
 * Queue Class
 *
 * <p>
 *     <b>Time Complexity:</b>
 * </p>
 * <ul>
 *     <li>Average Access: Θ(n)</li>
 *     <li>Average Search: Θ(n)</li>
 *     <li>Average Insert: Θ(1)</li>
 *     <li>Average Delete: Θ(1)</li>
 *     <li>Worst Access: Θ(n)</li>
 *     <li>Worst Search: Θ(n)</li>
 *     <li>Worst Insert: Θ(1)</li>
 *     <li>Worst Delete: Θ(1)</li>
 * </ul>
 */
public class JavaQueue {

    /**
     * The queue
     */
    private Queue<Object> queue;
    /**
     * The size of the list
     */
    private int size;

    /**
     * Constructor
     * @param values The values to add
     */
    JavaQueue(Object... values) {
        queue = new LinkedList<>();
        size = 0;
        for (Object value:values) {
            push(value);
        }
    }

    /**
     * Create a new LinkedList
     * @param values The values to add
     * @return LinkedList
     */
    public static JavaQueue create(Object... values) {
        return new JavaQueue(values);
    }

    /**
     * Returns true if the stack is empty
     * @return boolean
     */
    public boolean empty() {
        return queue.peek() == null;
    }

    /**
     * Check if a node exists in the stack and return the position.
     * <p>
     *     If the node does not exists, -1 is returned
     * </p>
     * @param node The stack node
     * @return int
     */
    public Object exists(Object node) {
        return queue.peek();
    }

    /**
     * Removes and returns the top element of the stack.
     * @return StackNode
     * @throws NoSuchElementException Throws an NoSuchElementException if the queue is empty
     */
    public Object pop() throws NoSuchElementException {
        if (size > 0) {
            size--;
            return queue.remove();
        }
        throw new NoSuchElementException();
    }

    /**
     * Returns the top element of the stack.
     * <p>
     *     <b>NOTE:</b> This will NOT remove the element from the stack
     * </p>
     * @return StackNode
     */
    public Object peek() {
        return queue.peek();
    }

    /**
     * Push an element to the stack
     * @param node The value
     */
    public void push(Object node) {
        queue.add(node);
        size++;
    }

    /**
     * Get the number of element in the stack
     * @return int
     */
    public int size() {
        return size;
    }
}
