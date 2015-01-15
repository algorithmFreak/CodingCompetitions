package com.acc.rahul.topCoder;

public class NumberOfParticularDigit {

	private int digit;

	public int count(int num) {
		int[] array = new int[10];
		int length = 0;
		int total = 0;

		int i = 0;
		while (num > 0) {
			array[i] = num % 10;
			num /= 10;
			i++;
		}
		length = i;
		i--;

		while (i > 0) {
			total += count2InBase10(i) * array[i];
			if (array[i] > 2) {
				// to add the 10 power i occurrence of that digit.
				total += (int) Math.pow(10, i);
			} else if (array[i] == 2) {
				int j = i - 1;
				total++;
				while (j >= 0) {
					total += array[j] * (int) Math.pow(10, j);
					j--;
				}
			}
			i--;
		}
		if (array[0] >= 2)
			total++;
		return total;
	}

	private int count2InBase10(int index) {
		return index * (int) Math.pow(10, index - 1);
	}

	public static void main(String args[]) {
		NumberOfParticularDigit n = new NumberOfParticularDigit();
		n.digit = 2;
		System.out.println(n.count(300));
	}
}
