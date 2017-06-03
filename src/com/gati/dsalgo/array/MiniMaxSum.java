package com.gati.dsalgo.array;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();
		long[] array = { a, b, c, d, e };
		long sum = a + b + c + d + e;
        long minValue=Long.MAX_VALUE;
        long maxValue=Long.MIN_VALUE;
        for(int i=0;i<array.length;i++){
        	if((sum-array[i]) >maxValue){
        		maxValue=sum-array[i];
        	}
        	if((sum-array[i]) <minValue){
        		minValue=sum-array[i];
        	}
        }
        System.out.print(minValue);
        System.out.print(" ");
        System.out.print(maxValue);
	}

}
