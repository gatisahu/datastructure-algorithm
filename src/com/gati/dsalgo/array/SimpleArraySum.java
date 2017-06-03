/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class SimpleArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int totalNumber = scan.nextInt();
        long[] array=new long[totalNumber];
        for(int i=0;i<totalNumber;i++){
        	array[i]=scan.nextLong();
        }
        long total=0;
        for(int i=0;i<totalNumber;i++){
        	total=total+array[i];
        }
        System.out.println(total);
	}

}
