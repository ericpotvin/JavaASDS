package datastructure.queue;

import java.util.Stack;

/**
 * Queue Stack
 *
 * <p>
 *     Queue using two stacks
 * </p>
 */
public class QueueStack {

    /**
     * The first stack
     */
    private Stack<Integer> stackOne;
    /**
     * The second stack
     */
    private Stack<Integer> stackTwo;

    /**
     * Constructor
     */
    private QueueStack() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }

    /**
     * Create a new stack
     * @return QueueStack
     */
    public static QueueStack create() {
        return new QueueStack();
    }

    /**
     * Push an element to the queue
     * @param number The number
     */
    public void push(Integer number) {
        stackOne.push(number);
    }

    /**
     * Pop the next element
     * @return Integer
     */
    public Integer pop() {
        if (stackTwo.isEmpty()) {
            if (stackOne.isEmpty()) {
                return null;
            }
            while (stackOne.size() > 0) {
                stackTwo.push(stackOne.pop());
            }
        }

        return stackTwo.pop();
    }
}
