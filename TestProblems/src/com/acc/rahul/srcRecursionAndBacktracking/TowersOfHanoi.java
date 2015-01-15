package com.acc.rahul.srcRecursionAndBacktracking;

public class TowersOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TowersofHanoi(4, 'A','B','C');

	}

	/**
	 * This method is all about Towers of Hanoi 
	 * 
	 * @param n
	 * @param fromPeg
	 * @param toPeg
	 * @param auxPeg
	 */
	public static void TowersofHanoi(int n, char fromPeg, char toPeg, char auxPeg){
		
		/*If only 1 disk, make the move and return */
		if(n==1){
			System.out.println("Move disk1 from peg "+fromPeg+" to Peg "+toPeg);
			return;
		}
		
		/* Move top n-1 disks from A to B using C as auxiliary*/
		TowersofHanoi(n-1, fromPeg, auxPeg, toPeg);
		
		/* Move remaining disks from A to C */
		System.out.println("Move disk from peg "+fromPeg+" to Peg "+toPeg);
		
		/* Move n-1 disks from B to C using A as auxiliary*/
		TowersofHanoi(n-1, auxPeg, toPeg, fromPeg);
		
	}
	
	
}
