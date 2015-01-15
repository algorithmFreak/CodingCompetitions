package com.acc.rahul.topCoder;



public class DivideByZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DivideByZero z = new DivideByZero();
		System.out.println(z.CountNumbers(new int[]{9, 2}));
		System.out.println(z.CountNumbers(new int[]{8, 2}));
		System.out.println(z.CountNumbers(new int[]{50}));
		System.out.println(z.CountNumbers(new int[]{1, 5, 8, 30, 15, 4}));
		System.out.println(z.CountNumbers(new int[]{1, 2, 4, 8, 16, 32, 64}));
		System.out.println(z.CountNumbers(new int[]{6, 2, 18}));
	}

	public int CountNumbers(int[] numbers){		
		int count=numbers.length;
		
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				int a = numbers[i], b = numbers[j],div=0;
				if(a>b){
					div=a/b;
				}else if(a<b){
					div=b/a;
				}
				
			if(div!=0 && !contains(numbers,div)){
				count++;
				numbers=createNew(numbers,count);
				numbers[count-1]=div;
			}
			}
		}
		return count;
	}
	
	public boolean contains(int[] numbers, int num){
		for(int i:numbers){
			if(i==num){
				return true;
			}
		}
		return false;
	}
	
	public int[] createNew(int[] numbers, int count){
		int[] arr = new int[count];
		int length = numbers.length;
		for(int i=0;i<length;i++){
			arr[i]=numbers[i];
		}
		return arr;
	}
	
}
