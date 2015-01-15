package com.acc.rahul.topCoder;
public class PalindromicSubstringsDiv1 {

	char[] a;
	boolean[][] seen;
	double[][] dp;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromicSubstringsDiv1 obj = new PalindromicSubstringsDiv1();
		System.out.println(obj.expectedPalindromes( new String[]{"a","a",""},new String[]{"a"}));
		System.out.println(obj.expectedPalindromes(new String[]{"z??"},new String[]{}));
		System.out.println(obj.expectedPalindromes(new String[]{"ab","c"},new String[]{"??","a?"}));
		System.out.println(obj.expectedPalindromes(new String[]{},new String[]{"?"}));
		System.out.println(obj.expectedPalindromes(new String[]{"ab?def","?"},new String[]{"f??a"}));
	}

	public double expectedPalindromes(String[] S1, String[] S2){
		StringBuilder sb=new StringBuilder();
		for(String s:S1)
			sb.append(s);
		for(String s:S2)
			sb.append(s);
		a= sb.toString().toCharArray();
		
		seen = new boolean[a.length][a.length];
		dp = new double[a.length][a.length];
		double r=0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				r+=go(i,j);
				System.out.println("r"+r); 
			}
		}
		return r;
	}
	
	double go(int fr, int to){
		if(fr>to) return 1;
		if(fr==to) return 1;
		if(seen[fr][to]) return dp[fr][to];
		double r=go(fr+1,to-1);
		if(a[fr]=='?' && a[to]=='?')
			r*=(1/26.0);
		else if(a[fr]!='?' && a[to]!='?')
			r*= (a[fr]==a[to] ?1:0);
		else 
			r*=(1/26.0);
		
		seen[fr][to]=true;
		dp[fr][to]=r;
		return r;
	}
	
	
}
