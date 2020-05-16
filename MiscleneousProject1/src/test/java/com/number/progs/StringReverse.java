package com.number.progs;

public class StringReverse {

	public static void main(String[] args) {
		String str= "SELENIUM";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			//
			rev=rev+str.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);
		System.out.println("-----------------------------------");
		//String doesnt have reverse fuction StringBuffer has
		//StringBuffer is mutable, String is immutable 
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
