package com.number.progs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringArray {

	public static void main(String[] args) {
		String arr[] = {"java","python","csharp","ruby","php","java","php"};
		String element="java";
		String res="";
		int count=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println("Duplicate element is :"+arr[i]);
				}
			}
		}
		System.out.println("**************************************");
		Set<String> lang =new HashSet<String>();
		for(String name:arr) {
			if(lang.add(name)==false) {
				System.out.println("Duplicate element is :"+name);
			}
		}
		
	}

}
