package com.acc.rahul.topCoder;
public class TheShuttles {

public static void main(String[] args) {
	
		int[] a1 = new int[] {51, 1, 77, 14, 17, 10, 80};
		int[] a2 = new int[] {9,4};
		int[] a3 = new int[] {9};
		
		getLeastCost(a1,32,40);
		getLeastCost(a2,30,5);
		getLeastCost(a2,10,5);
		getLeastCost(a3, 30, 5);
		
	}
	
	public static int getLeastCost(int[] cnt, int baseCost, int seatCost)
	{
		int minSum =0;
		
		for(int x=0;x<cnt.length;x++){
			minSum+=cnt[x]*(baseCost+seatCost);
		}
		
		System.out.println("minSum at 1 seater"+ minSum); 
		
		for(int i=1;i<=100;i++){
			int sum=0;
			for(int j=0;j<cnt.length;j++){
			 //	sum+=((cnt[j]+i-1)/i)*(baseCost+seatCost*i);
				sum+=(Math.ceil((double)cnt[j]/i))*(baseCost+seatCost*i);
 			}
			minSum=Math.min(minSum, sum);
		}
		
	    System.out.println(minSum); 
		return minSum;
	}
	

}
