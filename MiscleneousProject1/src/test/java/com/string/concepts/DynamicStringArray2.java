package com.string.concepts;

public class DynamicStringArray2 {

	public static void main(String[] args) {
		DynamicStringArray1 obj = new DynamicStringArray1(110, "mike");
		DynamicStringArray1[] arr = new DynamicStringArray1[4];
		arr[0]=obj;
		arr[1]=new DynamicStringArray1(111, "andrew");
		arr[2]=new DynamicStringArray1(112, "jack");
		arr[3]=new DynamicStringArray1(113, "mac");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i].name +" "+arr[i].rollNo);
			
		}
		
	}

}
