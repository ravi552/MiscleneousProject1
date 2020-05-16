package com.number.progs;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void findPalindrome(int num) {
		System.out.println("The given number is :"+num);
		
		int reminder=0;
		int reverse=0;
		int temp=num;
		
		while(temp>0) {
			reminder = temp%10;
			reverse = reverse*10 + reminder;
			temp =temp/10;
		}
		if(reverse==num) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
	}

	public static void main(String[] args) {
		findPalindrome(151);
		findPalindrome(10);
		findPalindrome(12345);
		findPalindrome(7887);
		findPalindrome(1);
		findPalindrome(0);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number ::");
//		int number=sc.nextInt();
		
	}

}
