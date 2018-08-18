package datastructure.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Stack Class
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
public class JavaStack {

    /**
     * The stack
     */
    private Stack<Object> stack;

    /**
     * The size of the list
     */
    private int size;

    /**
     * Constructor
     * @param values The values to add
     */
    JavaStack(Object... values) {
        stack = new Stack<>();
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
    public static JavaStack create(Object... values) {
        return new JavaStack(values);
    }

    /**
     * Returns true if the stack is empty
     * @return boolean
     */
    public boolean empty() {
        return stack.empty();
    }

    /**
     * Check if a node exists in the stack and return the position.
     * <p>
     *     If the node does not exists, -1 is returned
     * </p>
     * @param node The stack node
     * @return int
     */
    public int exists(Object node) {
        return stack.search(node);
    }

    /**
     * Removes and returns the top element of the stack.
     * @return StackNode
     * @throws EmptyStackException Throws an EmptyStackException if the stack is empty
     */
    public Object pop() throws EmptyStackException {
        if (size > 0) {
            size--;
            return stack.pop();
        }
        throw new EmptyStackException();
    }

    /**
     * Returns the top element of the stack.
     * <p>
     *     <b>NOTE:</b> This will NOT remove the element from the stack
     * </p>
     * @return StackNode
     * @throws EmptyStackException Throws an EmptyStackException if the stack is empty
     */
    public Object peek() throws EmptyStackException {
        if (size > 0) {
            return stack.peek();
        }
        throw new EmptyStackException();
    }

    /**
     * Push an element to the stack
     * @param node The value
     */
    public void push(Object node) {
        stack.push(node);
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
