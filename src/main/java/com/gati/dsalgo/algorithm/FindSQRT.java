/**
 * 
 */
package com.gati.dsalgo.algorithm;

/**
 * @author sahug
 *
 */
public class FindSQRT {

	/**
	 * Implement int sqrt(int x). Compute and return the square root of x. If x
	 * is not a perfect square, return floor(sqrt(x)) Example : Input : 11
	 * Output : 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FindSQRT findSQRT = new FindSQRT();
		System.out.println(findSQRT.sqrt(11));
	}

	public int sqrt(int a) {
		// Base Cases
		if (a == 0 || a == 1)
			return a;

		// Do Binary Search for floor(sqrt(x))
		long start = 1, end = a, ans = 0;
		while (start <= end) {
			long mid = (start + end) / 2;

			// If x is a perfect square
			if (mid * mid == a)
				return (int) mid;

			// Since we need floor, we update answer when mid*mid is
			// smaller than x, and move closer to sqrt(x)
			if (mid * mid < a) {
				start = mid + 1;
				ans = mid;
			} else // If mid*mid is greater than x
				end = mid - 1;
		}
		return (int) ans;
	}
}
