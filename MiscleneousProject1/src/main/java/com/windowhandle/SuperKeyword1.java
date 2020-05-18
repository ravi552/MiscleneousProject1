package com.windowhandle;

public class SuperKeyword1 {
	int i=10;
}

class SubSuper extends SuperKeyword1{
	int i=20;
	public void show(int i) {
		//System.out.println(i);
		//System.out.println(this.i);
		System.out.println(super.i);
	}
}
