package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	/*
	 * 
	 * Arraylist works only with the wrapper classes. 
	 * list.add();
	 * list.set(indx, valu);
	 * list.remove(ind)
	 * 
	 * 
	 * 1. internally size is fixed. 
	 * 2. Array list fills by some amount, it will create new arraylist with double the size. 
	 * 3. old elements will be copied into new list and old will be deleted. 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Syntax
		ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.add(8765);

//        System.out.println(list.contains(765432));
//        System.out.println(list);
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

		// input
		for (int i = 0; i < 5; i++) {
			list.add(in.nextInt());
		}

		// get item at any index
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
		}

		System.out.println(list);

	}
}
