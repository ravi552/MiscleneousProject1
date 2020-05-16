package com.number.progs;

public class SwapTwoIntegersWithoutThirdVar {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp=0;
		System.out.println("value before swap : "+"a->"+a+" b->"+b);

		temp = a;
		a = b;
		b = a; 
		System.out.println("value after swap : "+"a->"+a+" b->"+b);
		//without using third variable
		String s1 = "java";
		String s2 = "selenium";
		System.out.println("value before swap : "+"s1->"+s1+" s2->"+s2);
		s1=s1+s2;//javaselenium
		s2=s1.substring(0, s1.length()-s2.length());//java
		s1=s1.substring(s2.length());
		
		System.out.println("value after swap : "+"s1->"+s1+" s2->"+s2);

	}
}
