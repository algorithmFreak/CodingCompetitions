package com.acc.rahul.practice;
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		System.out.println(p.longestPalindrome("abcdeffedc"));

		p.palindromeCount("abcdeed");
	}

	public void palindromeCount(String s) {
		int len = s.length();
		int count = 1;

		int i = 1;
		while (i < len - 1) {
			for (int j = 1; j <= Math.min(i, len - i - 1); j++) {
				if (s.charAt(i + j) == s.charAt(i - j)) {
					count += 2;
				}
			}
			i++;
		}
		i=1;
		int count2=0;
		while (i < len - 1) {
			for (int j = 1; j <= Math.min(i, len - i - 1); j++) {
				System.out.println(s.charAt(i-j) +" "+s.charAt(i)+ " "+ s.charAt(i+j));
				if (s.charAt(i) == s.charAt(i - j) || s.charAt(i)==s.charAt(i+j)){
					count2 += 2;
				}
			}
			i++;
		}

		System.out.println(count);
		System.out.println(count2);
	}

	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}

		if (s.length() == 1) {
			return s;
		}

		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {

			String tmp = findLongest(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			tmp = findLongest(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}

		return longest;
	}

	public String findLongest(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1
				&& s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}

}
