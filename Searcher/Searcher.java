package csc143;
import java.util.*;

public class Searcher<T> {
	// Returns the index of the key in the sorted array, or -1 if the 
	// key is not found.
	public static <T> int binarySearch(T[] array, int arraySize, T key, 
            Comparator<T> comparer) {
		int left = 0;
        int right = arraySize - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparisonResult = comparer.compare(array[mid], key);

            if (comparisonResult == 0) {
                // Key found at index mid
                return mid;
            } else if (comparisonResult < 0) {
                // The key is greater than the element at mid, so it must be in the right half
                left = mid + 1;
            } else {
                // The key is smaller than the element at mid, so it must be in the left half
                right = mid - 1;
            }
	}
		return -1;
	}
}
