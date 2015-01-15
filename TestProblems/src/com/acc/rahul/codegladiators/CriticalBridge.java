package com.acc.rahul.codegladiators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriticalBridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		String string1 = sc.next();
		
		System.out.println(t);
		System.out.println(string1);
		string1 = "({A,B,C,D,E},{(A,B),(B,C),(C,A),(E,D),(D,A)})";
		List<Character> listNodes = new ArrayList<Character>();
		int len = string1.length();
		for(int i=0;i<len;i++){
			if(string1.charAt(i))
		}
		
		/*String[] arr= string1.split("({*})");
		for(String x : arr){
			System.out.println(x); 
		}*/
		
	}

	public static String criticalBridges(int input1, String input2) {

		return null;
	}

}
