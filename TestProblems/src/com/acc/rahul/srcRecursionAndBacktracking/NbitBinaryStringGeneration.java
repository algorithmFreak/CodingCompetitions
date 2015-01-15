package com.acc.rahul.srcRecursionAndBacktracking;

public class NbitBinaryStringGeneration {

	private static Integer[] A;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n= 4;
		A = new Integer[n];
		binary(n);

	}

	
	public static void binary(int n){
		if(n<1){
			for(Integer i : A)
			System.out.print(i);
			System.out.println();
		}else{
			A[n-1]=0;
			binary(n-1);
			A[n-1]=1;
			binary(n-1);
		}
	}
}


