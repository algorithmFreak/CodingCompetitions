package com.acc.rahul.topCoder;

public class HappyLetterDiv2 {

	public static char getHappyLetter(String letters){
		StringBuilder sb = new StringBuilder(letters);
		char c1,c2;
		int i=0,j=0;
		while(i<sb.length()){
			j=0;
			while(j<sb.length()){
				 c1 = sb.charAt(i);
				 c2 = sb.charAt(j);
				if(c1!=c2){
					sb.deleteCharAt(j);
					if(i<j)
					sb.deleteCharAt(i);
					else if(i>j){
						sb.deleteCharAt(i-1);
					}
				}else{
					j++;
				}
			}i++;
		}
		
		if(sb.length()>1){
			return sb.charAt(0);
		}
		
		return '.';
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getHappyLetter("aacaaa"));
		System.out.println(getHappyLetter("dcdjx"));
		System.out.println(getHappyLetter("bcbbbbba"));
		System.out.println(getHappyLetter("aabc"));


	}

}
