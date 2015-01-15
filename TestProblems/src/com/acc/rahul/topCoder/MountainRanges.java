package com.acc.rahul.topCoder;

public class MountainRanges {

	public int countPeaks(int[] heights) {
		int len = heights.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (len == 1) {
				return 1;
			} else if (i == 0 && heights[0] > heights[1]) {
				count++;
			} else if (i == len - 2 && heights[len-1] > heights[len-2]) {
				count++;
			} else if (i > 0 && i <= len - 2 && heights[i - 1] < heights[i]
					&& heights[i] > heights[i + 1]) {
				count++;
			}
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MountainRanges m = new MountainRanges();
		System.out.println(m.countPeaks(new int[] { 5, 6, 2, 4 }));
		System.out.println(m.countPeaks(new int[] { 1, 1, 1, 1, 1, 1, 1 }));
		System.out.println(m.countPeaks(new int[] { 2, 1 }));
		System.out.println(m
				.countPeaks(new int[] { 2, 5, 3, 7, 2, 8, 1, 3, 1 }));
		System.out.println(m.countPeaks(new int[] { 1 }));
		System.out.println(m.countPeaks(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }));
	}

}
