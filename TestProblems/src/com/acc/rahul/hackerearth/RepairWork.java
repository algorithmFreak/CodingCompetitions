package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RepairWork {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();
		char[] window = br.readLine().toCharArray();
		int len= window.length;
		double min=0;
		double total=0;
		int i=0;
		for(int j=0;j<len;j++){
			if(window[i]=='1' && j>0 && window[j-1]=='0'){
				if(j<=i){
					min=Math.sqrt(j-i+1);
				}
				total+=min;
				i=j;
			}
		}
		System.out.println(total);
	}
}
