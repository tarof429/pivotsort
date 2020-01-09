package pivotsort;

// Pivot Sort (c) Taro Fukunaga

// A sorting algorithm to sort in place, similar to a bubble sort since we are
// repeatedly swapping adjacent elements if they are in the wrong order.
// A key difference is in how we choose which elements to swap. If a > b,
// then a is swapped with b so that a < b, but then we don't check whether
// c < b; instead, we check whether c < d.
public class PivotSort {
    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void sort(int [] arr) {
        int swapCount = 0;

        System.out.print("Starting sort for ");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Outer loop: " + i);

            // The number of swaps "n" is 1 less than the size of the array
            // because we will swap each element with an element adjacent to it
            int n = arr.length - 1;

            boolean [] sorted = { true, true };

            System.out.println("  In first inner loop.");

            // Sort elements with an even index first
            for (int j = 0; j < n; j += 2) {
                System.out.println("    Comparing " + arr[j] + " with " + arr[j + 1] + ".");
                if (arr[j] > arr[j + 1]) {
                    sorted[0] = false;
                    // swap
                    System.out.println("      Swapping " + arr[j] + " with " + arr[j + 1] + ".");
                    swapCount++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    System.out.println("       No swap.");
                }
            }
            System.out.print("  After first inner loop: " );
            printArray(arr);

            System.out.println("  In second inner loop");

            // Then sort elements with an odd index
            for (int k = 1; k < n; k += 2) {
                System.out.println("    Comparing " + arr[k] + " with " + arr[k + 1] + ".");
                if (arr[k] > arr[k + 1]) {
                    sorted[1] = false;
                    // swap
                    System.out.println("       Swapping " + arr[k] + " with " + arr[k + 1] + ".");
                    swapCount++;
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                } else {
                    System.out.println("     No swap.");
                }

            }
            System.out.print("  After second inner loop: " );
            printArray(arr);

            if (sorted[0] == true && sorted[1] == true) {
                // Since no swaps were performed, the list is assumed to be sorted
                break;
            }
            System.out.println();
        }

        System.out.println("\nTotal swaps: " + swapCount);
    }
}
