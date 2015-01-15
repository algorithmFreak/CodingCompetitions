package com.acc.rahul.topCoder;
public class MicroStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		MicroStrings m = new MicroStrings();
		System.out.println(m.makeMicroString(12, 5));
		System.out.println(m.makeMicroString(3,2));
		System.out.println(m.makeMicroString(31,40));
		System.out.println(m.makeMicroString(30,6));
	}

	public String makeMicroString(int A, int D){
		StringBuilder sb = new StringBuilder("");
		while(A>=0){
			sb.append(A);
			A=A-D;
		}
		return sb.toString();
	}
	
}
