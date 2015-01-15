package com.acc.rahul.topCoder;

import java.io.Serializable;

public class RunningAroundPark implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int numberOfLap(int N, int[] d){
		int count=1, len=d.length;
		for(int i=0;i<len-1;i++){
			if(d[i]>=d[i+1]){
				count++;
			}
		}
		return count;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(numberOfLap(1,new int[]{1,2,3}));
		System.out.println(numberOfLap(2,new int[]{6,6}));
		System.out.println(numberOfLap(3,new int[]{3,2,1}));
		System.out.println(numberOfLap(50,new int[]{1,3,5,7,9,2,4,6,8,10}));
		

		
	}
	
}
