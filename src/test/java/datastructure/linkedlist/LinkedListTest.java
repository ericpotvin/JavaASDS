package datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListTest {

    @Test
    void createEmptyList() {
        LinkedList ll = LinkedList.create();
        assertEquals(0, ll.size());
    }

    @Test
    void createOneElement() {
        LinkedList ll = LinkedList.create(42);
        assertEquals(1, ll.size());
        assertEquals(42, ll.get().getValue());
    }

    @Test
    void createMultipleElement() {
        LinkedList ll = LinkedList.create(42, 41, 40, 39, 38);
        assertEquals(5, ll.size());
        assertEquals(42, ll.get().getValue());
        assertEquals(41, ll.get().getNext().getValue());
    }

    @Test
    void addEmptyList() {
        LinkedList ll = LinkedList.create();
        ll.add(42);
        assertEquals(1, ll.size());
        assertEquals(42, ll.get().getValue());
    }

    @Test
    void addExistingList() {
        LinkedList ll = LinkedList.create(42, 41);
        ll.add(40);
        assertEquals(3, ll.size());
    }

    @Test
    void existsFirst() {
        LinkedList ll = LinkedList.create(42, 41, 40, 39, 38);
        assertTrue(ll.exists(42));
    }

    @Test
    void existsLast() {
        LinkedList ll = LinkedList.create(42, 41, 40, 39, 38);
        assertTrue(ll.exists(38));
    }

    @Test
    void existsMedian() {
        LinkedList ll = LinkedList.create(42, 41, 40, 39, 38);
        assertTrue(ll.exists(40));
    }

    @Test
    void delete() {
        LinkedList ll = LinkedList.create(42, 41, 40, 39, 38);

        ll.delete(37);
        assertEquals(5, ll.size());

        ll.delete(38);
        assertEquals(4, ll.size());

        ll.delete(42);
        assertEquals(3, ll.size());

        ll.delete(40);
        assertEquals(2, ll.size());

        ll.delete(41);
        assertEquals(1, ll.size());

        ll.delete(39);
        assertEquals(0, ll.size());
    }

    @Test
    void deleteEmptyList() {
        LinkedList ll = LinkedList.create();

        ll.delete(37);
        assertEquals(0, ll.size());
    }

    @Test
    void reverse() {
        LinkedList ll = LinkedList.create(42, 41, 40, 39, 38);
        ll.reverse();

        assertEquals(38, ll.get().getValue());
        assertEquals(39, ll.get().getNext().getValue());
        assertEquals(40, ll.get().getNext().getNext().getValue());
        assertEquals(41, ll.get().getNext().getNext().getNext().getValue());
        assertEquals(42, ll.get().getNext().getNext().getNext().getNext().getValue());

    }
}
