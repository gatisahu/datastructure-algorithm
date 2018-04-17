package com.gati.dsalgo.string;

public class StringReverse {

	public static void main(String[] args) {
		//System.out.println(reverse("WORLD"));
		reverse("WORLD",0);
	}

	public static StringBuilder reverse(String str) {
		if (str ==null ||str.length()==0) {
			return new StringBuilder() ;
		}
		char c=str.charAt(0);
		StringBuilder builder=reverse(str.substring(1));
		return builder.append(c);
	}
	public static void reverse(String str,int i) {
		if (i==str.length()) {
			return;
		}
		int j=i+1;
		reverse(str,j);
		System.out.println(str.charAt(i));
	}
}
