package com.number.progs;

public class Factorial {
	static int fact=1; 
	public static int getFactorial(int num) {
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		//System.out.println(fact);
		return fact;
	}
		// with recursive function

	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return (num*fact(num-1));
	}
	
	public static void main(String[] args) {
		//getFactorial(0);
		System.out.println(getFactorial(0));
		System.out.println(fact(0));
	}

}
