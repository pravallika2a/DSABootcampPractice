package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicInfo {
	/*
	 * Syntax: datatype[] var_name = new datatype[size]; int[] ros = new int[5]; OR
	 * int[] ros = {1,2,3,4,5};
	 * 
	 * int[] ros; //declaration. ros is getting defined in stack. ros = new int[5];
	 * //Initialization. actual object is created in the heap memory.
	 * 
	 * declarion happens at compile time actual object creation happens at run time.
	 * dynamic memory allocation
	 * 
	 * memory allocation for array is dependent on JVM.
	 * 
	 * According to JLS --> Heap objects are not continuous
	 * 
	 * 1. data type represents what is the type of data stored in the array 2. All
	 * the type of data in the array should be same 3. Dynamic memory allocation 4.
	 * Hence array objects in java may not be continuous. depends on JVM.
	 * 
	 * 
	 * Indices in array are starting from zero. for an integer array --> by default
	 * all the indices will be assigned to zero. [0, 0, 0, 0, 0] default values for
	 * primitives will be their default value. for objects it will be null.
	 * 
	 * Primitives --> something that can not be broken down Complex data types -->
	 * can be broken down. Ex: String can be broken down into chars.
	 * 
	 * 
	 * Index starts with 0 If you try to access any index which is not there --> you
	 * will get IndexOutOfBoundException
	 * 
	 * 
	 * Three ways to print elements in an Array
	 * 1. Traditional For Loop
	 * 2. Enhanced for loop
	 * 3. Using toString method
	 * 
	 * 
	 * Arrays are mutable. You can change the elements in the Array
	 * 
	 * 
	 * 
	 * Multi Dimentional Arrays
	 * int[][] arr2D = {
	 * 					{1, 2, 3}, //0th index
	 * 					{4, 5, 6}, //1st index
	 * 					{7, 8, 9} //2nd index --> arr2D[2] --> {7, 8, 9}
	 * 				}
	 * 
	 * 			arr2D[2][0] --> 7
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[5];
		// input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		// traditional for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		// Enhanced for loop
		for (int num : arr) {
			System.out.println(num);
		}
		//Another way to see the elements of an Array. 
		//CHECK THE INTERNAL IMPLEMENTATION OF TO STRING METHOD. It uses StringBuilder to convert it to a String by appending '[' & ']' 
		Arrays.toString(arr);
		
		//
		

	}
}
