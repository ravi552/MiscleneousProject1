package com.windowhandle;

public class UseOfThis {
	int i;
	
	public UseOfThis(int i) {
		i=i;
		//this.i=i;
	}
	public void display() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		UseOfThis ob = new UseOfThis(10);
		ob.display();
	}

}
