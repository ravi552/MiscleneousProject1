package com.string.concepts;

public class CharReplaceinString {

	public static void main(String[] args) {
		String str = "GOOD FRIEND IS NEEDED ALWAYS";
//		System.out.println(str.replace("E", "X"));
//		System.out.println(str.replaceAll("A", "YZ"));
		String s="";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='E') {
				s=s+'x';
			}else if(str.charAt(i)=='A') {
				s=s+"ay";
			}
			else {
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
	}
}
