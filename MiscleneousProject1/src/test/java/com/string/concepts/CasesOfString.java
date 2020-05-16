package com.string.concepts;

public class CasesOfString {
	public static void main(String[] args) {
		String str ="GooD FRienD45 IS *&!NEEDED #@$ALWAYS96";
		char ch[]=str.toCharArray();
		int len=ch.length;
		String lcase="";
		int lcasenum=0;
		String ucase="";
		int ucasenum=0;
		String splchar="";
		int splcharnum=0;
		String nums="";
		int spacecount=0;
		//for(int i=0;i<=len-1;i++) {
		for(char i:ch) {
			//System.out.print(ch[i]+" ");
			if(Character.isLowerCase(i)) {
				lcase=lcase+i;
				lcasenum++;
			}
			else if(Character.isUpperCase(i)) {
				ucase=ucase+i;
				ucasenum++;
			}
			else if(Character.isDigit(i)) {
				nums= nums+i;
			}
			else if(Character.isWhitespace(i)) {
				spacecount++;
			}
			else {
				splchar=splchar+i;
				splcharnum++;
			}
		}
		System.out.println(lcase+"-- Total count ->"+lcasenum);
		System.out.println(ucase+"-- Total count ->"+ucasenum);
		System.out.println(nums);
		System.out.println(splchar+"-- Total count ->"+splcharnum);
		System.out.println(spacecount);
	}
}
