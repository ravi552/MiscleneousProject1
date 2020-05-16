package com.string.concepts;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int arr1[] = {12,11,32,14,44,25,10};
		int arr2[] = {22,21,23,44,54,55,56};
		int arr1length=arr1.length;
		int arr2length=arr2.length;
		int arr3[] = new int[arr1length+arr2length];
		System.arraycopy(arr1, 0, arr3, 0, arr1length);
		System.arraycopy(arr2, 0, arr3, arr1length, arr2length);
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
