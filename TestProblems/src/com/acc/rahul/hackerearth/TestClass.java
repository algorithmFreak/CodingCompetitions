package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] values;
		int k, n;
		long N, wierdness = 0;
		;
		int T = Integer.parseInt(line);
		for (int t = 0; t < T; t++) {
			values = br.readLine().split("\\ ");
			k = Integer.parseInt(values[0]);
			n = Integer.parseInt(values[1]);
			System.out.println(k + "," + n);
			N = (long) ((long) Math.pow(k, n + 1) - 1) / (k - 1);
			System.out.println(N);
			wierdness = 0;
			while (N > 0) {
				wierdness += N % 10;
				N = N / 10;
			}
			System.out.println(wierdness);
		}
	}
}