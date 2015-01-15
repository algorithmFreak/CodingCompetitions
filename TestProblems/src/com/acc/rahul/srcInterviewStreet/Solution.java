package com.acc.rahul.srcInterviewStreet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	static int minimumArea(int[][] coord) {
		int N = coord.length;
		int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (coord[i][0] > maxX) {
				maxX = coord[i][0];
			}
			if (coord[i][1] > maxY) {
				maxY = coord[i][1];
			}
			if (coord[i][0] < minX) {
				minX = coord[i][0];
			}
			if (coord[i][1] < minY) {
				minY = coord[i][1];
			}
		}
		return (maxX - minX) * (maxY - minY);
	}

	static String subString(int K, String str){
		List<String> ls = new ArrayList<String>();
		Set<String> ss = new TreeSet<String>();
		int len = str.length();
		for(int i=0;i<len;i=i+K){
			if(i+K < len){
			ls.add(str.substring(i, i+K));	
			ss.add(str.substring(i, i+K));	
			}else{
				ls.add(str.substring(i,len));
				ss.add(str.substring(i, len));	
			}
		}
		
		
		
		for(String s:ss){
			System.out.println(s);
			
			
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {
		/*Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] array = new int[N][2];
		for (int i = 0; i < N; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}*/
		//System.out.println(obj.minimumArea(array));
		
		
		subString(3,"morganstanley");
		
	}
}