package com.acc.rahul.topCoder;

public class RotateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getRotationDistance("ABACAD", "ADABAC"));
	}

	public static int getRotationDistance(String str1, String str2) {
		int len1, len2;
		len1 = str1.length();
		len2 = str2.length();
		if (len1 == len2) {
			StringBuilder sb1 = new StringBuilder(str1);
			StringBuilder sb2 = new StringBuilder("") ;
			StringBuilder sb3 = new StringBuilder(str1);
			StringBuilder sb4 = new StringBuilder("") ;
			int count1=1,count2=1;		
			for (int i = 0; i<len1; i++) {
				sb2.append(sb1.charAt(len1-1)).append(sb1.substring(0, len1-1));
				sb4.append(sb3.substring(1, len1)).append(sb3.charAt(0));
				if(sb2.toString().equals(str2) || sb4.toString().equals(str2)){
					return Math.min(count1, count2);
				}
				sb1=sb2;
				sb2= new StringBuilder("");
				count1++;
				sb3=sb4;
				sb4= new StringBuilder("");
				count2++;
			}
		}
		return -1;
	}

}
