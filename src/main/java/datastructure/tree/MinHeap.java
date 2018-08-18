package datastructure.tree;

import java.util.Arrays;

/**
 * Min Heap Tree
 *
 * <p>
 *     <b>Time Complexity:</b>
 * </p>
 * <ul>
 *     <li>Average Space: Θ(n)</li>
 *     <li>Average Search: O(n)</li>
 *     <li>Average Insert: O(1)</li>
 *     <li>Average Delete: O(log n)</li>
 *     <li>Worst Space: Θ(n)</li>
 *     <li>Worst Search: O(n)</li>
 *     <li>Worst Insert: O(log n)</li>
 *     <li>Worst Delete: O(log n)</li>
 * </ul>
 */
public class MinHeap {

    /**
     * The heap array
     */
    private int[] heap;
    /**
     * The size of the heap
     */
    private int size;
    /**
     * The max size of the heap
     */
    private int maxSize;

    /**
     * Constructor
     *
     * @param values The values to add
     */
    MinHeap(int... values) {
        size = 0;
        maxSize = values.length + 1;
        heap = new int[maxSize];
        for (int value : values) {
            add(value);
        }
        if (size > 0 ) {
            build();
        }
    }

    /**
     * Create a new LinkedList
     *
     * @param values The values to add
     * @return LinkedList
     */
    public static MinHeap create(int... values) {
        return new MinHeap(values);
    }

    /**
     * Add a value to the heap
     * @param value The value
     */
    public void add(int value)
    {
        size++;
        // did we stack overflow?
        if (size == maxSize) {
            maxSize = maxSize * 2;
            heap = Arrays.copyOf(heap, maxSize);
        }
        heap[size] = value;
        int current = size;

        while (heap[current] < heap[getParent(current)]) {
            swapValues(current, getParent(current));
            current = getParent(current);
        }
    }

    /**
     * Build the heap
     */
    public void build() {
        for (int pos = (size / 2); pos >= 1 ; pos--) {
            heapify(pos);
        }
    }

    /**
     * Remove an element
     * @return int
     */
    public int remove() {
        int popped = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return popped;
    }

    /**
     * Get the size of the heap
     * @return int
     */
    public int size() {
        return size;
    }

    //
    // Privates

    /**
     * Get the parent value
     * @param index The index
     * @return int
     */
    private int getParent(int index) {
        return index / 2;
    }

    /**
     * Get the left child index
     * @param index The lookup index
     * @return int
     */
    private int getLeftIndex(int index) {
        return index * 2;
    }

    /**
     * Get the right child index
     * @param index The lookup index
     * @return int
     */
    private int getRightIndex(int index) {
        return (index * 2) + 1;
    }

    /**
     * Check if the element exists
     * @param index The index
     * @return boolean
     */
    private boolean exists(int index) {
        return (index >= (size / 2) && index <= size);
    }

    /**
     * Heapify the heap
     * @param index The index
     */
    private void heapify(int index) {
        if (exists(index)){
            return;
        }

        if (heap[index] > heap[getLeftIndex(index)] || heap[index] > heap[getRightIndex(index)]) {
            int indexPos = heap[getLeftIndex(index)] < heap[getRightIndex(index)]
                    ? getLeftIndex(index)
                    : getRightIndex(index);
            swapValues(index, indexPos);
            heapify(indexPos);
        }
    }

    /**
     * Swap elements
     * @param first The first element
     * @param second The second element
     */
    private void swapValues(int first, int second) {
        heap[first] = heap[first] + heap[second];
        heap[second] = heap[first] - heap[second];
        heap[first] = heap[first] - heap[second];
    }
}