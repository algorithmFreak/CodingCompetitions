package com.acc.rahul.practice;
import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Queue input= new PriorityQueue();
		String s = in.readLine();
		while (s != null && !s.isEmpty()){

			// Store line in some internal datastructure
			s = in.readLine();
			System.out.println(s);
			String[] indString = s.split(",");
			for (String s1 : indString) {
				System.out.println(s1);
				input.add(s1);
			}
		}
		System.out.println("out of while loop");
		
		
		/*String[] indString = s.split(",");
		for (String s1 : indString) {
			System.out.println(s1);
		}*/
		
		// Do some work

		// Output using System.out.println();
	}
}

class Node {
	boolean massFlag = false;
	boolean scaleFlag = false;
	int mass;
	String scaleName;
	Node left, right;
}
/*
Node root = new Node();
root.scaleName = indString[0];
try {
	root.left = new Node();
	int mass = Integer.parseInt(indString[1]);
	root.left.massFlag = true;
	root.left.mass = mass;

} catch (NumberFormatException e) {
	// e.printStackTrace();
	root.left.scaleFlag = true;
	root.left.scaleName = indString[1];
}
*/