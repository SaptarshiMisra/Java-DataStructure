```java
package sort;

/**
 * This class implements the Selection Sort algorithm for sorting integer arrays.
 * It extends `ArrayPrintUtils` (assumed to be a utility class providing array printing and swapping functionalities).
 * 
 * Selection Sort works by repeatedly finding the minimum element from the unsorted part of the array 
 * and placing it at the beginning of the unsorted part.  This process continues until the entire array is sorted.
 */
public class SelectionSort extends ArrayPrintUtils {

    /**
     * Main method to demonstrate the Selection Sort algorithm.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] data = {5, 4, 3, 2, 1};
        int[] sorted = selectionSort(data);
        ArrayPrintUtils.printIntArray(sorted);
    }

    /**
     * Sorts an integer array using the Selection Sort algorithm.
     *
     * @param input The input integer array to be sorted.
     * @return The sorted integer array (modifies the input array in-place).
     */
    static int[] selectionSort(int[] input) {
        // min: Stores the current minimum value found in the unsorted part.
        // minIndex: Stores the index of the current minimum value.

        // Outer loop iterates from the beginning of the unsorted part up to the second-to-last element.
        for (int out = 0; out < input.length - 1; out++) {
            min = input[out]; // Initialize min with the first element of the unsorted part.
            minIndex = out; // Initialize minIndex with the current outer loop index.


            // Inner loop scans the unsorted part to find the minimum element.
            for (int in = out + 1; in < input.length; in++) {
                if (input[in] < min) {  //If a smaller element is found
                    min = input[in];      // Update min
                    minIndex = in;       // Update minIndex
                }
            }

            ArrayPrintUtils.swap(input, out, minIndex); // Swap the found minimum element with the element at the current outer loop index.
        }
        return input;
    }
}
```


**Notable aspects:**

* **In-place sorting:** `selectionSort` modifies the original input array directly. It doesn't create a new array for the sorted elements.
* **Time Complexity:** Selection Sort has a time complexity of O(n^2) in all cases (best, average, and worst), making it inefficient for large datasets.
* **Space Complexity:**  O(1) as it sorts in place.
* **Dependency on `ArrayPrintUtils`:** The class depends on a utility class named `ArrayPrintUtils` for printing arrays and swapping elements.  The documentation assumes the existence and functionality of this utility class.  You should include `ArrayPrintUtils` in your project or replace its usage with equivalent functions.


This improved documentation provides a much clearer explanation of the algorithm, its purpose, and how it operates.  It clarifies variable names, explains the nested loop logic, and adds information about time and space complexity.  It also explains the dependency on the external utility class.