package com.string.concepts;

public class AvgValueOfArray {

	public static void main(String[] args) {
		int arr[] = {12,11,32,14,44,25,10};
		int sum=0;
		double avg=0;
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
			count++;
		}
		System.out.println("sum is :"+sum);
		avg=(sum/(float)count);
		System.out.println("average is :"+avg);
	}

}
