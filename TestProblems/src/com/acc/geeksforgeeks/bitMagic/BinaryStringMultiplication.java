package com.acc.geeksforgeeks.bitMagic;

import java.util.Scanner;

public class BinaryStringMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		int len1 = str1.length();
		int len2 = str2.length();
		StringBuilder sb = new StringBuilder();
		if (len1 > len2) {
			int diff = len1 - len2;
			while (diff != 0) {
				sb.append("0");
				diff--;
			}
			sb.append(str2);
			str2 = sb.toString();
		} else if (len2 > len1) {
			int diff = len2 - len1;
			while (diff != 0) {
				sb.append("0");
				diff--;
			}
			sb.append(str1);
			str1 = sb.toString();
		}
		System.out.println(str1 + " " + str2);
		
		
		
	}

}
