package datastructure.graph;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TraversalTest {

    private static AdjacencyList list;

    @BeforeAll
    static void setUp() {
        list = AdjacencyList.create(5);
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 0);

    }

    @Test
    void bfs() {
        Traversal traversal = Traversal.create(list);
        List<Integer> q = traversal.bfs(4);

        assertEquals(5, q.size());

        assertEquals(4, (int)q.get(0));
        assertEquals(0, (int)q.get(1));
        assertEquals(3, (int)q.get(2));
        assertEquals(1, (int)q.get(3));
        assertEquals(2, (int)q.get(4));
    }

    @Test
    void dfs() {
        Traversal traversal = Traversal.create(list);
        List<Integer> q = traversal.dfs(4);

        assertEquals(5, q.size());

        assertEquals(4, (int)q.get(0));
        assertEquals(0, (int)q.get(1));
        assertEquals(1, (int)q.get(2));
        assertEquals(2, (int)q.get(3));
        assertEquals(3, (int)q.get(4));

    }
}
