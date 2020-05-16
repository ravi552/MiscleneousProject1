package com.string.concepts;

public class SwapFirstAndLastWord2 {

	public static void main(String[] args) {
		String string ="A friEND IN NEED is A friend INDEED";
		String sArr[] = string.split(" ");
		String rev=" ";
		for(int i=0;i<=sArr.length;i++) {
			String s=sArr[i];
			if(i==0 || i==sArr.length-1) {
				for(int j=s.length()-1;j>=0;j--) {
					rev =rev+s.charAt(j);
				}
			}else {
				rev=rev+s;
			}
			rev=rev+" ";
		}
		
		System.out.println(rev); 
		
	}

}
