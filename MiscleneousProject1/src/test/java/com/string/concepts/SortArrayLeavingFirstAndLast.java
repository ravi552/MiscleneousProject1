package com.string.concepts;

public class SortArrayLeavingFirstAndLast {

	public static void main(String[] args) {
		int arr[] = {12,11,32,14,44,25,10};

		for(int i=1;i<=arr.length-2;i++) {
			//System.out.println(arr[i]);
			for(int j=i+1;j<=arr.length-2;j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
