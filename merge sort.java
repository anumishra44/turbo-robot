import java.util.Arrays;

public class OptimizedMergeSort {

    // In-place merge function without using extra arrays
    public static void merge(int[] arr, int left, int mid, int right) {
        int start2 = mid + 1;

        // If the direct merge is already sorted, no need to merge
        if (arr[mid] <= arr[start2]) {
            return;
        }

        // Two pointers to maintain current index of sub-arrays
        while (left <= mid && start2 <= right) {
            // If element 1 is smaller than or equal to element 2, do nothing, just move left pointer
            if (arr[left] <= arr[start2]) {
                left++;
            } else {
                // Otherwise, we need to shift the second array's element to the correct place in the first array
                int value = arr[start2];
                int index = start2;

                // Shift all elements between arr[left] and arr[start2] one position to the right
                while (index > left) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[left] = value;

                // Update pointers
                left++;
                mid++;
                start2++;
            }
        }
    }

    // Recursive function to divide the array and sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Call mergeSort on the array
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
