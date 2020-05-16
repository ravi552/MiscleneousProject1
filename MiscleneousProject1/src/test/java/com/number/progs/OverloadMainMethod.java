package com.number.progs;

public class OverloadMainMethod {

	public static void main(String[] args) {
		System.out.println("standard main method");
		main(10);
		main(10,20);
		main("testing");
	}
	public static void main(int a) {
		System.out.println("main with one para");
	}
	public static void main(int a,int b) {
		System.out.println("main with two para");
	}
	public static void main(String args) {
		System.out.println("main with string as para");
	}

}
