package com.acc.rahul.hackerearth;

import java.util.Scanner;

public class BOB_AnIdiot {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int S = Integer.parseInt(sc.nextLine());
		int size = 2 * S;
		String[] arr = new String[size];
		String[] strArr;
		for (int s = 0, i = 0; s < S && i < size; s++, i++) {
			strArr = sc.nextLine().split("\\s");
			arr[i] = strArr[0];
			arr[++i] = strArr[1];
		}
		StringBuilder str;
		int len;
		while (sc.hasNextLine()) {
			str = new StringBuilder(sc.nextLine());
			if(str.length()==0)
				break;
			len = str.length();
			for (int j = 0; j < len; j++) {
				for (int i = 0; i < size; i = i + 2) {
					if (str.charAt(j) == arr[i].charAt(0)) {
						str.replace(j, j + 1, arr[i + 1]);
					} else if (str.charAt(j) == arr[i + 1].charAt(0)) {
						str.replace(j, j + 1, arr[i]);
					}
				}
			}
			System.out.println(str);
		}
	}	

}
