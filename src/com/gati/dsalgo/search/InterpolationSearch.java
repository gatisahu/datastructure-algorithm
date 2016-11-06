/**
 * Step1: In a loop, calculate the value of “pos” using the probe position formula.
 * pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ] 
 * arr[] ==> Array where elements need to be searched
 * x     ==> Element to be searched
 * lo    ==> Starting index in arr[]
 * hi    ==> Ending index in arr[]
 * Step2: If it is a match, return the index of the item, and exit.
 * Step3: If the item is less than arr[pos], calculate the probe position of the left sub-array.
 *  Otherwise calculate the same in the right sub-array.
 *  Step4: Repeat until a match is found or the sub-array reduces to zero.
 */
package com.gati.dsalgo.search;

/**
 * @author sahug
 *
 */
public class InterpolationSearch {

	public static void main(String[] args) {

		// Array of items on which search will
		// be conducted.
		int arr[] = { 10, 12, 13, 16, 31, 33, 35, 42, 47 };
		int x = 33; // Element to be searched
		int index = interpolationSearch(arr, arr.length, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index %d" + index);
		else
			System.out.println("Element not found.");

	}

	private static int interpolationSearch(int[] arr, int length, int x) {
		int lo = 0;
		int hi = length - 1;

		while (lo < hi) {
			// Probing the position with keeping
			// uniform distribution in mind.
			int pos = lo + ((x - arr[lo]) * (hi - lo) / (arr[hi] - arr[lo]));
			if (x == arr[pos]) {
				return pos;
			} else if (x > arr[pos]) {
				lo = pos + 1;
			} else {
				hi = pos - 1;
			}
		}
		return 0;
	}

}
