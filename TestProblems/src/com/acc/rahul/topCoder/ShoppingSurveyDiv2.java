package com.acc.rahul.topCoder;

public class ShoppingSurveyDiv2 {

	public int minValue(int N, int[] s){
		int len =s.length;
		int items = len;
		int count=0;
		if(len==1){
			return s[0];
		}
		int sum=0;
		for(int x:s){
			sum+=x;
		}
		if(N>=sum){
			return 0;
		}
		for(int i=1, j=0;i<=N && j<len;i++,j++){
		if(N<=sum){
			count++;
			sum-=s[j];
		}
		
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShoppingSurveyDiv2 s = new ShoppingSurveyDiv2();
		System.out.println(s.minValue(5, new int[] { 3, 3 }));
		System.out.println(s.minValue(100, new int[] { 97 }));
		System.out.println(s.minValue(10, new int[] { 9, 9, 9, 9, 9 }));
		System.out.println(s.minValue(7, new int[] { 1, 2, 3 }));
		System.out.println(s.minValue(5, new int[] { 3, 3, 3 }));

	}

}
