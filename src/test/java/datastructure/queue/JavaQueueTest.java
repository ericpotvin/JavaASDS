package datastructure.queue;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class JavaQueueTest {

    @Test
    void createEmptyList() {
        JavaQueue q = JavaQueue.create();
        assertEquals(0, q.size());
    }

    @Test
    void createOneElement() {
        JavaQueue q = JavaQueue.create(42);
        assertEquals(1, q.size());
    }

    @Test
    void createMultipleElement() {
        JavaQueue q = JavaQueue.create(42, 41, 40, 39, 38);
        assertEquals(5, q.size());
    }

    @Test
    void addEmptyList() {
        JavaQueue q = JavaQueue.create();
        q.push(42);
        assertEquals(1, q.size());
    }

    @Test
    void addExistingList() {
        JavaQueue q = JavaQueue.create(42, 41);
        q.push(40);
        assertEquals(3, q.size());
    }

    @Test
    void existsFirst() {
        JavaQueue q = JavaQueue.create(42, 41, 40, 39, 38);
        assertNotNull(q.exists(42));
    }

    @Test
    void existsLast() {
        JavaQueue q = JavaQueue.create(42, 41, 40, 39, 38);
        assertNotNull(q.exists(38));
    }

    @Test
    void existsMedian() {
        JavaQueue q = JavaQueue.create(42, 41, 40, 39, 38);
        assertNotNull(q.exists(40));
    }

    @Test
    void pop() {
        JavaQueue q = JavaQueue.create(42, 41, 40, 39, 38);

        assertEquals(5, q.size());

        Integer value = (Integer) q.pop();
        assertEquals(42, (int)value);

        value = (Integer) q.pop();
        assertEquals(41, (int)value);

        value = (Integer) q.pop();
        assertEquals(40, (int)value);

        value = (Integer) q.pop();
        assertEquals(39, (int)value);

        value = (Integer) q.pop();
        assertEquals(38, (int)value);

        assertTrue(q.empty());
    }

    @Test
    void popEmptyList() {
        JavaQueue q = JavaQueue.create();
        assertThrows(NoSuchElementException.class, q::pop);
    }

    @Test
    void peek() {
        JavaQueue q = JavaQueue.create(42, 41);
        Integer value = (Integer) q.peek();
        assertEquals(42, (int)value);
        assertEquals(2, q.size());
    }

    @Test
    void peekEmpty() {
        JavaQueue q = JavaQueue.create();
        assertNull(q.peek());
    }
}
