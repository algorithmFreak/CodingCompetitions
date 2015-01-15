
package com.acc.rahul.topCoder;
public class OneDimensionalRobotEasy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OneDimensionalRobotEasy one = new OneDimensionalRobotEasy();
		System.out.println(one.finalPosition("RRLRRLLR", 10, 10));
		System.out.println(one.finalPosition("RRRRR", 3, 4));
		System.out.println(one.finalPosition("LLLLLLLLLLR", 2, 6));
		System.out.println(one.finalPosition("RRRRRRRLRRLRRRRRRRRRRRRLRLRRRRRRRRLRRRRRLRRRRRRRRR", 5, 20));
		System.out.println(one.finalPosition("RLRLLLLLLLRLLLRLLLLLLLLRLLLLLRLLLRRLLLLLRLLLLLRLLL", 34, 15));
		
		

	}

	public int finalPosition(String commands, int A, int B) {
		int x = 0;
		for (int i = 0; i < commands.length(); i++) {
			char c = commands.charAt(i); 
			if (c == 'R' && x < B) 			
				x++;
			 else if (c == 'L' && x > -A) 
				x--;
		}
		return x;
	}

}
