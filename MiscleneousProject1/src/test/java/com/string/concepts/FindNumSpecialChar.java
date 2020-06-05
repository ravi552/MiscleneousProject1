package com.string.concepts;

public class FindNumSpecialChar {

	public static void main(String[] args) {
		String str = "abASDF123 4#$@*&0836 sgdjs1345*4%$#@!&*";
		char ch[] = str.toCharArray();
		int charCount=0;  String alphabet="";
		int NumCount=0;		String number="";
		int spaceCount=0;	String splchar="";
		int spclCount=0;
		//for(char c:ch) {
		for(int i=0;i<=ch.length-1;i++) {
			if(Character.isAlphabetic(ch[i])) {
				charCount++;
				alphabet=alphabet+ch[i];
			}else if(Character.isDigit(ch[i])) {
				NumCount++;
				number = number+ch[i];
			}else if(Character.isWhitespace(ch[i])) {
				spaceCount++;
			}else {
				spclCount++;
				splchar=splchar+ch[i];
			}
		}
		
		System.out.println("Total alphabet :"+charCount+" :"+alphabet);
		System.out.println("Total digit :"+NumCount+" :"+number);
		System.out.println("Total spaces :"+spaceCount);
		System.out.println("Total special chars :"+spclCount+" :"+splchar);
		
	}

}
