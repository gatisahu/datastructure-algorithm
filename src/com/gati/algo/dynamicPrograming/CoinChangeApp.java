/**
 * 
 */
package com.gati.algo.dynamicPrograming;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class CoinChangeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		int totalNumber = scan.nextInt();
		int[] arr = new int[totalNumber];
		for (int i = 0; i < totalNumber; i++) {
			arr[i] = scan.nextInt();
		}
		int[] result = new int[sum+1];
		result[0]=1;
		for (int i = 0; i < totalNumber; i++) {
			for (int j = arr[i]; j <= sum; j++) {
				result[j] += result[j - arr[i]];
			}
		}
		System.out.println(result[sum]);
	}

}
