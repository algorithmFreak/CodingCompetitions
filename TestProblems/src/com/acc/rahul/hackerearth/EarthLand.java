package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EarthLand {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int n, m, a, b;
		String[] input;
		int[][] arr;
		int[] counter;
		for (int t = 0; t < T; t++) {
			input = br.readLine().split("\\s");
			n = Integer.parseInt(input[0]);
			m = Integer.parseInt(input[1]);
			arr = new int[n][n];
			counter = new int[n];
			for (int x = 0; x < m; x++) {
				input = br.readLine().split("\\s");
				a = Integer.parseInt(input[0]);
				b = Integer.parseInt(input[1]);
				arr[a][b] = 1;
			}

			for (int x = 0; x < n; x++) {
				int count = 0;
				for (int y = 0; y < n; y++) {
					if (arr[x][y] == 1) {
						count++;
					}
				}
				counter[x] = count;
			}
			int source = findMax(counter);
			List<Integer> list = findTarget(counter);
			for (int target : list) {
				findDistinctPath(source, target, counter, arr);
			}
		}
	}

	public static int findDistinctPath(int source, int target, int[] counter,
			int[][] arr) {
		int count = 0;
		int len = counter.length;
		if (arr[source][target] == 1) {
			count++;
			return count;
		}
		int[] indexArr = new int[counter[source]];
		for (int i = 0,j=0; i < len && j<counter[source]; i++,j++) { 
			if(arr[source][i]==1){
				indexArr[j]=i;
			}
		}

		return count;
	}

	public static int findMax(int[] counter) {
		int max = Integer.MIN_VALUE;
		int maxIndex = Integer.MIN_VALUE;
		int len = counter.length;
		for (int i = 0; i < len; i++) {
			if (counter[i] > max) {
				max = counter[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static List<Integer> findTarget(int[] counter) {
		List<Integer> list = new ArrayList<Integer>();
		int len = counter.length;
		for (int i = 0; i < len; i++) {
			if (counter[i] == 0) {
				list.add(i);
			}
		}
		return list;
	}

}
