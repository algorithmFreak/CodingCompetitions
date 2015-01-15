package com.acc.rahul.hackerearth;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class AnkitAndTeam {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] values;
        String[] strengths;
		int N, K;
        int T = Integer.parseInt(line);
        for (int t = 0; t < T; t++) {
        	values = br.readLine().split("\\ ");
			N = Integer.parseInt(values[0]);
			K = Integer.parseInt(values[1]);
			strengths = br.readLine().split("\\ ");
			int len = strengths.length;
			int[] strengthInt = new int[len];
			for(int i=0;i<len;i++){
				strengthInt[i] = Integer.parseInt(strengths[i]);
			}
			Arrays.sort(strengthInt);
			
			long sum =0;
			int N1 =N, K1 =K;
			for(int i=0;i<N-K+1;i++){
				sum += strengthInt[i] * calCombinations(N1-1,K-1);
				N1--;K1--;
			}
			sum%=1000000007;	
			System.out.println(sum);
        }   
    }
    
    private static long calCombinations(int N, int K){
    	long numerator = 1, denominator =1;
		for(int i=N-K+1;i<=N;i++){
			numerator *=i; 
		}
		for(int i = 1;i<=N-K;i++){
			denominator*=i;
		}
		long combinations = (long) numerator/denominator;
		return combinations;
    }
}
