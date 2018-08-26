package datastructure.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class QueueStackTest {

    @Test
    void pop() {

        QueueStack queueStack = QueueStack.create();
        queueStack.push(1);
        queueStack.push(2);
        queueStack.push(3);

        assertEquals(1, (int)queueStack.pop());
        assertEquals(2, (int)queueStack.pop());
        assertEquals(3, (int)queueStack.pop());
        assertNull(queueStack.pop());
    }
}
