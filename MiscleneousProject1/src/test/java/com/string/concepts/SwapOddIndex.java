package com.string.concepts;

public class SwapOddIndex {

	public static void main(String[] args) {
		String str ="hindustan";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			//System.out.print(str.charAt(i));
			if(i%2==1) {
				rev=rev+str.charAt(i);
			}
			else {
				rev=rev+str.charAt(i);
			}
		}
		
		System.out.println(rev);
	}

}
