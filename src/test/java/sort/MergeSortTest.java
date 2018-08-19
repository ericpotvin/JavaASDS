package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {

    @Test
    void empty() {
        int arr[] = {};
        MergeSort mergeSort = MergeSort.create(arr);
        mergeSort.sort();
        int[] sorted = mergeSort.getValues();

        assertEquals(0, sorted.length);
    }

    @Test
    void simple() {
        int arr[] = {12, 6, 7};

        MergeSort mergeSort = MergeSort.create(arr);
        mergeSort.sort();
        int[] sorted = mergeSort.getValues();

        /*
         * Array should be: 6, 7, 12
         */
        assertEquals(6, sorted[0]);
        assertEquals(7, sorted[1]);
        assertEquals(12, sorted[2]);
    }

    @Test
    void moreNb() {
        int arr[] = {12, 11, 9, 42, 1, 4, 78, 79, 64, 31, 2, 13, 5, 31, 6, 7};
        MergeSort mergeSort = MergeSort.create(arr);
        mergeSort.sort();
        int[] sorted = mergeSort.getValues();

        assertEquals(1, sorted[0]);
        assertEquals(12, sorted[8]);
    }
}
