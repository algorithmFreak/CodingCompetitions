package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountEnemies {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int count = 0;
		StringBuilder sb;
		for (int t = 1; t <= T; t++) {
			line = br.readLine();
			sb= new StringBuilder(line);
			int i=0;
			while(i<sb.length()-1){
				if(sb.charAt(i)=='X' && sb.charAt(i+1)=='O'){
					sb.deleteCharAt(i+1);
				}else if(sb.charAt(i)=='O' && sb.charAt(i+1)=='X') {
					sb.deleteCharAt(i);
					if(i>0)i--;
				}else{
					i++;
				}
			}
			System.out.println(sb);
			count=0;
			for(i=0;i<sb.length();i++){
				if(sb.charAt(i)=='O'){
					count++;
				}
			}
			System.out.println(count);
 		}
	}
	
}
