package pivotsort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PivotSortTest {

    @BeforeAll
    static void setup() {
        System.out.println("@eforeAll called");
    }

    @Test
    public void testSort() {
        final PivotSort ob = new PivotSort();

        final int arr[] = { 64, 25, 12, 22, 11 };
        ob.sort(arr);
        
        System.out.print("Sorted array: ");
        ob.printArray(arr);

        // Check that each element is in the correct order
        for (int i = 0; i < arr.length - 1; i++) {
            Assertions.assertTrue(arr[i] < arr[i + 1]);
        }

    }
}
