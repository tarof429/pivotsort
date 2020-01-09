package pivotsort;

import org.junit.Assert;
import org.junit.Test;

public class PivotSortTest {
    @Test
    public void testSort() {
        final PivotSort ob = new PivotSort();

        final int arr[] = { 64, 25, 12, 22, 11 };
        ob.sort(arr);
        
        System.out.print("Sorted array: ");
        ob.printArray(arr);

        // Check that each element is in the correct order
        for (int i = 0; i < arr.length - 1; i++) {
            Assert.assertTrue(arr[i] < arr[i + 1]);
        }

    }
}
