package datastructure.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Traversal class
 */
public class Traversal {

    /**
     * The Adjacency List
     */
    private AdjacencyList list;

//    Depth First Search or DFS
//
    /**
     * Constructor
     */
    Traversal(AdjacencyList adjacencyList) {
        list = adjacencyList;
        //reset();
    }

    /**
     * Create the instance
     * @param adjacencyList The adjacency list
     * @return Traversal
     */
    public static Traversal create(AdjacencyList adjacencyList) {
        return new Traversal(adjacencyList);
    }

    /**
     * Breadth First Search
     * @param start The start element
     * @return List
     */
    public List<Integer> bfs(int start) {
        List<Integer> elements = new ArrayList<>();
        boolean visited[] = new boolean[list.size()];

        LinkedList<Integer> queue = new LinkedList<>();
        visited[start]=true;
        queue.add(start);

        while (queue.size() != 0) {
            start = queue.poll();
            elements.add(start);
            for (Integer n : list.getList()[start]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return elements;
    }

    /**
     * Depth First Search
     * @param start The start element
     * @return List
     */
    public List<Integer> dfs(int start) {
        List<Integer> elements = new ArrayList<>();
        boolean visited[] = new boolean[list.size()];

        dfs(start, visited, elements);
        return elements;
    }

    /**
     * Depth First Search (Recursive)
     * @param start The start element
     * @param visited The visited array
     * @param elements The elements
     */
    private void dfs(int start, boolean visited[], List<Integer> elements) {
        visited[start] = true;
        elements.add(start);
        for (Integer n : list.getList()[start]) {
            if (!visited[n]) {
                dfs(n, visited, elements);
            }
        }
    }
}
