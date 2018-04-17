/**
 * 
 */
package com.gati.dsalgo.search;

/**
 * Given an array arr[] of n elements, write a function to search a given
 * element x in arr[].
 * 
 * A simple approach is to do linear search, i.e Start from the leftmost element
 * of arr[] and one by one compare x with each element of arr[] If x matches
 * with an element, return the index. If x doesn’t match with any of elements,
 * return -1.
 * 
 * 
 * @author sahug
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
		LinearSearch search = new LinearSearch();
		int[] arr = { 5, 10, 30, 56, 90, 45 };
		System.out.println("Search result for 45  " + search.search(arr, arr.length, 45));
		System.out.println("Search result for 11  " + search.search(arr, arr.length, 11));
	}

	// This function returns index of element x in arr[]
	public int search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			// Return the index of the element if the element
			// is found
			if (arr[i] == x)
				return i;
		}

		// return -1 if the element is not found
		return -1;
	}

}
