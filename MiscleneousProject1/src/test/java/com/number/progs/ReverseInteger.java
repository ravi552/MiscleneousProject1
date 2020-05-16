package com.number.progs;

public class ReverseInteger {

	public static void main(String[] args) {
		int num= 12345;
		int rem=0;
		int rev=0;
		while(num != 0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		System.out.println("-------------------");
		long num1=123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		StringBuffer sb = new StringBuffer();
	}

}
