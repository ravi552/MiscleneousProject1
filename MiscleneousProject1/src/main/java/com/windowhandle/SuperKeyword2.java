package com.windowhandle;

public class SuperKeyword2 {
	
	public void m1() {
		System.out.println("i am in SuperKeyword2 class");
	}
}
class B extends SuperKeyword2{
	public void m1() {
		System.out.println("i am in B class");
	}
	public void show() {
		super.m1();
		m1();
	
	}
	public static void main(String[] args) {
		B ob = new B();
		ob.show();
	}
}