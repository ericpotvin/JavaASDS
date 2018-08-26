package datastructure.graph;

import java.util.LinkedList;

/**
 * Adjacency List Class
 */
public class AdjacencyList {

    /**
     * The linked list
     */
    private LinkedList<Integer>[] list;

    /**
     * Constructor
     * @param size The size of the graph
     */
    private AdjacencyList(int size) {
        list = new LinkedList[size];

        for(int i = 0; i < size ; i++){
            list[i] = new LinkedList<>();
        }
    }

    /**
     * Create a graph
     * @param size The size of the graph
     * @return UndirectedGraph
     */
    public static AdjacencyList create(int size) {
        return new AdjacencyList(size);
    }

    /**
     * Add an edge
     * @param startEdge The source edge
     * @param endEdge The end edge
     */
    public void add(int startEdge, int endEdge) {
        try {
            list[startEdge].addFirst(endEdge);
            list[endEdge].addFirst(startEdge);
        }
        catch (ArrayIndexOutOfBoundsException e) { /* TODO */ }
    }

    /**
     * Get the graph
     * @return LinkedList
     */
    public LinkedList<Integer>[] getList() {
        return list;
    }

    /**
     * Count the number of edges
     * @return int
     */
    public int countEdges() {
        int count = 0;
        for (LinkedList<Integer> aList : list) {
            count += aList.size() > 0 ? 1 : 0;
        }
        return count;
    }

    /**
     * Count the number of vertices
     * @return int
     */
    public int countVertices() {
        int count = 0;
        for (LinkedList<Integer> aList : list) {
            count += aList.size();
        }
        return count;
    }

    /**
     * Check if 2 elements are connected
     * @param source The source
     * @param destination The destination
     * @return boolean
     */
    public boolean connected(int source, int destination) {
        for (int i = 0; i < list.length; i++) {
            if (source == i) {
                if (list[i].contains(destination)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Check if the graph is empty
     * @return boolean
     */
    public boolean empty() {
        if (list.length == 0) {
            return true;
        }
        for (LinkedList<Integer> aList : list) {
            if (aList.size() != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Get the size of the list
     * @return int
     */
    public int size() {
        return list.length;
    }
}
