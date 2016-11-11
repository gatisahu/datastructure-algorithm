/**
 * MergeSort is a Divide and Conquer algorithm. It divides input array in two halves, 
 * calls itself for the two halves and then merges the two sorted halves. The merge() function is used for merging two halves. 
 * The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. 
 * MergeSort(arr[], l,  r) 
 * If r > l 
 *      1. Find the middle point to divide the array into two halves:  
 *                 middle m = (l+r)/2 
 *      2. Call mergeSort for first half:   
 *                 Call mergeSort(arr, l, m)
 *      3. Call mergeSort for second half:
 *                 Call mergeSort(arr, m+1, r)
 *      4. Merge the two halves sorted in step 2 and 3:
 *                 Call merge(arr, l, m, r)
 */
package com.gati.dsalgo.sort;

/**
 * @author sahug
 *
 */
public class MergeSort {

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}

	private void sort(int[] arr, int i, int j) {
		if (i < j) {
			int middle = (i + j) / 2;
			sort(arr, i, middle);
			sort(arr, middle + 1, j);
			merge(arr, i, middle, j);
		}
	}

	private void merge(int[] arr, int i, int middle, int j) {
		int n1 = middle - i + 1;
		int n2 = j - middle;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n1];
		for (int k = 0; k < n1; k++) {
			arr1[k] = arr[k + i];
		}
		for (int k = 0; k < n2; k++) {
			arr2[k] = arr[k + middle + 1];
		}
		int l = 0;
		int m = 0;
		int k = i;
		while (l < n1 && m < n2) {
			if (arr1[l] > arr2[m]) {
				arr[k] = arr2[m];
				k++;
				m++;
			} else {
				k++;
				l++;
			}
		}
		/* Copy remaining elements of arr1[] if any */
		while (l < n1) {
			arr[k] = arr1[l];
			l++;
			k++;
		}

		/* Copy remaining elements of arr2[] if any */
		while (m < n2) {
			arr[k] = arr2[m];
			m++;
			k++;
		}
	}
}
