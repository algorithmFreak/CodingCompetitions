package com.acc.rahul.topCoder;
public class ErasingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input1 = "cieeilll";
		String input2 = "topcoder";
		String input3 = "abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba";
		String input4 = "bacaabaccbaaccabbcabbacabcbba";
		String input5 = "eel";
		String s =simulate(input1);
		System.out.println(s); 
		 s =simulate(input2);
		System.out.println(s); 
		 s =simulate(input3);
		System.out.println(s); 
		 s =simulate(input4);
		System.out.println(s); 
		 s =simulate(input5);
		System.out.println(s); 
		 
	}
	

	public static String simulate(String s){
		String opString=s; 
		int i=0;
		while(i<opString.length()-1){
			StringBuilder str = new StringBuilder("");
			char s1=opString.charAt(i);
			char s2= opString.charAt(i+1);
			
			if(i>0){
				String prefixStr = opString.substring(0,i);
				str.append(prefixStr);
				}
			String suffixStr = opString.substring(i+2);
			if(s1!=s2){
				str.append(s1);
				str.append(s2);
				i++;
			}else{
				i=0;
			}
			str.append(suffixStr);			
			opString = str.toString();
		}
		return opString;
	}
	
}
