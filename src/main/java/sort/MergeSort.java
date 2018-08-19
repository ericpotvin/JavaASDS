package sort;

/**
 * Merge Sort
 *
 * <p>
 *     <b>Time Complexity:</b>
 * </p>
 * <ul>
 *     <li>Best: Ω(n log(n))</li>
 *     <li>Average: Θ(n log(n))</li>
 *     <li>Worst: O(n log(n))</li>
 * </ul>
 */
public class MergeSort {

    /**
     * The list of integers
     */
    private int[] values;


    /**
     * Constructor
     * @param values The array
     */
    private MergeSort(int[] values) {
        this.values = values;
    }

    /**
     * Create a new LinkedList
     * @param values The values to add
     * @return LinkedList
     */
    public static MergeSort create(int[] values) {
        return new MergeSort(values);
    }

    /**
     * Get the array
     * @return int[]
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Sort the list
     */
    public void sort() {
        sort(0, values.length - 1);
    }

    /**
     * Sort the list
     * @param lowerBound The lower bound
     * @param upperBound The upper bound
     */
    private void sort(int lowerBound, int upperBound)
    {
        if (lowerBound < upperBound) {
            int median = (lowerBound + upperBound) / 2;

            sort(lowerBound, median);
            sort(median + 1, upperBound);

            merge(lowerBound, median, upperBound);
        }
    }

    /**
     * Merge
     * @param lowerBound The lower bound
     * @param median The median
     * @param upperBound The upper bound
     */
    private void merge(int lowerBound, int median, int upperBound) {
        int maxLowerBound = median - lowerBound + 1;
        int maxUpperBound = upperBound - median;

        int lowerArray[] = new int [maxLowerBound];
        int upperArray[] = new int [maxUpperBound];

        System.arraycopy(values, lowerBound, lowerArray, 0, maxLowerBound);

        for (int j=0; j < maxUpperBound; ++j) {
            upperArray[j] = values[median + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = lowerBound;

        while (i < maxLowerBound && j < maxUpperBound) {
            if (lowerArray[i] <= upperArray[j]) {
                values[k] = lowerArray[i];
                i++;
            }
            else {
                values[k] = upperArray[j];
                j++;
            }
            k++;
        }

        while (i < maxLowerBound) {
            values[k] = lowerArray[i];
            i++;
            k++;
        }
        while (j < maxUpperBound) {
            values[k] = upperArray[j];
            j++;
            k++;
        }
    }
}
