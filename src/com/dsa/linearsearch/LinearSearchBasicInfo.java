package com.dsa.linearsearch;

/* To search weather any element exists or not. Its a basic searching algorithm.
 * arr = [18, 12, 9, 14, 77, 50];
 * Find weather 14 exists or not. 
 * If value not found return -1
 * 
 *  Time complexity:
 *  Base case: O(1)
 *  Worst case: O(n)
 *  
 * Best case: How many checks will the loop move in best case i.e element found at 0th index.
 * Worst case: You dont find the item until you iterate through every item and in the end it says Element not found.  
 *  
 * 
 * */
public class LinearSearchBasicInfo {

	public static void main(String[] args) {
		int[] arr = { 18, 12, 9, 14, 77, 50 };
		System.out.println(linearSearch(arr, 14));
	}

	/*
	 * Search in the array. Return index of the target it found. Else return -1
	 */
	static int linearSearch(int arr[], int target) {

		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		//this return will be executed if none of the above returns run. Means element is not found. 
		return -1;
	}

}
