/**
 * 
 */
package com.gati.algo.dynamicPrograming;

/**
 * @author sahug
 *
 */
public class LongestIncreasingSubsequence {
 public static int max_length=Integer.MIN_VALUE;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
	    int n = arr.length;
	    System.out.println("Length of LIS is " + lis( arr, n ));

	}

	private static int lis(int[] arr, int n) {
		doCalculateLis(arr,n,0,0,null);
		return max_length;
	}
	private static void doCalculateLis(int[] arr, int n,int index,int count,int[] resultArr){
		if(index>=n)
			return;
		if(resultArr ==null){
			resultArr=new int[n];
		}
		for(int i=index+1;i<n;i++){
			if(arr[index] < arr[i]){
				resultArr[count]=arr[i];
				count++;
				if(count>max_length){
					max_length=count;
					System.out.print(arr[i]);
				}
				doCalculateLis(arr, n, i, count,resultArr);
			}
			
			
		}
		System.out.println(resultArr);
		
	}

}
