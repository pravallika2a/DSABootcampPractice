package com.dsa.arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 23, 9, 18, 56 };

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));

	}

	static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
}
