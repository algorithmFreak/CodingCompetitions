package com.acc.rahul.topCoder;

import java.util.Arrays;

public class ManySquares {

	
	public static int howManySquares(int[] sticks){
		int sqCount=0;
		Arrays.sort(sticks);
		int len = sticks.length;
		int i=0;
		while(i<len-3){
			if(sticks[i]==sticks[i+1] && sticks[i+1]==sticks[i+2] && sticks[i+2]==sticks[i+3]){
				sqCount++;
				i=i+4;
				}else{
					i++;
				}
			}
		return sqCount;	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(howManySquares(new int[]{1,1,2,2,1,1,2}));
		System.out.println(howManySquares(new int[] {3, 1, 4, 4, 4, 10, 10, 10, 10}));
		System.out.println(howManySquares(new int[] {1,2,3,4,1,2,3,4,1,2,3,1,2,3,4,1,2,3,3,3}));
		System.out.println(howManySquares(new int[]{1,1,1,2,2,2,3,3,3,4,4,4} ));
		System.out.println(howManySquares(new int[] {1,1,1,2,1,1,1,3,1,1,1}));
		System.out.println(howManySquares(new int[]{2,2,4,4,8,8}));	
	}

}
