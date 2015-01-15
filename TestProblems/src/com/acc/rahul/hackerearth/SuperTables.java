package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int A, B, N;
		String[] numbers;
		long X,Y;
		long value;
		for (int t = 0; t < T; t++) {
			value=0;
			numbers = br.readLine().split("\\s");
			A = Integer.parseInt(numbers[0]);
			B = Integer.parseInt(numbers[1]);
			
			N = Integer.parseInt(numbers[2]);
			for (int ai = 1, bi = 1, j = 0; j < N; j++) {
				X=A*ai;
				Y=B*bi;
				if (X < Y) {
					value=X;
					ai++;
				} else if(X>Y) {
					value=Y;
					bi++;
				} else{
					value=X;
					ai++;
					bi++;
				}
			}
			System.out.println(value);
		}
	}
}