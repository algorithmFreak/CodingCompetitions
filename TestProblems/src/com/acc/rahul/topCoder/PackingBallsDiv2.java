package com.acc.rahul.topCoder;
public class PackingBallsDiv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PackingBallsDiv2 p= new PackingBallsDiv2();
		p.minPacks(4,2,4);
		p.minPacks(1, 7,1);
		p.minPacks(2,3,5);
		p.minPacks(78,53,64);
		p.minPacks(100, 100, 100);
	}

	public int minPacks(int R, int G, int B){
		int rq=R/3;
		int gq=G/3;
		int bq=B/3;
	    int	count=rq+gq+bq;
		int rr=R%3;
		int gr=G%3;
		int br=B%3; 
		while(rr>0 || gr>0 || br>0){
			rr--;gr--;br--;
			count++;
		}
		return count;
	}
	
}
