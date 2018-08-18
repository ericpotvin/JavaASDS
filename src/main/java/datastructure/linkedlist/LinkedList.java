package datastructure.linkedlist;

/**
 * LinkedList Class
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
public class LinkedList {

    /**
     * The head node
     */
    SimpleNode head;
    /**
     * The last node
     */
    SimpleNode last;
    /**
     * The size of the list
     */
    int size;

    /**
     * Constructor
     * @param values The values to add
     */
    LinkedList(int... values) {
        head = null;
        size = 0;
        for (int value:values) {
            add(value);
        }
    }

    /**
     * Create a new LinkedList
     * @param values The values to add
     * @return LinkedList
     */
    public static LinkedList create(int... values) {
        return new LinkedList(values);
    }

    /**
     * Get the head node
     * @return Node
     */
    public SimpleNode get() {
        return head;
    }

    /**
     * Add a value at the end of the list
     * @param value The value
     */
    public void add(int value) {
        SimpleNode node = SimpleNode.create(value);
        if (head == null) {
            head = node;
        }
        else {
            last.setNext(node);
        }
        last = node;
        size++;
    }

    /**
     * Delete a value
     * @param value The value
     */
    public void delete(int value) {
        SimpleNode current = head;
        while(current != null) {
            // head
            if (current.getValue() == value) {
                head = current.getNext();
                size--;
                break;
            }
            else if (current.getNext() != null && current.getNext().getValue() == value) {
                current.setNext(current.getNext().getNext());
                size--;
                break;
            }
            current = current.getNext();
        }
    }

    /**
     * Check if a value exists in the list
     * @param value The value
     * @return boolean
     */
    public boolean exists(int value) {
        boolean exists = false;
        SimpleNode current = head;
        do {
            if (current.getValue() == value) {
                exists = true;
                break;
            }
            current = current.getNext();
        }
        while(current != null);
        return exists;
    }

    /**
     * Reverse a Linked List
     */
    public void reverse() {
        SimpleNode prev = null;
        SimpleNode current = head;
        SimpleNode next;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    /**
     * Get the size of the list
     * @return int
     */
    public int size() {
        return size;
    }
}
