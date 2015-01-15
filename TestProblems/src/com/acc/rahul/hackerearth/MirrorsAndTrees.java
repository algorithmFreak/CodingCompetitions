package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MirrorsAndTrees {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split("\\s");
			int[] tree = new int[N + 1];
			for (int i = 0; i < N; i++) {
				tree[i + 1] = Integer.parseInt(input[i]);
			}
			ArrayList<Integer> leftMirror = new ArrayList<Integer>();
			int left, right;
			int level = 1;
			int height = (int) Math.pow(2, level);
			System.out.println(tree[1]);
			int index = 1;
			while (index < N) {
				left = index + 1;
				right = index + height;
				index = right;
				while (right >= left && tree[right] == 0) {
					right--;
				}
				if (left == right)
					System.out.println(tree[right]);
				if (left < right) {
					System.out.println(tree[right]);
					while (left <= right && tree[left] == 0) {
						left++;
					}
					if (left < right)
						leftMirror.add(tree[left]);
				}
				level++;
				height = (int) Math.pow(2, level);
			}
			if (leftMirror.size() > 0) {
				for (int element : leftMirror)
					System.out.println(element);
			}
		}
	}
}



