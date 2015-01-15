package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class VadaPavList {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String s;
		Set<String> set = new TreeSet<String>();
		for (int n = 1; n <= N; n++) {
			set.add(br.readLine());
		}

		System.out.println(set.size());
		for(String x:set){
			System.out.println(x);
		}
	}
	
}
