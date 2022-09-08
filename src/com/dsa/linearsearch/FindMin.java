package com.dsa.linearsearch;

public class FindMin {
	public static void main(String[] args) {
		int[] arr = { 18, 12, 9, 14, 77, 50 };
		System.out.println(min(arr));

	}
	/* 
	 * 1. assume first element is min
	 * 2. check this min with all the elements in the array
	 * 3. replace min if you find any element less than min. 
	 * 
	 */
	static int min(int[] arr) {
		int min = arr[0];
		for (int a : arr) {
			if (a < min) {
				min = a;
			}
		}
		return min;
	}
}
