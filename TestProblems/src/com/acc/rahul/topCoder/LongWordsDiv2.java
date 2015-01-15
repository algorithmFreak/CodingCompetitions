package com.acc.rahul.topCoder;

public class LongWordsDiv2 {

	
	public String find(String word){
		int[] count = new int[26];
		
		String val1 = "Likes",val2 ="Dislikes";
		char[] arr = word.toCharArray();
		int len = arr.length;
		int[][] track = new int[26][len];
		for(int i=0;i<len-1;i++){
			if(arr[i]==arr[i+1]){
				return val2;
			}
		}
		for(int i=0;i<len;i++){
			int a = String.valueOf(arr[i]).codePointAt(0)-65;
			count[a]+=1;
			track[a][i]=1;
			if(count[a]>=4){
				return val2;
			}
		}
		StringBuilder sb = new StringBuilder(word);
		for(int i=0;i<26;i++){
			if(count[i]==1){
				for(int j=0;j<len;j++){
					if(track[i][j]==1){
						sb.deleteCharAt(j);
					}
				}
			}
		}
		
		System.out.println(sb);  
		return val1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongWordsDiv2 l = new LongWordsDiv2();
		System.out.println(l.find("ABACADA"));
		System.out.println(l.find("ABDCBAC"));
	}

}
