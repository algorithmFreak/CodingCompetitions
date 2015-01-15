package com.acc.rahul.srcHashing;

import java.util.Arrays;

public class ArrayOperations {

	/**
	 * This method removes the duplicate from an array.
	 * The idea is to replace the duplicate character with null character.
	 * @param s
	 */
	public void removeDuplicatesOne(char[] s){
		int size = s.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(s[i]==s[j]){
					s[j]='\0';
				}
			}
		}
		for(char c:s){
			System.out.print(c+"--");
		}
	}
	
	/**
	 * This method removes the duplicates characters from a string.
	 * @param s
	 * @return
	 */
	public String removeDuplicatesTwo(String s){
		int size =s.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<size;i++){
			String sub = s.substring(i, i+1);
			if(sb.indexOf(sub)==-1){
				sb.append(sub);
			}				
		}
		return sb.toString();
	}
	
	
	public String removeDuplicatesThree(String s){
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return removeDuplicatesTwo(new String(chars));
	}
	
	public void removeDuplicatesUsingHashTable(char[] s){
		HashTable h = HashTableOperations.createHashTable(30);
		for(int i=0,j=0;i<s.length;i++){
			if(!HashTableOperations.hashSearch(h,s[i])){
				h= HashTableOperations.hashInsert(h, s[i]); 
			}
		}
		HashTableOperations.printHashTable(h);
	}
	
	
	public static void main(String... args) {
		ArrayOperations h = new ArrayOperations();
		char[] chars = new char[]{'a','b','a','d','d','a','b'};
	//	h.removeDuplicatesOne(chars);
		String s = "addbcdddccbba";
		System.out.println("\n"+ h.removeDuplicatesTwo(s));
		System.out.println("\n"+ h.removeDuplicatesThree(s)); 
		h.removeDuplicatesUsingHashTable(chars);
		
	}
}
