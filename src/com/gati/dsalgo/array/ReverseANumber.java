/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class ReverseANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int totalNumber = scan.nextInt();
	        int[] inputArray=new int[totalNumber];
	        for(int i=0;i<totalNumber;i++){
	        	inputArray[i]=scan.nextInt();
	        }
	        
	        scan.close();
	        
	        for(int i = inputArray.length - 1; i >= 0; i--){
	            System.out.print(inputArray[i] + " ");
	        }
	        
	}

}
