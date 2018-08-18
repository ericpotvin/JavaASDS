package datastructure.stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaStackTest {

    @Test
    void createEmptyList() {
        JavaStack js = JavaStack.create();
        assertEquals(0, js.size());
    }

    @Test
    void createOneElement() {
        JavaStack js = JavaStack.create(42);
        assertEquals(1, js.size());
    }

    @Test
    void createMultipleElement() {
        JavaStack js = JavaStack.create(42, 41, 40, 39, 38);
        assertEquals(5, js.size());
    }

    @Test
    void addEmptyList() {
        JavaStack js = JavaStack.create();
        js.push(42);
        assertEquals(1, js.size());
    }

    @Test
    void addExistingList() {
        JavaStack js = JavaStack.create(42, 41);
        js.push(40);
        assertEquals(3, js.size());
    }

    @Test
    void existsFirst() {
        JavaStack js = JavaStack.create(42, 41, 40, 39, 38);
        assertEquals(5, js.exists(42));
    }

    @Test
    void existsLast() {
        JavaStack js = JavaStack.create(42, 41, 40, 39, 38);
        assertEquals(1, js.exists(38));
    }

    @Test
    void existsMedian() {
        JavaStack js = JavaStack.create(42, 41, 40, 39, 38);
        assertEquals(3, js.exists(40));
    }

    @Test
    void pop() {
        JavaStack js = JavaStack.create(42, 41, 40, 39, 38);

        assertEquals(5, js.size());

        Integer value = (Integer) js.pop();
        assertEquals(38, (int)value);

        value = (Integer) js.pop();
        assertEquals(39, (int)value);

        value = (Integer) js.pop();
        assertEquals(40, (int)value);

        value = (Integer) js.pop();
        assertEquals(41, (int)value);

        value = (Integer) js.pop();
        assertEquals(42, (int)value);

        assertTrue(js.empty());
    }

    @Test
    void popEmptyList() {
        JavaStack js = JavaStack.create();
        assertThrows(EmptyStackException.class, js::pop);
    }

    @Test
    void peek() {
        JavaStack js = JavaStack.create(42, 41);
        Integer value = (Integer) js.peek();
        assertEquals(41, (int)value);
        assertEquals(2, js.size());
    }

    @Test
    void peekEmpty() {
        JavaStack js = JavaStack.create();
        assertThrows(EmptyStackException.class, js::peek);
    }
}
