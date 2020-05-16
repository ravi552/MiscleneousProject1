package com.number.progs;

public class SwapTwoIntegerUsingThirdvar {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("value before swap : "+"a->"+a+" b->"+b);
//		a=a+b;//30
//		b=a-b;//10
//		a=a-b;//20
		a=a*b;
		b=a/b;//10
		a=a/b;
		System.out.println("value after swap : "+"a->"+a+" b->"+b);
	}

}
