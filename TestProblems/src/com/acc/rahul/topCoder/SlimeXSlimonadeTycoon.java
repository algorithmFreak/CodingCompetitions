package com.acc.rahul.topCoder;

public class SlimeXSlimonadeTycoon {

	public static void main(String[] args) {
		SlimeXSlimonadeTycoon s = new SlimeXSlimonadeTycoon();
		System.out.println(s.sell(new int[] { 5, 1, 1 }, new int[] { 1, 2, 3 },
				2));

		System.out.println(s.sell(new int[] { 10, 20, 30 }, new int[] { 30, 20,
				10 }, 1));

		System.out.println(s.sell(new int[] { 1, 2, 3, 4, 5 }, new int[] { 5,
				5, 5, 5, 5 }, 5));

		System.out.println(s.sell(new int[] { 10000, 0, 0, 0, 0, 0, 0 },
				new int[] { 1, 2, 4, 8, 16, 32, 64 }, 4));

	}

	public int sell(int[] morning, int[] customers, int stale_limit) {
		int maxCount = 0;
		int len = morning.length;
		for (int i = 0; i < len; i++) {
			int count = 0;
			int j;
			if((j=i-stale_limit+1)<=0){
				j=0;
			}					
			while (j <= i) {
				if (customers[i] > 0) {
					if (customers[i] >= morning[j]) {
						count += morning[j];
						customers[i] -= morning[j];
						morning[j] = 0;
					} else {
						count += customers[i];
						morning[j] -= customers[i];
						customers[i] = 0;
					}
				}
				j++;
			}
			maxCount += count;
		}
		return maxCount;
	}

}
