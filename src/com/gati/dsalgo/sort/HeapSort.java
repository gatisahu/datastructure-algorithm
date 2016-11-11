/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure.
 *  It is similar to selection sort where we first find the maximum element and place the maximum element at the end. 
 *  We repeat the same process for remaining element.
 */
package com.gati.dsalgo.sort;

/**
 * @author sahug
 *
 */
public class HeapSort {
	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;

		HeapSort ob = new HeapSort();
		ob.sort(arr);

		System.out.println("Sorted array is");
		printArray(arr);
	}

	private void sort(int[] arr) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);
		printArray(arr);
		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}

	}

	private void heapify(int[] arr, int n, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;
		if (left < n && arr[i] < arr[left]) {
			largest = left;
		}
		if (right < n && arr[largest] < arr[right]) {
			largest = right;
		}
		if (largest != i) {
			int tempValue = arr[i];
			arr[i] = arr[largest];
			arr[largest] = tempValue;
			heapify(arr, n, largest);
		}

	}

}
