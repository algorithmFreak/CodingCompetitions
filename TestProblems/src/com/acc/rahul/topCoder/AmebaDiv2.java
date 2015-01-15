package com.acc.rahul.topCoder;
public class AmebaDiv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		AmebaDiv2 a = new AmebaDiv2();
		System.out.println(a.simulate(new int[]{2,1,3,1,2}, 1));
		System.out.println(a.simulate(new int[]{1,4,9,16,25,36,49}, 10));
		System.out.println(a.simulate(new int[]{817,832,817,832,126,817,63,63,126,817,832,287,823,817,574}, 63));
		System.out.println(a.simulate(new int[]{1,2,4,8,16,32,64,128,256,1024,2048}, 1));

	}
	
	public int simulate(int[] X, int A){
		int size=A;;
		for(int x:X){
			if(size==x){
				size*=2;
			}else
				continue;
		}
		return size;
	}

}
