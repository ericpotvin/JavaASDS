package datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DoublyLinkedListTest {

    @Test
    void createEmptyList() {
        DoublyLinkedList dl = DoublyLinkedList.create();
        assertEquals(0, dl.size());
    }

    @Test
    void createOneElement() {
        DoublyLinkedList dl = DoublyLinkedList.create(42);
        assertEquals(1, dl.size());
        assertEquals(42, dl.get().getValue());
    }

    @Test
    void createMultipleElement() {
        DoublyLinkedList dl = DoublyLinkedList.create(42, 41, 40, 39, 38);
        assertEquals(5, dl.size());
        assertEquals(42, dl.get().getValue());
        assertEquals(41, dl.get().getNext().getValue());
        assertEquals(41, dl.get().getNext().getNext().getPrevious().getValue());
    }

    @Test
    void addEmptyList() {
        DoublyLinkedList dl = DoublyLinkedList.create();
        dl.add(42);
        assertEquals(1, dl.size());
        assertEquals(42, dl.get().getValue());
    }

    @Test
    void addExistingList() {
        DoublyLinkedList dl = DoublyLinkedList.create(42, 41);
        dl.add(40);
        assertEquals(3, dl.size());
    }

    @Test
    void existsFirst() {
        DoublyLinkedList dl = DoublyLinkedList.create(42, 41, 40, 39, 38);
        assertTrue(dl.exists(42));
    }

    @Test
    void existsLast() {
        DoublyLinkedList dl = DoublyLinkedList.create(42, 41, 40, 39, 38);
        assertTrue(dl.exists(38));
    }

    @Test
    void existsMedian() {
        DoublyLinkedList dl = DoublyLinkedList.create(42, 41, 40, 39, 38);
        assertTrue(dl.exists(40));
    }

    @Test
    void delete() {
        DoublyLinkedList dl = DoublyLinkedList.create(42, 41, 40, 39, 38);

        dl.delete(37);
        assertEquals(5, dl.size());

        dl.delete(38);
        assertEquals(4, dl.size());

        dl.delete(42);
        assertEquals(3, dl.size());

        dl.delete(40);
        assertEquals(2, dl.size());

        dl.delete(41);
        assertEquals(1, dl.size());

        dl.delete(39);
        assertEquals(0, dl.size());
    }

    @Test
    void reverse() {
        DoublyLinkedList dl = DoublyLinkedList.create(42, 41, 40, 39, 38);
        dl.reverse();

        assertEquals(38, dl.get().getValue());
        assertEquals(39, dl.get().getNext().getValue());
        assertEquals(40, dl.get().getNext().getNext().getValue());
        assertEquals(41, dl.get().getNext().getNext().getNext().getValue());
        assertEquals(42, dl.get().getNext().getNext().getNext().getNext().getValue());
    }
}
