package com.acc.rahul.practice;
public class Bridge{
	
	public enum Suits{
		CLUBS(20), DIAMOND(20),HEARTS(30), SPADES(30), NOTRUMP(40);/*{
			public int getValue(int bid){
				return ((bid-1)*30)+40;
			}
		};*/
	Suits(int points){
		this.points = points;
	}
	private int points;
	public int getValue(int bid){
		return points * bid;
	}
	
	}
	
	/*void go(int ouch){
		ouch++;
		for(int ouch=0; ouch<100;ouch++);
	}*/
	
	public static void main(String... args){
		/*System.out.println(Suits.NOTRUMP.getValue(7));
		
		System.out.println(Suits.SPADES+" "+Suits.SPADES.points);
		System.out.println(Suits.values()); 
		System.out.println(Suits.CLUBS.getValue(4)); 
		*/
		
		float f1= 2.3f;
		float[][] f2 ={{42.0f}, {1.7f,2.3f},{2.6f,2.7f}};
		float[] f3={2.7f};
	long x=42L;
		 
	if(f3==f2[2]){
		System.out.println("true");
	}
	}
	
}