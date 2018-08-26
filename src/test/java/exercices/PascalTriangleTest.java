package exercices;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalTriangleTest {

    /**
     * This will show:
     * <pre>
     *        1
     *       1 1
     *      1 2 1
     *     1 3 3 1
     *    1 4 6 4 1
     *   1 5 10 10 5 1
     *  1 6 15 20 15 6 1
     * </pre>
     */
    @Test
    void print() {
        PascalTriangle.print(7);
    }

    @Test
    void get() {
        Map<Integer, LinkedList<Integer>> list = PascalTriangle.get(7);

        assertEquals(7, list.size());

        // Number of elements per lines
        assertEquals(1, list.get(0).size());
        assertEquals(2, list.get(1).size());
        assertEquals(3, list.get(2).size());
        assertEquals(4, list.get(3).size());
        assertEquals(5, list.get(4).size());
        assertEquals(6, list.get(5).size());
        assertEquals(7, list.get(6).size());

        // Data
        LinkedList<Integer> lastLine = list.get(6);
        assertEquals(1, lastLine.get(0).intValue());
        assertEquals(6, lastLine.get(1).intValue());
        assertEquals(15, lastLine.get(2).intValue());
        assertEquals(20, lastLine.get(3).intValue());
        assertEquals(15, lastLine.get(4).intValue());
        assertEquals(6, lastLine.get(5).intValue());
        assertEquals(1, lastLine.get(6).intValue());
    }
}
