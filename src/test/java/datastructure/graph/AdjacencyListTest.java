package datastructure.graph;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdjacencyListTest {

    @Test
    void emptyGraph() {
        AdjacencyList graph = AdjacencyList.create(5);
        LinkedList<Integer>[] list = graph.getList();

        assertEquals(5, list.length);

        for (LinkedList<Integer> aList : list) {
            assertEquals(0, aList.size());
        }
    }

    @Test
    void addEdge() {
        AdjacencyList graph = AdjacencyList.create(5);
        graph.add(0, 1);

        LinkedList<Integer>[] list = graph.getList();
        assertEquals(1, list[0].size());
        assertEquals(1, list[1].size());
        assertEquals(0, list[2].size());

        graph.add(2, 1);

        assertEquals(1, list[0].size());
        assertEquals(2, list[1].size());
        assertEquals(1, list[2].size());
    }

    @Test
    void invalid() {
        AdjacencyList graph = AdjacencyList.create(1);
        graph.add(1, 10);
    }

    @Test
    void countEdges() {
        AdjacencyList graph = AdjacencyList.create(5);
        graph.add(0, 1);

        assertEquals(2, graph.countEdges());
        graph.add(0, 2);

        assertEquals(3, graph.countEdges());
    }

    @Test
    void countVertices() {
        AdjacencyList graph = AdjacencyList.create(5);
        graph.add(0, 1);

        assertEquals(2, graph.countVertices());

        graph.add(0, 2);
        assertEquals(4, graph.countVertices());
    }

    /**
     * Graph:
     *
     *      0 --- 1
     *     /       \
     *    3 -- 5 -- 4
     */
    @Test
    void connected() {
        AdjacencyList graph = AdjacencyList.create(5);
        graph.add(0, 1);
        graph.add(1, 4);
        graph.add(4, 5);
        graph.add(0, 3);
        graph.add(3, 5);

        assertTrue(graph.connected(3, 5));
        assertTrue(graph.connected(4, 5));
        assertTrue(graph.connected(4, 1));

        assertFalse(graph.connected(0, 5));
    }

    @Test
    void empty() {
        AdjacencyList graph = AdjacencyList.create(0);
        assertTrue(graph.empty());

        graph = AdjacencyList.create(5);
        assertTrue(graph.empty());
    }

    @Test
    void notEmpty() {
        AdjacencyList graph = AdjacencyList.create(5);
        graph.add(0, 1);
        assertFalse(graph.empty());
    }
}
