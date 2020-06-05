package com.number.progs;

public class AddStringNumber {

	public static void main(String[] args) {
		String num="23546";
		int numb=Integer.parseInt(num);
		System.out.println(numb);
		int sum=0;
		int rem=0;
		while(numb>0) {
			rem=numb%10;
			sum=sum+rem;
			numb=numb/10;
		}
		System.out.println(sum);
	}
}
