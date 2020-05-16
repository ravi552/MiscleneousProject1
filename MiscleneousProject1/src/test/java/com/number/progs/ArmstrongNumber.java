package com.number.progs;

public class ArmstrongNumber {
	static int rem,res,temp; 
	
	public static void findArmStrongNumber(int num) {
		System.out.println("The given number is :"+num);
		 temp=num;
		while(temp>0) {
			rem=temp%10;
			res=res+(rem*rem*rem);
			temp=temp/10;
		}
		if(res==num) {
			System.out.println(num+" is ArmStromg");
		}
		else {
			System.out.println(num+" is not ArmStromg");
		}
	}
	public static void main(String[] args) {
		findArmStrongNumber(153);
	}

}
