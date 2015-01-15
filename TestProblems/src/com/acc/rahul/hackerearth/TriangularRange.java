package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TriangularRange {

	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line = br.readLine();
	int T = Integer.parseInt(line);
	int count = 0;
	String[] arr;
	long L,R,a,b;
	long[] tNumbers= new long[Integer.MAX_VALUE];
	for (int t = 1; t <= T; t++) {
		arr = br.readLine().split("\\s");
		L=Long.parseLong(arr[0]);
		R=Long.parseLong(arr[1]);
		int n=0;
		int number=n*(n+1)/2;
		
	}
	
}
}
