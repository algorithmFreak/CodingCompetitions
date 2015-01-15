package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AniruddhaQueue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int N;
		int[] distance;
		long M, sum = 0;
		String[] arr;
		int flag=0;
		for (int i = 1; i <= T; i++) {
			sum = 0;flag=0;
			N = Integer.parseInt(br.readLine());
			arr = br.readLine().split("\\s"); 
			M = Long.parseLong(br.readLine());
			distance = new int[N];
			for (int j = 0; j < N; j++) {
				distance[j] = Integer.parseInt(arr[j]);
				if(distance[i]!=0){
					flag++;
				}
			}
			int k = -1;
			while (sum < M) {
				k++;
				if (k == N) {
					k = 0;
				}
				sum += distance[k];
			}
			System.out.println(k + 1);
		}
	}
}
