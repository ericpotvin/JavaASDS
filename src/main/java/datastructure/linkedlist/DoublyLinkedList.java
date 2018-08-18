package datastructure.linkedlist;

/**
 * Doubly LinkedList Class
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
public class DoublyLinkedList  {

    /**
     * The head node
     */
    DoublyNode head;
    /**
     * The last node
     */
    DoublyNode last;
    /**
     * The size of the list
     */
    int size;

    /**
     * Constructor
     * @param values The values to add
     */
    DoublyLinkedList(int... values) {
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
    public static DoublyLinkedList create(int... values) {
        return new DoublyLinkedList(values);
    }

    /**
     * Get the head node
     * @return Node
     */
    public DoublyNode get() {
        return head;
    }

    /**
     * Add a value at the end of the list
     * @param value The value
     */
    public void add(int value) {
        DoublyNode node = DoublyNode.create(value);
        if (head == null) {
            head = node;
        }
        else {
            last.setNext(node);
            node.setPrevious(last);
        }
        last = node;
        size++;
    }

    /**
     * Delete a value
     * @param value The value
     */
    public void delete(int value) {
        DoublyNode current = head;
        while(current != null) {
            if (current.getValue() == value) {
                // head
                if (current.getPrevious() == null) {
                    current.setPrevious(null);
                    head = current.getNext();
                }
                else {
                    current.getPrevious().setNext(current.getNext());
                    if (current.getNext() != null) {
                        current.getNext().setPrevious(current.getPrevious());
                    }
                }
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
        DoublyNode current = head;
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
        DoublyNode tmp = null;
        DoublyNode current = head;
        while (current != null) {
            tmp = current.getPrevious();
            current.setPrevious(current.getNext());
            current.setNext(tmp);
            current = current.getPrevious();
        }
        head = tmp != null ? tmp.getPrevious() : null;
    }

    /**
     * Get the size of the list
     * @return int
     */
    public int size() {
        return size;
    }
}
