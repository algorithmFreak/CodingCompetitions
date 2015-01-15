package com.acc.rahul.topCoder;
public class MergeStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeStrings m = new MergeStrings();
		System.out.println(m.getmin("WHAT?", "THE", "WA"));
		System.out.println(m.getmin("??CC??", "ABC", "BCC"));
		 
		 System.out.println(m.getmin("PARROT", "PARROT", ""));
		 System.out.println(m.getmin("???????????", "AZZAA", "AZAZZA"));

		 System.out.println(m.getmin("????K??????????????D???K???K????????K?????K???????",
		 "KKKKKDKKKDKKDDKDDDKDKK", "KDKDDKKKDDKDDKKKDKDKKDDDDDDD"));

	}

	public String getmin(String S, String A, String B) {
		int Slen = S.length();

		if (A.length() + B.length() == Slen) {
			StringBuilder sbS = new StringBuilder(S);
			StringBuilder sbA = new StringBuilder(A);
			StringBuilder sbB = new StringBuilder(B);
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < Slen; i++) {
				char c = sbS.charAt(i);

				if (c == '?') {
					char a, b;
					if (sbA.length() == 0) {
						b = sbB.charAt(0);
						sb.append(b);
						sbB.deleteCharAt(0);
					} else if (sbB.length() == 0) {
						a = sbA.charAt(0);
						sb.append(a);
						sbA.deleteCharAt(0);
					} else if (sbA.length() > 0 && sbB.length() > 0) {
						a = sbA.charAt(0);
						b = sbB.charAt(0);
						if (a < b) {
							sb.append(a);
							sbA.deleteCharAt(0);
						} else {
							sb.append(b);
							sbB.deleteCharAt(0);
						}
					}

				} else {
					sb.append(c);
					if (!deleteChar(sbA, c) && !deleteChar(sbB, c)) {
						return "";
					}
				}
			}

			return sb.toString();
		} else {
			return "";
		}
	}

	private boolean deleteChar(StringBuilder sb, char c) {
		if(sb.length()>0 && sb.charAt(0)==c){
			sb.deleteCharAt(0);
			return true;
		}
		
		return false;

	}
}
