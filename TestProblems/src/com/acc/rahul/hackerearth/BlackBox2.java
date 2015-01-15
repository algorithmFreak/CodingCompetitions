package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BlackBox2 {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		BigInteger fact,n;
		int number;
		int summation = 0, len;
		char[] arr;

		for (int t = 0; t < T; t++) {
			BigInteger numInt = new BigInteger(br.readLine());
			fact = new BigInteger("1");
			summation = 0;
			number = numInt.intValue();
			while (number > 1) {
			    n = new BigInteger("" + number);
				fact = fact.multiply(n);
				number--;
			}

			arr = fact.toString().toCharArray();
			len = arr.length;
			for (int i = 0; i < len; i++) {
				summation += ((int) arr[i] - 48);
			}
			System.out.println(summation);
		}
	}

}
