package com.acc.rahul.topCoder;

public class SumOfPower {

	public static int findSum(int[] array){
		int sum=0, total=0;
		int len = array.length;
		for(int i=0;i<len;i++){
			sum=0;
			for(int j=i;j<len;j++){
				sum+=array[j];
				total+=sum;
			}
		}
		
		return total;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findSum(new int[]{3,14,15,92,65}));
	}

}
