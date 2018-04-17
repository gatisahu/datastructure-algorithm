/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class Staircase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int totalNumber = scan.nextInt();
        for(int i=0;i<totalNumber;i++){
        	int k=i+1;
        	for(int j=0;j <totalNumber;j++){
        		if(j>=totalNumber-k)
        		System.out.print("#");
        		else{
        			System.out.print(" ");
        		}
        		
        	}
        	System.out.println();
        }
	}

}
