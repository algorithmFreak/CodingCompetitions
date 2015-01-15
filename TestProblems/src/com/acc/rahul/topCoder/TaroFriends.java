
package com.acc.rahul.topCoder;


public class TaroFriends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TaroFriends t = new TaroFriends();
		int[] a = new int[]{-3, 0, 1};
		int[] b = new int[]{4, 7, -7};
		int[] c = new int[]{-100000000, 100000000};
		int[] d = new int[]{3, 7, 4, 6, -10, 7, 10, 9, -5};
		int[] e = new int[]{-4, 0, 4, 0};
		int[] f = new int[]{7};
		t.getNumber(a, 3);
		t.getNumber(b, 5);
		t.getNumber(c, 100000000);
		t.getNumber(d, 7);
		t.getNumber(e, 4);
		t.getNumber(f, 0);
	}

	public int getNumber(int[] coordinates, int X){
		int len=coordinates.length;
		for(int i=0;i<len;i++){
			int a= coordinates[i];
			if(a>=0){
				a=a-X;
			}else
				a=a+X;
			coordinates[i]=a;
		}
		int max,min;
		max=min=coordinates[0];
		for(int i=1;i<len;i++){
			max=Math.max(max,coordinates[i]);
			min=Math.min(min,coordinates[i]);		
		}
		System.out.println(max-min);
		return max-min;
	}
}
