package com.number.progs;

public class StringPalindrome {
	static String rv="";

	public static void getStringPalindrome(String str) {
		System.out.println("The given string :"+str);
		for(int i=str.length()-1;i>=0;i--) {
			rv = rv+str.charAt(i);
		}
		//System.out.println("the val :"+st);
		if(str.equals(rv)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+"-> is not palindrome");
		}

	}
	public static void main(String[] args) {
//		getStringPalindrome("ASSA");
//		getStringPalindrome("ASS");
//		getStringPalindrome("MALAYALAM");
		getStringPalindrome("TATA");
//		getStringPalindrome("TEET");

	}

}
