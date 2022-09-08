package com.dsa.linearsearch;

/*
 * 
 * */
public class SearchInStrings {

	public static void main(String[] args) {
		String str = "Pravallika";
		System.out.println(search(str, 'f'));
	}

	static boolean search(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				return true;
			}
		}
		return false;

	}

	static boolean search1(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (c == target) {
				return true;
			}
		}
		return false;

	}

}
