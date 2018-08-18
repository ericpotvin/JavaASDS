package datastructure.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TraversalTest {

    /**
     * The Tree:
     *
     *         5
     *       /   \
     *     3      7
     *   /   \
     *  1     4
     *
     */
    private BinaryTree bt = BinaryTree.create(5, 3, 7, 1, 4);

    /**
     * Output should be:
     */
    @Test
    void inOrder() {

        Traversal traversal = Traversal.create(bt);
        traversal.inOrder();
        List<Object> list = traversal.getValues();

        // should equal to: 1, 3, 4, 5, 7
        assertEquals(1, (int) list.get(0));
        assertEquals(3, (int) list.get(1));
        assertEquals(4, (int) list.get(2));
        assertEquals(5, (int) list.get(3));
        assertEquals(7, (int) list.get(4));
    }

    @Test
    void preOrder() {
        Traversal traversal = Traversal.create(bt);
        traversal.preOrder();
        List<Object> list = traversal.getValues();

        // should equal to: 5, 3, 1, 4, 7
        assertEquals(5, (int) list.get(0));
        assertEquals(3, (int) list.get(1));
        assertEquals(1, (int) list.get(2));
        assertEquals(4, (int) list.get(3));
        assertEquals(7, (int) list.get(4));
    }

    @Test
    void postOrder() {
        Traversal traversal = Traversal.create(bt);
        traversal.postOrder();
        List<Object> list = traversal.getValues();

        // should equal to: 1, 4, 3, 7, 5
        assertEquals(1, (int) list.get(0));
        assertEquals(4, (int) list.get(1));
        assertEquals(3, (int) list.get(2));
        assertEquals(7, (int) list.get(3));
        assertEquals(5, (int) list.get(4));
    }
}
