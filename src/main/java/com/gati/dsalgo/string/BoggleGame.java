/**
 * 
 */
package com.gati.dsalgo.string;

/**
 * @author sahug
 *
 */
public class BoggleGame {

	private static final String  dictionary[] = { "GEEKS", "FOR", "QUIZ", "GO" };
	private static final int[] x={};
	private static final int[] y={};
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * Following words of dictionary are present GEEKS QUIZ
		 */
		char boggle[][] = { { 'G', 'I', 'Z' }, { 'U', 'E', 'K' }, { 'Q', 'S', 'E' } };

		System.out.println("Following words of dictionary are present\n");
		findWords(boggle);
	}

	private static void findWords(char[][] boggle) {
	   int[][] visited =new int[boggle.length][boggle.length];
	   for(int i=0;i<boggle.length;i++){
		   for(int j=0;j<boggle.length;j++){
			   findWordsRecur(boggle,i,j,visited) ;
		   }
	   }
	  

	}

	private static void findWordsRecur(char[][] boggle, int i, int j, int[][] visited) {
		
	}

}
