package com.acc.rahul.topCoder;

public class TwoWaysSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(sortingMethod(new String[]{"a", "aa", "bbb"}));
		System.out.println(sortingMethod(new String[]{"c", "bb", "aaa"}));
		System.out.println(sortingMethod(new String[]{"etdfgfh", "aio"}));
		System.out.println(sortingMethod(new String[]{"aaa", "z"}));
		System.out.println(sortingMethod(new String[]{"z"}));
		System.out.println(sortingMethod(new String[]{"abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder"}));
	}

	public static String sortingMethod(String[] stringList) {
		int len = stringList.length;
		int[] length = new int[len];
		for (int i = 0; i < len; i++) {
			length[i] = stringList[i].length();
		}
		boolean lengthSort = true, lexSort = true;
		for (int i = 0; i < len - 1; i++) {
			if (length[i] > length[i + 1]) {
				lengthSort = false;
			}
			if (stringList[i].compareTo(stringList[i + 1]) > 0) {
				lexSort = false;
			}
		}

		if (lengthSort && lexSort) {
			return "both";
		} else if (lengthSort) {
			return "lengths";
		} else if (lexSort) {
			return "lexicographically";
		} else {
			return "none";
		}
	}
}
