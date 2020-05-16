package com.string.concepts;

public class PalindromeNo {
	
	public static void main(String[] args) {
		int num=153;
		int rem=0;
		int rev=0;
		int temp=num;
		
		while(temp>0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}
}
