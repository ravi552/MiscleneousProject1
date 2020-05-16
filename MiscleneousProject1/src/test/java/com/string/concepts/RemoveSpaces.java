package com.string.concepts;

public class RemoveSpaces {

	public static void main(String[] args) {
		String string ="A friEND IN NEED is A friend INDEED";
		//System.out.println(string.trim().replaceAll("\\s",""));
		String arr[] = string.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			String s=arr[i];
			if(i%2==0) {
				
			}else {
				for(int j=s.length()-1;j>=0;j--) {
					System.out.print(s.charAt(j));
				}
				System.out.print(" ");
			}
		}
	}
}
