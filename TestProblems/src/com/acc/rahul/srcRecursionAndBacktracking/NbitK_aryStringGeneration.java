package com.acc.rahul.srcRecursionAndBacktracking;

public class NbitK_aryStringGeneration {

	private static Integer[] A;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n= 4, k=3;
		A = new Integer[n];
		k_ary_String(n,k);

	}
	
	
	public static void k_ary_String(int n,int k){
		if(n<1){
			for(Integer i : A)
			System.out.print(i);
			System.out.println();
		}else{
				for(int j=0;j<k; j++){
					A[n-1]=j;
					k_ary_String(n-1,k);
				}		
		}
	}

}
