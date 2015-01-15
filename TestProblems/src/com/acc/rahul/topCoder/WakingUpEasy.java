package com.acc.rahul.topCoder;
public class WakingUpEasy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAlarms(new int[]{42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37,
				  92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36,
				  95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69}, 9999));

	}

	public static int countAlarms(int[] volume, int S){
		int count=0;
		int len=volume.length;
			for(int i=0;S>0;i++){
				S-=volume[i%len];	
				count++;
			}
		return count;
	}
}
