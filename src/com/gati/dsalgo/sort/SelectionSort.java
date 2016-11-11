/**
 * 
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and 
 * putting it at the beginning. The algorithm maintains two sub-arrays in a given array.
 * 1) The sub-array which is already sorted.
 * 2) Remaining sub-array which is unsorted.
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
 * Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1).
 * The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
 */
package com.gati.dsalgo.sort;

/**
 * @author sahug
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	// Driver code to test above
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

	private void sort(int[] arr) {
		int length = arr.length;
		int index = 0;
		for (int i = 0; i < length; i++) {
			index = i;
			for (int j = i; j < length; j++) {
				if (arr[index] < arr[j]) {
					index = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;

		}

	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
