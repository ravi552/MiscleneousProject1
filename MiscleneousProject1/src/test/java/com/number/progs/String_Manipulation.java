package com.number.progs;

public class String_Manipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started heres";
		String str2 = "The rains have started heres";
		
		System.out.println(str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		//System.out.println((str.indexOf('s', str.indexOf('s')+1)),9);
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.substring(0, 9));
		String s="    hello world      ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		String date = "01-09-2020";//01/09/2020
		System.out.println(date.replace("-", "/"));
		String test = "Hello_world_test_selenium";
		String arr[]=test.split("_");
		for(String test1:arr) {
			System.out.print(test1+" ");
		}
		System.out.println();
		String s2="pm";
		System.out.println(s2.concat("cares"));
		String x="hello";
		String y="world";
		int a=100;
		int b=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);//helloworld100200
		System.out.println(a+b+x+y);//300helloworld
		System.out.println(x+y+(a+b));//helloworld300
	}

}
