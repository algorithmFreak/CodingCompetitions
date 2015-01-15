package com.acc.rahul.topCoder;
public class TaroString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TaroString t = new TaroString();
		String S1 = "XCYAZTX";
		String S2 = "CTA";
		String S3 = "ACBBAT";
		String S4 = "SGHDJHFIOPUFUHCHIOJBHAUINUIT";
		String S5 = "CCCATT";
		System.out.println(t.getAnswer(S1));
		System.out.println(t.getAnswer(S2));
	System.out.println(t.getAnswer(S3));
		System.out.println(t.getAnswer(S4));
		System.out.println(t.getAnswer(S5));
	}

	public String getAnswer(String S){
		int i=0;
		while(i<S.length()){
			char c = S.charAt(i);
			if(c!='C' && c!='A' && c!='T'){
				S=S.replaceAll(new Character(c).toString(), "");
			}
			else{
				i++;
			}
		}
		if(S.equals("CAT")){
			return "Possible";
		}
		
		return "Impossible";
	}
}
