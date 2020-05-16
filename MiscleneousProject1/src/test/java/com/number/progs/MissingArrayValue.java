package com.number.progs;

public class MissingArrayValue {

	public static void main(String[] args) {
		int arr[]= {-1,0,1,2,4,5,6,7,8,9,10};
		int sum=0;
		int sum2=0;
		int missing=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		for(int j=-1;j<=10;j++) {
			sum2=sum2+j;
		}
		System.out.println(sum2);
		missing=sum2-sum;
		System.out.println("The missing number is :"+missing);
	}

}
