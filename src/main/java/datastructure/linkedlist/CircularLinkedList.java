package datastructure.linkedlist;

/**
 * Circular Linked List Class
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
public class CircularLinkedList extends LinkedList {

    /**
     * Constructor
     * @param values The values to add
     */
    private CircularLinkedList(int... values) {
        super(values);
        if (head != null) {
            last.setNext(head);
        }
    }

    /**
     * Create a new LinkedList
     * @param values The values to add
     * @return LinkedList
     */
    public static CircularLinkedList create(int... values) {
        return new CircularLinkedList(values);
    }

    /**
     * Add a value at the end of the list
     * @param value The value
     */
    @Override
    public void add(int value) {
        super.add(value);
        last.setNext(head);
    }

    /**
     * Delete a value
     * @param value The value
     */
    @Override
    public void delete(int value) {
        SimpleNode current = head;
        do {
            // head
            if (current.getValue() == value) {
                last.setNext(current.getNext());
                head = current.getNext();
                size--;
                break;
            }
            else if (current.getNext() != null && current.getNext().getValue() == value) {
                last.setNext(head);
                current.setNext(current.getNext().getNext());
                size--;
                break;
            }
            current = current.getNext();
        }
        while(current != null && !current.equals(head));
    }

    /**
     * Check if a value exists in the list
     * @param value The value
     * @return boolean
     */
    @Override
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
        while(!current.equals(head));
        return exists;
    }

    /**
     * Reverse a Linked List
     */
    @Override
    public void reverse() {
        SimpleNode prev = null;
        SimpleNode current = head;
        SimpleNode next;
        while(!current.getNext().equals(head)) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        current.setNext(prev);
        head = current;
    }

    /**
     * Get the size of the list
     * @return int
     */
    @Override
    public int size() {
        return size;
    }
}
