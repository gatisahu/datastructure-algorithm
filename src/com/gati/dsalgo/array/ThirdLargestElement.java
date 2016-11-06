package com.gati.dsalgo.array;

public class ThirdLargestElement {

	public static void main(String[] args) {
    
		
		int[] inputArray={12, 13, 1, 10, 34, 16};
		//int[] inputArray ={10, 5, 15, 5, 15, 10, 1, 1};
		ThirdLargestElement largestElement =new  ThirdLargestElement();
		System.out.println(largestElement.findThirdLargestElement(inputArray));

	}

	public int findThirdLargestElement(int[] arr) {

		int first_element = arr[0];
		int second_element = Integer.MIN_VALUE;
		int third_element = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > first_element) {
				third_element = second_element;
				second_element = first_element;
				first_element = arr[i];
			}else if(arr[i] >second_element && first_element !=arr[i] ){
				third_element = second_element;
				second_element = arr[i];
			}else if(arr[i] >third_element && second_element !=arr[i] && first_element !=arr[i]){
				third_element =  arr[i];
			}
		}
		return third_element;

	}

}
