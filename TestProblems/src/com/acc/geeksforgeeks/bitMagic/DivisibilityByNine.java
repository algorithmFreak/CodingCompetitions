package com.acc.geeksforgeeks.bitMagic;

public class DivisibilityByNine {

	public static void main(String[] args) {
		DivisibilityByNine d = new DivisibilityByNine();
		for (int i = 0; i < 100; i++)
			System.out.println(i + " : " + d.checkDivisibilityByNine(i));

	}

	/**
	 * How does this work? 
	 * 
	 * n/9 can be written in terms of n/8 using the
	 * following simple formula.
	 * 
	 * n/9 = n/8 - n/72
	 * 
	 * Since we need to use bitwise operators, we get the value of floor(n/8)
	 * using n>>3 and get value of n%8 using n&7. We need to write above
	 * expression in terms of floor(n/8) and n%8. n/8 is equal to “floor(n/8) +
	 * (n%8)/8″. Let us write the above expression in terms of floor(n/8) and
	 * n%8
	 * 
	 * n/9 = floor(n/8) + (n%8)/8 - [floor(n/8) + (n%8)/8]/9
	 * 
	 * n/9 = floor(n/8) -[floor(n/8) - 9(n%8)/8 + (n%8)/8]/9 n/9
	 *     = floor(n/8) - [floor(n/8) - n%8]/9
	 * 
	 * From above equation, n is a multiple of 9 only if the expression
	 * floor(n/8) – [floor(n/8) - n%8]/9 is an integer. This expression can only
	 * be an integer if the sub-expression [floor(n/8) - n%8]/9 is an integer.
	 * The subexpression can only be an integer if [floor(n/8) - n%8] is a
	 * multiple of 9. So the problem reduces to a smaller value which can be
	 * written in terms of bitwise operators.
	 */
	public boolean checkDivisibilityByNine(int n) {
		if (n == 0 || n == 9) {
			return true;
		}
		if (n < 9) {
			return false;
		}
		// If n is greater than 9, then recur for [floor(n/8)-n%8]
		return checkDivisibilityByNine((int) (n >> 3) - (n & 7));
	}
}
