package com.acc.rahul.topCoder;

public class WritingWords {
	
	public int write(String word){
		int count=0,len=word.length();
		for(int i=0;i<len;i++){
			char c = word.charAt(i);
			int a =Integer.valueOf(c)-64;
			count+=a;
		}
		System.out.println(count);
		return count;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WritingWords w = new WritingWords();
		w.write("VAMOSGIMNASIA");
		w.write("TOPCODER");
		w.write("SINGLEROUNDMATCH");
		w.write("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		w.write("");
	}
}
