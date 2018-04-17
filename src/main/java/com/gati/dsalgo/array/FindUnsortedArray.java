/**
 * 
 */
package com.gati.dsalgo.array;

/**
 * @author sahug
 *
 */
public class FindUnsortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		FindUnsortedArray unsortedArray = new FindUnsortedArray();
		unsortedArray.printUnsorted(arr, arr.length);
	}

	private void printUnsorted(int[] arr, int length) {
		int startIndex = -1;
		int endIndex = -1;
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				startIndex =i;
				break;
			}
		}
		if (startIndex == -1) {
			System.out.println("Already Sorted");
			return;
		}
		for (int i = length - 1; i > 1; i--) {
			if (arr[i] < arr[i - 1]) {
				endIndex =i;
				break;
			}
		}
		for (int i = 0; i < length; i++) {
			if (maxNumber < arr[i]) {
				maxNumber = arr[i];
			}
			if (minNumber > arr[i]) {
				minNumber = arr[i];
			}
		}
		for (int i = 1; i < length; i++) {
			if (arr[i] < minNumber) {
				startIndex =i;
			}
			if (arr[i] > maxNumber) {
				endIndex = i;
			}
		}
		System.out.println("Start index" + startIndex + "End index" + endIndex);
	}

}
