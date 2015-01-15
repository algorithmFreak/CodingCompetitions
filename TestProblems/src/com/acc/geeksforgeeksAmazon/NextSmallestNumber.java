package com.acc.geeksforgeeksAmazon;

import java.util.Arrays;

public class NextSmallestNumber {

	public static void main(String[] args) {
		String num = "12453";
		char[] arr = num.toCharArray();
		char[] subArr;
		int len =arr.length;
		int i=len-1;
		while(i>0 && arr[i]<=arr[i-1]){
			i--;
		}
		if(i==0){
			System.out.println("-1");
		}else{
			char c=arr[i-1];
			System.out.println(c);
			System.out.println(i); 
			int l = len - i;
			subArr = new char[l];
			for(int j=i,x=0;j<len && x<l;j++,x++){
				subArr[x]=arr[j];
			}
			Arrays.sort(subArr);			
			for(int j=0;j<l;j++){
				if(subArr[j]>c){
					arr[i-1]=subArr[j];
					subArr[j]=c;
					break;
				}
			}
			int j=0;
			while(i<len && j<l){
				arr[i]=subArr[j];
				i++;j++;
			}
			System.out.println();
			for(j=0;j<len;j++){
				System.out.print(arr[j]+" ");
			}
		}

	}

}
