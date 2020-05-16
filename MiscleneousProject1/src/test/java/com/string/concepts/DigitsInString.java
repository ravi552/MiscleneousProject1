package com.string.concepts;


public class DigitsInString {
	
	public static void main(String[] args) {
		String str = "GOOD FRIEND45 IS NEEDED ALWAYS96";
		
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				System.out.println(str.charAt(i));
			}
		}
	}
}
