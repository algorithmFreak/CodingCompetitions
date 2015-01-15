package com.acc.rahul.topCoder;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class GoodCompanyDivTwo {

	public static int countGood(int[] superior, int[] workType) {
		int len = superior.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			Set<Integer> set = new HashSet<Integer>();
			set.add(workType[i]);
			int c = 1;
			for (int j = len - 1; j > i; j--) {
				if (i == superior[j]) {
					set.add(workType[j]);
					c++;
				}
			}
			if (c == set.size()) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(countGood(new int[] { -1, 0 }, new int[] { 1, 2 }));
		System.out.println(countGood(new int[] { -1, 0 }, new int[] { 1, 1 }));
		System.out.println(countGood(new int[] { -1, 0, 1, 1 }, new int[] { 1,
				4, 3, 2 }));
		System.out.println(countGood(new int[] { -1, 0, 1, 0, 0 }, new int[] {
				3, 3, 5, 2, 2 }));
		System.out.println(countGood(new int[] { -1, 0, 1, 1, 1, 0, 2, 5 },
				new int[] { 1, 1, 2, 3, 4, 5, 3, 3 }));
		System.out.println(Calendar.getInstance().getTimeInMillis());
		
		System.out.println(countGood(new int[] { -1, 0, 0, 1, 1, 3, 0, 2, 0, 5,
				2, 5, 5, 6, 1, 2, 11, 12, 10, 4, 7, 16, 10, 9, 12, 18, 15, 23,
				20, 7, 4 }, new int[] { 4, 6, 4, 7, 7, 1, 2, 8, 1, 7, 2, 4, 2,
				9, 11, 1, 10, 11, 4, 6, 11, 7, 2, 8, 9, 9, 10, 10, 9, 8, 8 }));
		System.out.println(Calendar.getInstance().getTimeInMillis());
	}

	
}
