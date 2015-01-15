package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BestInternetBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		String website;
		int originalLength = 0;
		int shortLength = 0;
		String[] splittedArr = new String[0];
		String domainName = "";
		Set<Character> vowelSet = new HashSet<Character>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		for (int t = 0; t < T; t++) {
			shortLength = 0;
			website = br.readLine();
			originalLength = website.length();
			
			if (website.startsWith("www.") && website.endsWith(".com")) {
				shortLength =originalLength-4;
				domainName=website.substring(4, shortLength);
			//	System.out.println(domainName);
			}
			//System.out.println(shortLength);
			int len = domainName.length();
			for (int i = 0; i < len; i++) {
				if (vowelSet.contains(domainName.charAt(i))) {
					shortLength--;
				}
			}
			System.out.println(shortLength + "/" + originalLength);
		}
	}
}
