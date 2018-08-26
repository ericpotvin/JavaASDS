package datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AVLTreeTest {

    @Test
    void add3() {
        AVLTree bt = AVLTree.create(1,2,3);
        assertEquals(3, bt.getSize());
    }

    @Test
    void add5() {
        AVLTree bt = AVLTree.create(1,10,2,9,5);
        assertEquals(5, bt.getSize());
    }

    @Test
    void add7() {
        AVLTree bt = AVLTree.create(1,3,10,2,11,9,5);
        assertEquals(7, bt.getSize());
    }

    @Test
    void add9() {
        AVLTree bt = AVLTree.create(1,21,0,10,2,11,4,9,5);
        assertEquals(9, bt.getSize());
    }
}
