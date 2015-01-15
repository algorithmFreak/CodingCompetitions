package com.acc.rahul.codeforces.srcSolutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ApplemanAndCardGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("\\s");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		String line = br.readLine();
		char[] c = line.toCharArray();
		int[] fullArr = new int[n];
		for (int i = 0; i < n; i++) {
			fullArr[i] = getCount(c[i], c, n);
		}
		Arrays.sort(fullArr);
		int[] count = new int[k + 1];

		int i = n - 1, j = k;
		while (j > 0) {
			if (fullArr[i] <= j) {
				int x = 0,y=fullArr[i];
				while (x < y) {
					count[j] = y;
					j--;i--;
					x++;
				}
			}else if(fullArr[i]!=j){
				i--;
			}
			else{
				count[j]=1;j--;
			}
		}
		int sum=0;
		for(i=0;i<=k;i++){
			sum+=count[i];
		}
		System.out.println(sum);

	}

	public static int getCount(char c, char[] arr, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] == c) {
				count++;
			}
		}
		return count;
	}
}
