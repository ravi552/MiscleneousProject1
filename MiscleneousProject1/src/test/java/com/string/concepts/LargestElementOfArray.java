package com.string.concepts;

public class LargestElementOfArray {

	public static void main(String[] args) {

		int arr[] = {12,11,32,14,44,25,11};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The largest element is :"+arr[0]);
		System.out.println("The 2nd largest element is :"+arr[1]);
		
	}

}
