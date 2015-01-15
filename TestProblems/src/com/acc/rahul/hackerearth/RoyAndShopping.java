package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoyAndShopping {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line), R, minPrimeFactor;
		for (int n = 1; n <= N; n++) {
			R = Integer.parseInt(br.readLine());
			minPrimeFactor = findMinPrimeFactor(R);
			System.out.println(R - minPrimeFactor);
		}

	}

	public static int findMinPrimeFactor(int num) {
		int x = (int) Math.sqrt(num);
		for (int i = 2; i <= x; i++) {
			if (num % i == 0 && checkPrime(i)) {
				return i;
			}
		}
		return num;
	}

	public static boolean checkPrime(int i) {
		int x=(int) Math.sqrt(i);
		for (int j = 2; j <= x; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getNextPrime(int n) {
		int i = n + 1;
		while (true) {
			if (checkPrime(i)) {
				return i;
			}
			i++;
		}
	}

}
