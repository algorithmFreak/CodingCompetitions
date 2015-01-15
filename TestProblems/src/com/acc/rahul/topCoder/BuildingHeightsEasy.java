package com.acc.rahul.topCoder;

import java.util.Arrays;

public class BuildingHeightsEasy {

	public static int minimum(int M, int[] heights) {
		Arrays.sort(heights);
		int sum = 0, minSum = Integer.MAX_VALUE;
		int len = heights.length;
		int highest=0;
		for (int i = 0; i < len-M+1; i++) {
			highest = heights[i+M-1];
			sum=0;
			for(int j=i;j<i+M;j++){
				sum+=(highest-heights[j]);
			}
			minSum = Math.min(sum, minSum);
		}
		return minSum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(minimum(2, new int[] { 1, 2, 1, 4, 3 }));
	 System.out.println(minimum(3, new int[]{1, 3, 5, 2, 1}));
	 System.out.println(minimum(1, new int[]{43, 19, 15}));
	 System.out.println(minimum(3, new int[]{19, 23, 9, 12}));
	 System.out.println(minimum(12, new int[]{25, 18, 38, 1, 42, 41, 14, 16, 19, 46, 42, 39, 38, 31, 43, 37, 26, 41, 33, 37, 45, 27, 19, 24, 33, 11, 22, 20, 36, 4, 4}));

	}

}
