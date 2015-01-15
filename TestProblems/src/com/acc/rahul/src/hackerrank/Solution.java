package com.acc.rahul.src.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	/**
	 * @param args
	 */
	// Problem 1
	/*
	 * public static void main(String[] args) { BufferedReader br = new
	 * BufferedReader(new InputStreamReader(System.in)); try { int T =
	 * Integer.parseInt(br.readLine()); int x, y, x1, y1, x2, y2, min; String[]
	 * arr; for (int t = 1; t <= T; t++) { arr = br.readLine().split("\\ "); x =
	 * Integer.parseInt(arr[0]); y = Integer.parseInt(arr[1]); x1 =
	 * Integer.parseInt(arr[2]); y1 = Integer.parseInt(arr[3]); x2 =
	 * Integer.parseInt(arr[4]); y2 = Integer.parseInt(arr[5]); min =
	 * Math.min(Math.min(Math.abs(x - x1), Math.abs(x - x2)),
	 * Math.min(Math.abs(y - y1), Math.abs(y - y2))); System.out.println(min); }
	 * } catch (IOException e) { e.printStackTrace(); } }
	 */

	// Problem 2
	/*
	 * public static void main(String[] args) { BufferedReader br = new
	 * BufferedReader(new InputStreamReader(System.in)); try { int T =
	 * Integer.parseInt(br.readLine()); int n, sum, count; float avg; String[]
	 * arr; int[] intArr; for (int t = 1; t <= T; t++) { count = 0; sum = 0; avg
	 * = 0; arr = br.readLine().split("\\ "); n = Integer.parseInt(arr[0]);
	 * intArr = new int[n]; for (int i = 0; i < n; i++) { intArr[i] =
	 * Integer.parseInt(arr[i + 1]); sum += intArr[i]; } avg = ((float) sum) /
	 * n; for (int a : intArr) { if (a > avg) { count++; } }
	 * System.out.println(count); } } catch (IOException e) {
	 * e.printStackTrace(); } }
	 */

	// Problem3
	/*
	 * public static void main(String[] args) { BufferedReader br = new
	 * BufferedReader(new InputStreamReader(System.in)); try { int T =
	 * Integer.parseInt(br.readLine()); String b, w; int blen, count; for (int t
	 * = 1; t <= T; t++) { b = br.readLine(); w = br.readLine(); blen =
	 * b.length(); count = 0; for (int i = 0; i < blen; i++) { if
	 * (w.contains(b.subSequence(i, i + 1))) { count++; } }
	 * System.out.println(count); } } catch (IOException e) {
	 * e.printStackTrace(); } }
	 */

	// Problem 5
	
	/*public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(br.readLine());
			int n,m, min = Integer.MAX_VALUE, diff = 0;
			int[] mouse, hole;
			String[] mouses, holes,numbers;
			for (int t = 1; t <= T; t++) {
				min = Integer.MAX_VALUE;
				numbers = br.readLine().split("\\s");
				n = Integer.parseInt(numbers[0]);
				m = Integer.parseInt(numbers[1]);
				mouse = new int[n];
				hole = new int[m];
				mouses = br.readLine().split("\\s");
				holes = br.readLine().split("\\s");
				for (int i = 0; i < n; i++) {
					mouse[i] = Integer.parseInt(mouses[i]);
				}
				for (int i = 0; i < m; i++) {
					hole[i] = Integer.parseInt(holes[i]);
				}
			//	Arrays.sort(hole);
			//	Arrays.sort(mouse);
				int minimum=Integer.MIN_VALUE;
				for (int i = 0; i < n; i++) {
					int minJ=0;
					min=Integer.MAX_VALUE;
					for(int j=0;j<m;j++){
					diff = Math.abs(mouse[i] - hole[j]);
					if (diff < min) {
						min = diff;
						minJ=j;
					}
					}
					hole[minJ]= Integer.MAX_VALUE;
					minimum= Math.max(minimum, min);
				}
				System.out.println(minimum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
*/
	// problem6
/*	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(br.readLine());
			int count=0;
			for (int i = 0; i < T;i++) {				
				count^=findOnes(Integer.toBinaryString(Integer.parseInt(br
						.readLine())));
			}
			if (count==0) {
				System.out.println("The other player :(");
			} else {
				System.out.println("Shaka :)");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int findOnes(String s) {
		int len = s.length(), count = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}*/
	
	/*public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			char min='a';
			int len=s.length();
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			char c = arr[len-1];
			c--;
			c=min>c?min:c;
			arr[len-1]=c;
			System.out.println(new String(arr));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] sArr = br.readLine().split("\\s");
			int N,K;
			N= Integer.parseInt(sArr[0]);
			K= Integer.parseInt(sArr[1]);
			int[][] arr = new int[N][K];
			for(int i=0;i<K;i++){
				sArr=br.readLine().split("\\s");
				for(int j=0;j<N;j++){
					arr[i][j]=Integer.parseInt(sArr[j]);
				}
			}
			int min=Integer.MAX_VALUE;
			int sum=0;
			for(int i=K-1,j=N-1;i>=0 && j>0;i--,j--){
				sum+=arr[i][j];
				if(sum<min){
					min=sum;
					
				}
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
