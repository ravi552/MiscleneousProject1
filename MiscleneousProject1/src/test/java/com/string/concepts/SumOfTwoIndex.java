package com.string.concepts;

public class SumOfTwoIndex {
	
	public static void main(String[] args) {
		int arr[]= {10,12,10,11,15};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==arr[i]) {
				sum=sum+arr[i];
				break;
			}
		}
		System.out.println(sum);
	}
}
