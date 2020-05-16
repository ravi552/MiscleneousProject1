package com.number.progs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {
		
		String str="Hey java is Java best language is java";
		String[] str1=str.split(" ");
		int num=0;
		for(int i=0; i<=str1.length-1; i++) {
			for(int j=i+1;j<=str1.length-1;j++) {
				if(str1[i].contains(str1[j])) {
					
					System.out.println("The duplicate word is -->>"+str1[i]+" present "+num+" times");
					num++;
				}
			}
		}
		System.out.println("*********************************************");
		Set<String> items =new HashSet<String>() ;
		for(String name:str1) {
			if(items.add(name)==false) {
				System.out.println("The duplicate word is -->>"+name);
			}
		}
		
		
	}

}
