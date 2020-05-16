package com.string.concepts;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str ="A friEND IN NEED is A friend INDEED";
		String stArr[] = str.split(" ");
		
		for(int a=0;a<=stArr.length-1;a++ ) {
			System.out.print(stArr[a]);
		}
		System.out.println();
		for(int k=stArr.length-1; k>=0; k--) {
			System.out.print(stArr[k]+" ");
		}
		System.out.println();
		for(int i=0;i<=stArr.length-1;i++) {
			String s=stArr[i];
			for(int j=s.length()-1;j>=0;j--) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
//		for(String s:stArr) {
//			for(int i=s.length()-1;i>=0;i--) {
//				System.out.print(s.charAt(i));
//			}
//			System.out.print(" ");
//		}
	}

}
