package com.string.concepts;

public class SumOfDigitsInString {
	public static void main(String[] args) {
		String str = "GOOD FRIEND45 IS NEEDED ALWAYS96";
		int sum=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				System.out.println(str.charAt(i));
				String str1=" "+str.charAt(i);
				int val=Integer.parseInt(str1);
				sum=sum+val;
				System.out.println("summation is :"+sum);
			}
		}
	}
}
