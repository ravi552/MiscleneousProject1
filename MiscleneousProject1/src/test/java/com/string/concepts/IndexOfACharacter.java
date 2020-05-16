package com.string.concepts;

public class IndexOfACharacter {
	public static void main(String[] args) {
		String str ="GooD FRienD45 IS *&!NEEDED #@$ALWAYS96";
		//char ch[]=str.toCharArray();
		int len=str.length();
		int index=0;
		System.out.println(str.indexOf('e'));
		for(int i=0;i<=len-1;i++) {
			if(str.charAt(i) =='i') {
				index= i;
				break;
			}
		}
		System.out.println(index);
	}
}
