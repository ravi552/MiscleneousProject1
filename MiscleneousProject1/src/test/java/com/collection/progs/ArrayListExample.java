package com.collection.progs;

import java.util.ArrayList;
import java.util.Iterator;

import com.number.progs.A;
import com.number.progs.B;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		System.out.println("no of elements :"+al.size());
		al.add(new A());
		al.add(new B());
		al.add("ajay");
		al.add(12);
		al.add("ravi");
		al.add(0);
		al.add(null);
		al.add(3,"jan");
		Iterator i= al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("no of elements :"+al.size());
		
	}
}
