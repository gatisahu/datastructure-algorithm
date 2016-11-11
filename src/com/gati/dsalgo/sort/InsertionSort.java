/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * Algorithm
 * // Sort an arr[] of size n
 * insertionSort(arr, n)
 * Loop from i = 1 to n-1.
 * a) Pick element arr[i] and insert it into sorted sequence arr[0…i-1] 
 * Time Complexity: O(n*n)
 * Auxiliary Space: O(1)
 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
 * And it takes minimum time (Order of n) when elements are already sorted.
 * Algorithmic Paradigm: Incremental Approach\
 * orting In Place: Yes
 * Stable: Yes
 * Online: Yes
 */
package com.gati.dsalgo.sort;

/**
 * @author sahug
 *
 */
public class InsertionSort {

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6 };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		printArray(arr);
	}

	private void sort(int[] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int j = i - 1;
			int value = arr[i];
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = value;
		}
	}

}
