package com.string.concepts;

public class LargestWordInString {
	public static void main(String[] args) {
		String string ="A friEND IN NEED is A friend INDEED";
		String strArr[] = string.split(" ");
		String largest=" ";
		//System.out.println("larg->"+largest);
		
		for(int i=0;i<=strArr.length-1;i++) {
			String s=strArr[i];
			//System.out.println("length of s->"+s.length());
			//System.out.println("s->"+s);
			//System.out.println("largest length->"+largest);
			if(largest.length() < s.length()) {
				largest=s;
				//System.out.println("largest->"+largest);
			}
		}
		System.out.println(largest);
	}
	
	
}
