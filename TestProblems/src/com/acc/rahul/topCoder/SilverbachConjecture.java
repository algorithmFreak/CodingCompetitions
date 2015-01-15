package com.acc.rahul.topCoder;

public class SilverbachConjecture {

	
	public static void main(String[] args) {
		SilverbachConjecture t =  new SilverbachConjecture();
		t.solve(20);
		t.solve(30);
		t.solve(999);
		t.solve(45);
	}

	public int[] solve(int n){
		int[] arr = new int[2];
		int m1,m2;
		if(n%2==0){
			 m1 = n/2;
			 m2 = n/2;
		}else{
			 m1 = n/2;
			 m2 = n-m1;
			while(isPrime(m1)){
				m1--;m2++;
				int temp = m2;
				m2=m1;
				m1=temp;
			}
		}
		arr[0] = m1;
		arr[1] = m2;
		System.out.println(arr[0]+ " "+arr[1]);
		return arr;
	}

	public boolean isPrime(int number) {
		if (number < 2) {
			return false;
		} else if (number == 2)
			return true;
		int count = 0;
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				number = number / i;
				count++;
			}
		}
		return count == 0 ? true : false;
	}
		
		
	
}
