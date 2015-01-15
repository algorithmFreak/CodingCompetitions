package com.acc.rahul.topCoder;

import java.util.Arrays;

public class NumbersChallenge {

	public static int MinNumber(int[] S) {
		int maxSum = 0;
		for (int s : S) {
			maxSum += s;
		}
		Arrays.sort(S);
		/*
		 * if(S[0]!=1){ return 1; }else if(S[0]==1 && S[1]!=1 )
		 */
		for (int i = 1; i < maxSum; i++) {
			if (!checkI(i, S)) {
				return i;
			}
		}
		return maxSum + 1;
	}

	private static boolean checkI(int num, int[] S) {
		boolean possible = true;
		int len = S.length;
		int i = 0;
		while (i < len) {
			if (num >= S[i]) {
				i++;
				continue;
			}i--;
			break;
		}
		while(i>=0){
			if(num>=S[i]){
			num-=S[i];
		}
			i--;
			if(num<0){
				return false;
			}else if(num==0){
				return true;
			}else if(i<0 && num>0){
				return false;
			}
		}
		return possible;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(MinNumber(new int[] { 5, 1, 2 }));
		System.out.println(MinNumber(new int[] { 2, 1, 4 }));
		System.out.println(MinNumber(new int[] {2, 1, 2, 7}));
		System.out.println(MinNumber(new int[] {94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1}));
		System.out.println(MinNumber(new int[] {883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13}));
	}

}
