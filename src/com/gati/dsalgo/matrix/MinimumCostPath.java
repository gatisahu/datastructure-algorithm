/**
 * 
 */
package com.gati.dsalgo.matrix;

/**
 * @author sahug
 *
 */
public class MinimumCostPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		System.out.println("minimum cost to reach (2,2) = " + minCost(cost, 2, 2));

	}

	private static int minCost(int[][] cost, int i, int j) {
		int R=cost.length;
		int C=cost[0].length;
		int[][] output=new int [R][C];
		output[0][0] =cost[0][0];
		for(int row=1;row<R;row++){
			output[row][0]=cost[row][0]+output[row-1][0];
		}
		for(int column=1;column<C;column++){
			output[0][column]=cost[0][column]+output[0][column-1];
		}
		
		for(int row=1;row<R;row++){
			for(int column=1;column<C;column++){
				output[row][column]=Math.min(output[row-1][column-1], Math.min(output[row-1][column],output[row][column-1]))+cost[row][column];
			}
		}
		return output[i][j];
	}

}
