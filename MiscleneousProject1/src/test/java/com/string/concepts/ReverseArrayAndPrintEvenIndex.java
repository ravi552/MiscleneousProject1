package com.string.concepts;

public class ReverseArrayAndPrintEvenIndex {

	public static void main(String[] args) {
		int array[] = {10,11,12,14,13,15,9};
		
		for(int i=array.length-1;i>=0;i=i-1) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=0;i<=array.length-1;i=i+2) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=1;i<array.length;i=i+2) {
			System.out.print(array[i]+" ");
		}
		
	}

}
