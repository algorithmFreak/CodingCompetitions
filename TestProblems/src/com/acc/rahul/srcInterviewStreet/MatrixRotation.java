package com.acc.rahul.srcInterviewStreet;

import java.util.Scanner;

public class MatrixRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 4, M = 2;
		int[][] mat = new int[][] { { 2, 1, 3, 0 }, { 11, 7, 9, 2 } };

		int[][] rotated = new int[N][M];
		for (int i = 0, y = M - 1; i < M && y >= 0; i++, y--) {
			for (int j = 0, x = 0; j < N && x < N; j++, x++) {
				rotated[x][y] = mat[i][j];
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}

	}

}