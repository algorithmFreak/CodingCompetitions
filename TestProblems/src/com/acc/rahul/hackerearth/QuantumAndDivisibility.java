package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class QuantumAndDivisibility {

	public static void main(String[] args) throws Exception {
	/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);*/
		String[] arr;
		int a, b, c, d;
		System.out.println(10000000000000000l);
		/*for (int i = 1; i <= T; i++) {
			arr = br.readLine().split("\\s");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			c = Integer.parseInt(arr[2]);
			d = Integer.parseInt(arr[3]);
			if (d == 0 || c == 1 || (a == 1 && c == 1)
					|| (b == 1 && d == 1 && a % c == 0) 
					|| (d==1 && (b * Math.log10(a)%Math.log10(c))==0)
					|| ((b * Math.log10(a) / Math.log10(c)) % d) == 0) {
				System.out.println("Divisible");
			} else {
				System.out.println("Not divisible");
			}
		}*/
		a=4;
		b=6;
		c=2;
		d=4;
		
		if (d == 0 || c == 1 || (a == 1 && c == 1)
				|| (b == 1 && d == 1 && a % c == 0) || (b>=d && a%c==0)
				|| (d==1 && (b * Math.log10(a))%Math.log10(c)==0)
				|| ((b * (Math.log10(a)/Math.log10(c)))%d) == 0) {
			System.out.println("Divisible");
		} else {
			System.out.println("Not divisible");
		}
	}
}
