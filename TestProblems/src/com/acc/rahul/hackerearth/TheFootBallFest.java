package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheFootBallFest {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int N, init;
		Node current;
		String[] strArr;
		for(int t=1;t<=T;t++){
			strArr = br.readLine().split("\\s");
			N=Integer.parseInt(strArr[0]);
			init=Integer.parseInt(strArr[1]);
		    current=new Node();
			current.data=init;
			current.previous=null;
			
			for(int n=1;n<=N;n++){
			strArr = br.readLine().split("\\s");
			if(strArr[0].equals("P")){
				Node node = new Node();
				node.data=Integer.parseInt(strArr[1]);
				node.previous=current;
				current=node;
			}else{
				current.previous.previous=current;
				current=current.previous;
			}
			}
			System.out.println("Player "+current.data);
		}

	}
	
}

class Node{
	int data;
	Node previous;
}
