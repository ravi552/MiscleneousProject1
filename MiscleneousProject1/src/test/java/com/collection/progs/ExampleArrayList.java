package com.collection.progs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExampleArrayList {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("ravi");
		al.add("aavi");
		al.add("kavi");
		al.add("savi");
		al.add("navi");
		al.add("navi");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}

}
