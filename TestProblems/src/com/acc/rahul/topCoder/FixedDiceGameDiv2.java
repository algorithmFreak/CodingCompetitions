package com.acc.rahul.topCoder;

public class FixedDiceGameDiv2 {

	public static double getExpectation(int a, int b){
		long sumCombo=0;
		double sum=0;
		for(int i=1;i<=b;i++){
	 		for(int j=i+1;j<=a;j++){
	 			sum+=j;
	 			sumCombo++;
	 		}
	 	}
		
		return sum/sumCombo;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getExpectation(2, 2));
		System.out.println(getExpectation(4,2));
		System.out.println(getExpectation(3, 3));
		System.out.println(getExpectation(11,13));
	}

}
