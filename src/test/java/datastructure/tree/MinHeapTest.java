package datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinHeapTest {

    @Test
    void createSimple() {
        MinHeap minHeap = MinHeap.create(5,1,10);
        assertEquals(3, minHeap.size());
    }

    @Test
    void createMore() {
        MinHeap minHeap = MinHeap.create(5,1,10,6,12,87,542,6,73,37,7,81,48,84,13);
        assertEquals(15, minHeap.size());
    }

    @Test
    void addOne() {
        MinHeap minHeap = MinHeap.create(5,1);
        minHeap.add(10);
        minHeap.build();
        assertEquals(3, minHeap.size());
    }

    @Test
    void addAll() {
        MinHeap minHeap = MinHeap.create();
        minHeap.add(15);
        minHeap.add(44);
        minHeap.add(5);
        minHeap.add(9);
        minHeap.add(4);
        minHeap.add(6);
        minHeap.add(87);
        minHeap.add(31);
        minHeap.add(52);
        minHeap.remove();
        minHeap.add(73);
        minHeap.add(96);
        minHeap.build();
        assertEquals(10, minHeap.size());
    }

    @Test
    void remove() {
        MinHeap minHeap = MinHeap.create(5,1,10,20);
        int value = minHeap.remove();
        assertEquals(3, minHeap.size());
        assertEquals(1, value);
    }
}
