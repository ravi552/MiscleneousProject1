package com.string.concepts;

public class FindIndexArray {

	public static void main(String[] args) {
		int arr[] = {12,11,32,14,44,25,10};
		int element=10;
		int index=0;
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]==element) {
				System.out.println("index is->"+index);
			}
			index++;
		}
		
	}

}
