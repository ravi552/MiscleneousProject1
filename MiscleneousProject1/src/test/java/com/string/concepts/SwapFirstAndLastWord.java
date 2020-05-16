package com.string.concepts;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
		String string ="A friEND IN NEED is A friend INDEED";
		//System.out.println(string.replace('A', 'O'));
		String strArr[] = string.split(" ");
		int len=strArr.length;
		System.out.println(len);
		for(int a=0;a<=strArr.length-1;a++ ) {
			System.out.print(strArr[a]+" ");
		}
		System.out.println();
		
		String temp =strArr[0];
		strArr[0]=strArr[strArr.length-1];
		strArr[strArr.length-1]= temp;
		String res=" ";
		
		for(int i=0;i<=strArr.length-1;i++) {
			//System.out.print(strArr[i]+" ");
			res=res+strArr[i]+" ";
		}
		System.out.println(res);
	}

}
