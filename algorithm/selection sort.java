import java.util.Arrays;

public class SelectionSort {

    // Function to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through the entire array
        for (int i = 0; i < n - 1; i++) {
            // Assume the first element of the unsorted part is the smallest
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = {64, 25, 12, 22, 11};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Call the selectionSort function
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
