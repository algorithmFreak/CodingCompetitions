package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubsetXOR {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int noOfElements = 0;
		String[] elements;
		for (int t = 0; t < T; t++) {
			noOfElements = Integer.parseInt(br.readLine().trim());
			elements = br.readLine().split("\\s");
			/*
			 * The total numbers of subsets except null set will be
			 * ((2^noOfElements) -1). Also the occurrence of each digit is
			 * 2^(noOfElemets-1). XOR of same number even times results in zero.
			 * SO, no need to process this. We know that output is going to be
			 * always zero.
			 */if (elements.length > 1) {
				System.out.println("0");
			}else{
				// missed this case, if only one element is there.
				System.out.println(elements[0]);
			}
		}
	}

}
