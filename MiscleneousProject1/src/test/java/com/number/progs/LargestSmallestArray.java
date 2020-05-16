package com.number.progs;

public class LargestSmallestArray {

	public static void main(String[] args) {
		int arr[] = {12,-22,19,29,35,0,1234,1235};
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}if(arr[i]<min) {
				min=arr[i];
			}

		}
		System.out.println("Max ="+max+" Min ="+min);
	}

}
