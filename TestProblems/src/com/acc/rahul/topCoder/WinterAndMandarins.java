package com.acc.rahul.topCoder;
import java.util.Arrays;

public class WinterAndMandarins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] bags1 = {10,20,30};
		int[] bags2 ={4, 7, 4};
		int[] bags3 ={4, 1, 2, 3};
		int[] bags4 ={5, 4, 6, 1, 9, 4, 2, 7, 5, 6};
		int[] bags5 ={47, 1000000000, 1, 74};
		
		System.out.println(getNumber(bags1,2));		
		System.out.println(getNumber(bags2,3));
		System.out.println(getNumber(bags3,3));
		System.out.println(getNumber(bags4,4));
		System.out.println(getNumber(bags5,2));
	}

	
	public static int getNumber(int[] bags, int K)
	{
		Arrays.sort(bags);
		int length = bags.length;
		int diff=bags[length-1]-bags[0];
		
		for(int i=length-1;i-K+1>=0;i--){
		 	int x = bags[i]-bags[i-K+1];
		if(x<diff){
			diff=x;
		}
		}
		
		return diff;
	}
	
	
}
