package com.acc.rahul.topCoder;

public class CatchTheBeatEasy {

	public static String ableToCatchAll(int[] x, int[] y) {
		int len = x.length;
		int jprev = -1;
		int diff = 0;

		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j < len; j++) {
				if (i == y[j]) {
					if (jprev != -1) {
						diff += Math.abs(x[j] - x[jprev]);
					} else {
						diff += Math.abs(x[j]);
					}
					jprev = j;
					if (diff > y[j]) {
						return "Not able to catch";
					}
				}

			}
		}
		return "Able to catch";

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ableToCatchAll(new int[]{-1, 1, 0}
		, new int[]{1, 3, 4}  ));

		System.out.println(ableToCatchAll(new int[]{-3} , new int[]{2} ));

		System.out.println(ableToCatchAll(new int[]{-1, 1, 0} , new int[]{1, 2, 4} ));

		System.out.println(ableToCatchAll(new int[]{0, -1, 1} , new int[] {9, 1, 3}));

		System.out.println(ableToCatchAll(new int[]{70,-108,52,-70,84,-29,66,-33} , new int[]{141,299,402,280,28,363,427,232} ));

		System.out.println(ableToCatchAll(new int[]{-175,-28,-207,-29,-43,-183,-175,-112,-183,-31,-25,-66,-114,-116,-66} , new int[] {320,107,379,72,126,445,318,255,445,62,52,184,247,245,185} ));
	
		System.out.println(ableToCatchAll(new int[]{0,0,0,0} , new int[]{0,0,0,0} ));
	}

}
