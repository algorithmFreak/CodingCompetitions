package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConnectingBoxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("\\s");
		int N = Integer.parseInt(arr[0]);
		int Q = Integer.parseInt(arr[1]);
		int i, j;
		int[] pointA = new int[Q], pointB = new int[Q];
		for (int k = 0; k < Q; k++) {
			pointA[k] = -1;
			pointB[k] = -1;
		}
		boolean flag = true;
		for (int q = 0; q < Q; q++) {
			arr = br.readLine().split("\\s");
			i = Integer.parseInt(arr[0]);
			j = Integer.parseInt(arr[1]);
			if (q == 0 && (i <= N && j <= N && i != j)) {
				pointA[q] = i;
				pointB[q] = j;
			}
			if (i == j || i > N || j > N) {
				System.out.println("NO");
			} else {
				flag = true;
				for (int x = 0; x < q; x++) {
					if ((pointA[x] != -1 && pointB[x] != -1)
							&& ((i >= pointA[x] && i <= pointB[x] && j >= pointB[x])
									|| (j >= pointA[x] && j <= pointB[x] && i >= pointB[x])
				|| (i <= pointA[x] && j <= pointB[x])
				|| (j <= pointA[x] && i <= pointB[x])
									|| i == pointA[x]
									|| i == pointB[x]
									|| j == pointA[x] || j == pointB[x])) {
						flag = false;
					}
				}
				if (flag) {
					System.out.println("YES");
					pointA[q] = i;
					pointB[q] = j;
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
