package datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeTest {

    @Test
    void add() {
        BinaryTree bt = BinaryTree.create(1,10,2,9,5);
        assertEquals(5, bt.getSize());
    }

    @Test
    void getHeight5() {
        BinaryTree bt = BinaryTree.create(1,10,2,9,5);
        assertEquals(5, bt.getHeight());
    }

    @Test
    void getHeight3() {
        BinaryTree bt = BinaryTree.create(5, 2, 1, 9, 10);
        assertEquals(3, bt.getHeight());
    }

    @Test
    void exists() {
        BinaryTree bt = BinaryTree.create(5, 2, 1, 9, 10);
        assertTrue(bt.exists(1));
        assertFalse(bt.exists(42));
    }

    @Test
    void balanced() {
        BinaryTree bt = BinaryTree.create(1,2,3,4,5);
        assertFalse(bt.balanced());

        bt = BinaryTree.create(5, 2, 1, 9, 10);
        assertTrue(bt.balanced());
    }

    @Test
    void diameter() {
        BinaryTree bt = BinaryTree.create(5, 2, 1, 9, 10);
        assertEquals(5, bt.diameter());
    }
}