package com.number.progs;

public class PrimeSeries {

	public static void getPrimeNumber(int limit){
		int num=limit;
		for(int i=1; i<=num;i++) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		getPrimeNumber(100);
	}

}
