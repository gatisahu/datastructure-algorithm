package com.gati.dsalgo.array;

import java.util.Scanner;

public class SolutionArray {

	public static void main(String[] args) {
		int[][] inputArray = new int[6][6];
		Scanner scan = new Scanner(System.in);
		 int totalNumber = scan.nextInt();
		for (int i = 0; i < totalNumber; i++) {
			for (int j = 0; j < totalNumber; j++) {
				inputArray[i][j] = scan.nextInt();
			}
		}
		scan.close();
		//for(int i=0;i<)
		//int primDiagoNalSum=inputArray
		//System.out.print(ascore + " " + bscore);
	}

}
