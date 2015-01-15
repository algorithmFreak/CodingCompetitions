package com.acc.rahul.topCoder;
public class LeftAndRightHandedDiv2 {

	
	public static void main(String[] args) {
		LeftAndRightHandedDiv2 a = new LeftAndRightHandedDiv2();
		System.out.println(a.count("L"));
		System.out.println(a.count("RRR"));
		System.out.println(a.count("LRLRLR"));
		System.out.println(a.count("LLLRRR"));
		System.out.println(a.count("RLRLRL"));

	}

	public int count(String S){
		int len = S.length();
		int count=0;
		for(int i=0;i<len-1;i++){
			char a=S.charAt(i);
			char b = S.charAt(i+1);
			if(a=='R' && b=='L'){
				count++;
			}
		}
		return count;
	}
	
}
