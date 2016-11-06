/**
 * Takes an array and searches each element from the beginning of array until it finds a match and
 *  Array does not need to be sorted.
 *  
 *  Linear Search Analysis
 *  
 *  Linear search looks at every element until it finds a match 
 *  The worst-case would be :- 
 *  – the element is not found or 
 *  – it is the last element in the array 
 *  – for an array of length n, n comparisons would be required 
 *   Therefore, time complexity of O(n).
 *   
 *  Linear search is good:  
 *  – for arrays with a small number of elements
 *  – when you will not search the array many times\
 *  - when the values in the array will be changed
 *    
 */
package com.gati.dsalgo.search;

/**
 * @author sahug
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Array of items on which search will
		// be conducted.
		int arr[] = { 10, 12, 13, 16, 31, 33, 35, 42, 47 };
		int x = 33; // Element to be searched
		int index = linearSearch(arr, arr.length, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");

	}

	private static int linearSearch(int[] arr, int length, int x) {

		for (int index = 0; index < length; index++) {
			if (x == arr[index]) {
				return index;  // Found key, return index.
			}
		}
		return -1;   // Failed to find key

	}

}
