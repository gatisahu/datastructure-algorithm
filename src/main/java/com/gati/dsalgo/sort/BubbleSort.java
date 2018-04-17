/**
 * 
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * Example:
 * First Pass:
 * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
 * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
 * ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
 * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
 * Second Pass:
 * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
 * ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
 * 
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.Auxiliary Space: O(1)
 * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
 * Sorting In Place: Yes
 * Stable: Yes 
 */
package com.gati.dsalgo.sort;

/**
 * @author sahug
 *
 */
public class BubbleSort {

	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

	private void bubbleSort(int[] arr) {
		int length = arr.length;
		boolean pass = false;
		boolean loopend = true;
		while (loopend) {
			pass = false;
			for (int i = 0; i < length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					pass = true;
				}
			}
			if (!pass) {
				loopend = false;
			}
		}

	}

}
