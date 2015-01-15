package com.acc.rahul.topCoder;
public class BigFatInteger2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isDivisible(6,1,2,1));
		System.out.println(isDivisible(2,1,6,1));
		System.out.println(isDivisible(1000000000,1000000000,1000000000,200000000));
		System.out.println(isDivisible(8,100,4,200));
		System.out.println(isDivisible(999999937,1000000000,999999929,1));
		System.out.println(isDivisible(2,2,4,1));
	}
	
	
	public static String isDivisible(int A, int B, int C, int D)
	{
		if(B==1 && D==1){
			if(A%C==0){
				return "divisible";
			}
		}
		
		/*else if(B==1){
			while(A>0){
			if(A%C!=0){
				A=A/C;
			}
			else
				return "divisible";
			}
		}
		
		else if(D==1){
			while(A>0){
			if(A%C!=0){
				A=A/C;
			}else
				return "divisible";
			}
		}*/
	
		else if(B>=D && A>C){
			while(A>0){
			if(A%C!=0){
				A=A/C;
			}
			else
				return "divisible";
			}
		}
		
		else if(B>=D && A<C){
			while(A>0){
			if(A%C!=0){
				A=A/C;
			}
			else
				return "divisible";
			}
		}
		
		else if(B<D ){
			while(A>0){
			if(A%C!=0){
				A=A/C;
			}
			else
				return "divisible";	
		}
		}

		
		
		return "not divisible";
	}
}
