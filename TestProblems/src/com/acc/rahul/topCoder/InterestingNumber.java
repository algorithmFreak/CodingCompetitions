package com.acc.rahul.topCoder;
public class InterestingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestingNumber i = new InterestingNumber();
		System.out.println(i.isInteresting("2002"));
		System.out.println(i.isInteresting("1001"));
		System.out.println(i.isInteresting("41312432"));
		System.out.println(i.isInteresting("611"));
		System.out.println(i.isInteresting("64200246"));
		System.out.println(i.isInteresting("631413164"));
	}

	public String isInteresting(String x){
		char[] characters = x.toCharArray();
		int size = x.length();
		int[] digits = new int[size];
		for(int i=0;i<size;i++){
			digits[i]= Character.getNumericValue(characters[i]);
		}
		
		int b=-1, a=-1,c=-1; 
		for(int i=0;i<size;i++){
			a = digits[i];
			if(i+a+1<size)
			b= digits[i+a+1];
			if(i-a-1>=0)
			c=digits[i-a-1];
			if((a!=b && a!=c) || (a==b && a==c)){
				return "not interesting";
			}
			b=-1;c=-1;
		}
		
		return "interesting";
	}
}
