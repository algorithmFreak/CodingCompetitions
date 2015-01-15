package com.acc.geeksforgeeksAmazon;

public class NextSmallestPalindrome {

	public static void main(String[] args) {
		short[] num = new short[] {2,3,4,5,1,5,4,3,2};
		int n = num.length;
		int i,j,m=n/2;
		if (n % 2 == 0) {
			i=m-1;
			j=m;
		} else {
			i=m-1;
			j=m+1;
		}
		System.out.println(num[i]+" "+num[j]);
		
		while(i>=0 && j<n && num[i]==num[j]){
			i--;j++;
		}
	
		System.out.println(i+" "+j);
		
		if(i<0 && j>=n){
			System.out.println(i+" "+j);
			if(num[m]<9){
				num[m]+=1;
			}else{
				num[m]=0;
				while(m>=0){
					
				}
			}
		}
		
	}

}
