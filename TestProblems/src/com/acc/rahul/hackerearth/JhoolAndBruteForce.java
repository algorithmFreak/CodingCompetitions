package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class JhoolAndBruteForce {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int n;

		for (int t = 1; t <= T; t++) {
			line = br.readLine();
			n = Integer.parseInt(line);
			int count=0;
			for(int i=n-1;i>0;i--){
				for(int j=1;j<Math.sqrt(n-1);j++){
					for(int k=1;k<Math.sqrt(n-1);k++){
						if(j*j*j + k*k*k == i){
							System.out.println(j+" "+k);
							count++;
						}
					}
				}
				if(count>2){
					System.out.println(i);
					break;
				}
			}

		}

	}

}
