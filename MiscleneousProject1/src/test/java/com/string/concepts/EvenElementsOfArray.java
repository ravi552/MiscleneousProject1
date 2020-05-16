package com.string.concepts;

public class EvenElementsOfArray {

	public static void main(String[] args) {
		int array[] = {10,11,12,14,13,15,9};
		//int sum=0;
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]%2==0) {
				//sum=sum+array[i];
				System.out.println(array[i]);
			}
		}
		//System.out.println(sum);
	}

}
