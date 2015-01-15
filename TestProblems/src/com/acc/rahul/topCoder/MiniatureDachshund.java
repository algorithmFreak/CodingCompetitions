package com.acc.rahul.topCoder;

import java.util.Arrays;


public class MiniatureDachshund {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = new int[]{100, 100, 100, 100, 100}; 
		int weight1 = 4750;
		System.out.println(maxMikan(arr1,weight1));
		
		int[] arr2 = new int[]{100, 100, 100, 100, 50}; 
		int weight2 = 4750;
		System.out.println(maxMikan(arr2,weight2));
		
		int[] arr3 = new int[]{120, 90, 130, 100, 110, 80}; 
		int weight3 = 3000;
		System.out.println(maxMikan(arr3,weight3));
		
		int[] arr4 = new int[]{50}; 
		int weight4 = 5000;
		System.out.println(maxMikan(arr4,weight4));
		
		int[] arr5 = new int[]{200, 50, 200, 50, 200, 50, 200, 50}; 
		int weight5 = 4800;
		System.out.println(maxMikan(arr5,weight5));

	}

	public static int maxMikan(int[] mikan, int weight){
	int count=0,sum=0;
	int diff=5000-weight;
	//System.out.println(diff);
	Arrays.sort(mikan);
	for(int x:mikan){
	//	System.out.print(x+",");
	}
	
	for(int x:mikan){
		if((weight+=x)<=5000){
			count++;
		}
	}
	
	/*for(int x:mikan){
		
	//	System.out.println(x);
		if(sum>=diff){
			break;
		}
		count++;
		sum=sum+x;
		//diff=diff-sum;
		
		
	}*/
	
	
	
	return count;
	}
	
}
