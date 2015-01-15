package com.acc.rahul.topCoder;

public class Target {

	public String[] draw(int n) {
		String[] arr = new String[n];
		StringBuilder sb;
		for (int i = 0; i < n; i++) {
			sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if ((i == 0
						|| j == 0
						|| i == n - 1
						|| j == n - 1
						|| (i % 2 == 0 && j % 2 == 0)
						|| (i % 2 == 0 && j % 2 == 1 && ((j >= i && j <= n - 1-i) || (i >= j && i >= n- 1- j)))
						|| (j % 2 == 0 && i % 2 == 1 && ((j >= i && j >= n - 1-i) || (i >= j && i <= n- 1- j)))
						)) {
					sb.append("#");
				} else if (i % 2 == 1 || j % 2 == 1) {
					sb.append(" ");
				}
			}
			arr[i] = sb.toString();
		}

		for (String s : arr)
			System.out.println(s);
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Target t = new Target();
		t.draw(21);

	}

}
