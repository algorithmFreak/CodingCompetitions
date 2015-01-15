package com.acc.rahul.topCoder;

public class MagicalStringDiv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MagicalStringDiv2 m= new MagicalStringDiv2();
		m.minimalMoves(">><<><");
		m.minimalMoves(">>>><<<<");
		m.minimalMoves("<<>>");
		m.minimalMoves("<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><");
	
	}

	public int minimalMoves(String S){
		int count=0;
		int length = S.length();
		for(int i=0;i<length/2;i++){
			char c = S.charAt(i);
			if(c!='>')
				count++;			
		}
		for(int i=length/2;i<length;i++){
			char c = S.charAt(i);
			if(c!='<')
				count++;
		}
		System.out.println(count); 
		return count;
	}
	
}
