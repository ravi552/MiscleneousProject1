package com.string.concepts;

import java.util.Arrays;

public class MergeTwoStrings {
	
	public static void main(String[] args) {
		char firstArray[] = {'a','e','i'};
		char secondArray[] = {'o','u'};
		int farray =firstArray.length;
		int sarray =secondArray.length;
		char res[] =new char[farray+sarray];
		System.arraycopy(firstArray, 0, res, 0, farray);
		System.arraycopy(secondArray, 0, res, farray, sarray);
		System.out.println(Arrays.toString(res));
	}

}
