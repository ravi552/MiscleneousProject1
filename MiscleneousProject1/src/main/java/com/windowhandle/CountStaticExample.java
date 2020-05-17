package com.windowhandle;

public class CountStaticExample {
	static int count =0;
	
	public CountStaticExample() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		CountStaticExample c = new CountStaticExample();
		CountStaticExample c1 = new CountStaticExample();
		CountStaticExample c2 = new CountStaticExample();
	}

}
