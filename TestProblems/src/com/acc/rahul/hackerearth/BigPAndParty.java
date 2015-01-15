package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigPAndParty {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split("\\s");
		int A = Integer.parseInt(line[0]);
		int C = Integer.parseInt(line[1]);
		int[][] mat = new int[A][A];
		long[] luckiness = new long[A];
		for (int i = 0; i < A; i++) {
			luckiness[i] = -1;
		}
		luckiness[0] = 0;
		int x, y;
		for (int t = 0; t < C; t++) {
			line = br.readLine().split("\\s");
			x = Integer.parseInt(line[0]);
			y = Integer.parseInt(line[1]);
			mat[x][y] = 1;
			mat[y][x] = 1;
		}
		for (int i = 1; i < A ; i++) {
			calculateLuckiness(mat, i, A, luckiness);
			System.out.println(luckiness[i]);
		}
	}

	private static void calculateLuckiness(int[][] mat, int row, int length,
			long[] luckiness) {
		if (mat[row][0] == 1) {
			luckiness[row] = 1;
			return;
		}
		long X, max = Long.MIN_VALUE;
		for (int i = 1; i < length; i++) {
			if (mat[row][i] == 1) {
				X = luckiness[i];
				if (X == 1) {
					max = 2;
				} else {
					max = X > max ? X : max;
				}
			}
		}
		if (max != Long.MIN_VALUE &&  max!=2) {
			luckiness[row] = max + 1;
		}else if(max==2){
			luckiness[row] = max;
		}
	}

}
