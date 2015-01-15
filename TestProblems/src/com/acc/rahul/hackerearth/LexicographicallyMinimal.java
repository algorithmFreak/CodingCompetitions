package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LexicographicallyMinimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] values;	
		String[] arr;
		int arraySize=0;
		int noOfSwap=0;
		int T = Integer.parseInt(line);
		for (int t = 0; t < T; t++) {
			values = br.readLine().split("\\ ");
			arraySize = Integer.parseInt(values[0]);
			noOfSwap = Integer.parseInt(values[1]);
			arr = br.readLine().split("\\ ");
			for(int i= arraySize-1;i>0 && noOfSwap>0;i--){
				if(arr[i].compareTo(arr[i-1]) <0){
					String temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] =temp;
					noOfSwap--;
				}
			}
			for(String a :arr){
				System.out.print(a+" ");
			}
		}
	}
	
}
