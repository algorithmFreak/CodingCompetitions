package com.acc.rahul.topCoder;

import java.util.ArrayList;
import java.util.List;

public class CandidatesSelectionEasy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort(new String[] { "ACB", "BAC", "CBA" }, 1);
		sort(new String[] { "A", "C", "B", "C", "A" }, 0);
		sort(new String[] { "LAX", "BUR", "ONT", "LGB", "SAN", "SNA", "SFO",
				"OAK", "SJC" }, 2);
		sort(new String[] { "BBCBABAC", "BCBACABA", "CCCBAACB", "CACABABB",
				"AABBBBCC" }, 6);
		sort(new String[] { "XXYWZWWYXZ", "YZZZYWYZYW", "ZYZZWZYYWW",
				"ZWZWZWZXYW", "ZYXWZXWYXY", "YXXXZWXWXW", "XWWYZWXYXY",
				"XYYXYWYXWY", "ZZYXZYZXYY", "WXZXWYZWYY" }, 3);

	}

	public static int[] sort(String[] score, int x) {
		int len = score.length;
		int[] arr = new int[len];

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < len; i++) {
			char c = score[i].charAt(x);
			list.add(c);
		}
		int index = 0;
		for (int i = 65; i <= 90; i++) {
			char c = (char) i;
			for (int j = 0; j < len; j++) {
				if (c == list.get(j)) {
					arr[index] = j;
					index++;
				}
			}
			if(index==len){
				break;
			}
		}
		for(int d : arr){
			System.out.print(d+" ");
		}
		System.out.println();
		
		return arr;
	}
}
