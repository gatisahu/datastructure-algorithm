/**
 * 
 */
package com.gati.dsalgo.search;

/**
 * Binary Search: Search a sorted array by repeatedly dividing the search
 * interval in half. Begin with an interval covering the whole array. If the
 * value of the search key is less than the item in the middle of the interval,
 * narrow the interval to the lower half. Otherwise narrow it to the upper half.
 * Repeatedly check until the value is found or the interval is empty.
 * 
 * @author sahug
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearchRec(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
		result = ob.binarySearchIter(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);

	}

	private int binarySearchRec(int[] arr, int i, int j, int x) {
		if (i > j) {
			return -1;
		}
		int mid = i + (j - i) / 2;
		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] > x) {
			return binarySearchRec(arr, i, mid - 1, x);
		} else {
			return binarySearchRec(arr, mid + 1, j, x);
		}
	}

	private int binarySearchIter(int[] arr, int i, int j, int x) {
		while (i <= j) {
			int mid = i + (j - i) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] > x) {
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		return -1;
	}

}
