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
public class FindMinimumNumberCoinsDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int coins[] = { 9, 6, 5, 1 };
		int m = coins.length;
		int V = 11;
		System.out.println("Minimum coins required is " + minCoins(coins, m, V));

	}

	private static List<Integer> minCoins(int[] coins, int m, int v) {
		List<List<Integer>> table = new ArrayList<>(v);
		List<Integer> zeroList=new ArrayList<>();
		zeroList.add(0);
		
		table.add(zeroList);
		for (int i = 1; i <= v; i++) {
			// Go through all coins smaller than i
			for (int j = 0; j < m; j++)
				if (coins[j] <= i) {
					List<Integer> sub_res = table.get(i - coins[j]);
					if (sub_res != null && (table.get(i) != null && sub_res.size() + 1 < table.get(i).size()))
						sub_res.add(coins[j]);
					table.add(i, sub_res);
				}
		}
		return table.get(v-1);

	}

}
