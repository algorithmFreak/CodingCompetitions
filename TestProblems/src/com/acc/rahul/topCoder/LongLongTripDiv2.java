package com.acc.rahul.topCoder;
public class LongLongTripDiv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LongLongTripDiv2 l = new LongLongTripDiv2();
		System.out.println(l.isAble(10, 6, 3));
		System.out.println(l.isAble(10, 5, 3));
		System.out.println(l.isAble(50, 100, 2));
		System.out.println(l.isAble(120,10,11));
		System.out.println(l.isAble(10, 10, 9999));
		System.out.println(l.isAble(1000,100,10));
		System.out.println(l.isAble(1000010000100001L, 1100011, 1000000000));
	}

	public String isAble(long D, int T, int B) {
		String res = "impossible";
		if (D < T) {
			return res;
		}else{
			for(int i=0;i<=T;i++){
				if((long)i*B + (T-i)==D){
					return "possible";
				}
			}
		}
		return res;
	}
}
