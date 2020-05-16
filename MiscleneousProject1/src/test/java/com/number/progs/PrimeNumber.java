package com.number.progs;

public class PrimeNumber {
	
	//static int flag=0;
	public static boolean getPrimeNumber(int num){
		if(num==0)
			return false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void primeSeries(int num) {
		for(int i=2;i<=num;i++) {
			if(getPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		//getPrimeNumber(0);
		//System.out.println("0 is prime no :"+getPrimeNumber(0));
		System.out.println("2 is prime no :"+getPrimeNumber(2));
		primeSeries(20);
	}

}
