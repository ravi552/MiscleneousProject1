package com.number.progs;

public class PalindromeSeries {

	public static void main(String[] args) {
		
		int rem=0;
		int rev=0;
		for(int i=1; i<=500; i++) {
			int temp=i;
			
			while(temp>0){
				rem = temp%10;
				rev = rev*10 + rem;
				temp = temp/10;
			}
			//System.out.println("rev->"+rev+" val of i->"+i);
			if(rev == i) {
				System.out.println(i);
			}
			rev=0;
		}
	}

}
