package com.string.concepts;

public class CountElementPresence {

	public static void main(String[] args) {
		int arr[] = {12,11,32,14,44,25,11};
		int element =11;
		int count =0;
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i] == element) {
				count++;
			}
		}
		System.out.println(count+" times");
		
	}

}
