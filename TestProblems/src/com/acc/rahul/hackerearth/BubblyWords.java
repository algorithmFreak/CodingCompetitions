package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubblyWords {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int M = Integer.parseInt(line);
		int count = 0;
		for (int i = 1; i <= M; i++) {
			if (checkBubbly(br.readLine())) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean checkBubbly(String str) {
		if (str.length() % 2 != 0 || str.equals("AB")) {
			return false;
		}
		if (str.split("ABAB").length >= 0 
				|| str.split("AAAB").length >= 1 || str.split("AABA").length >= 1
				||str.split("ABAA").length >= 1 || str.split("ABBB").length >= 1
				|| str.split("BAAA").length >= 1 || str.split("BABA").length >= 1
				|| str.split("BABB").length >= 1  || str.split("BBAB").length >= 1
				||str.split("BBBA").length >= 1) {
			return false;
		}
		if (str.split("ABBA").length >= 1 || str.split("BAAB").length >= 1
				|| str.split("AAAA").length >= 1 || str.split("BBBB").length >= 1
				|| str.split("BBAA").length >= 1 || str.split("AABB").length >= 1) {
			return true;
		}
		return false;
	}
}
