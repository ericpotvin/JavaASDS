package exercices;

import lib.BinomialCoefficient;
import lib.StringUtils;

import java.util.*;

/**
 * Pascal Triangle
 *
 * <p>
 *     Time Complexity: O(n^3)
 * </p>
 */
public class PascalTriangle {

    /**
     * Get the Pascal Triangle
     * @param size The size of the triangle
     * @return Map
     */
    public static Map<Integer, LinkedList<Integer>> get(int size) {
        Map<Integer, LinkedList<Integer>> list = new HashMap<>();

        for (int line = 0; line < size; line++) {
            list.put(line, new LinkedList<>());
            for (int i = 0; i <= line; i++) {
                list.get(line).add(
                        BinomialCoefficient.compute(line, i)
                );
            }
        }
        return list;
    }

    /**
     * Print the triangle
     * @param size The size of the triangle
     */
    public static void print(int size) {
        String repeat;

        for (int line = 0; line < size; line++) {
            for (int i = 0; i <= line; i++) {
                repeat = i == 0 ? StringUtils.repeat(" ", size - line) : "";
                System.out.print(
                        repeat + BinomialCoefficient.compute(line, i) +" "
                );
            }
            System.out.println();
        }
    }
}
