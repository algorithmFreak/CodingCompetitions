package com.acc.rahul.topCoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class EmoticonsDiv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmoticonsDiv2 a = new EmoticonsDiv2();
		System.out.println(a.printSmiles(2));
		System.out.println(a.printSmiles(11));
		System.out.println(a.printSmiles(16));
		System.out.println(a.printSmiles(1000));
	}

	public int printSmiles(int smiles){
		Map<Integer, Integer>  map = primeFactor(smiles);
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
		int sum =0;
		while(itr.hasNext()){
			Entry<Integer, Integer> ent = itr.next();
			int key =ent.getKey();
			int val = ent.getValue();
			sum+= key*val;
		}
		return sum;
	}
		
	

public Map<Integer, Integer> primeFactor(int number){
	Map<Integer,Integer> primeFactors = new HashMap<Integer,Integer>();
	for(int i = 2; i <= number; i++){ 
		if(number % i == 0) { 
			int count = 0; 
			while(number % i == 0) {
				number = number / i; count++; 
				}
			primeFactors.put(i, count);
			}
		}
	
	return primeFactors;
}
	
}
