/**
 * 
 */
package com.gati.algo.dynamicPrograming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sahug
 *
 */
public class FindMinimumNumberCoins {

	private static final int deno[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 93;
		//System.out.println("Following is minimal number of change for " + n + " is" + print(findMin(n)));
		
		System.out.println("Following is minimal number of change for " + n + " is" + print(findMinRec(n)));

	}

	private static List<Integer> findMin(int n) {
		List<Integer> result = new ArrayList<>();
		int size = deno.length - 1;
		for (int index = size; index >= 0; index--) {
			while (n >= deno[index]) {
				n = n - deno[index];
				result.add(deno[index]);
			}
		}
		return result;
	}

	private static List<Integer> findMinRec(int n) {
		List<Integer> result = new ArrayList<>();
		int size = deno.length - 1;
		findMinRecUtil(n, result,size);
		return result;
	}

	private static void findMinRecUtil(int n, List<Integer> result,int size) {
		
		if (n == 0) {
			return;
		}
		for (int index = size; index >= 0; index--) {
			if (n >= deno[index]) {
				n = n - deno[index];
				result.add(deno[index]);
				findMinRecUtil(n, result,index+1);
			}
		}
	}

	private static String print(List<Integer> resultList) {
		for (Integer resilt : resultList) {
			System.out.print(resilt +" ");
		}
		return null;
	}

}
