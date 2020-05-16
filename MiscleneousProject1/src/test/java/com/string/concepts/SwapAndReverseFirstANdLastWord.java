package com.string.concepts;

public class SwapAndReverseFirstANdLastWord {

	public static void main(String[] args) {
//		StringBuilder sb2 = new StringBuilder("We fail- "); 
//        System.out.println("Input: " + sb2); 
//  
//        // Appending the boolean value 
//        sb2.appe; 
//        System.out.println("Output: " + sb2); 
//		
		
		String string ="A friEND IN NEED is A friend INDEED";
		String arr[] = string.split(" ");
		
		String temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		String res="";
		for(int i=0;i<=arr.length-1;i++) {
			res=res+arr[i]+" ";
		}
		System.out.println(res);
	}

}
