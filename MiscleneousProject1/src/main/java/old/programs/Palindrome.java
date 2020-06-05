package old.programs;

public class Palindrome {

	public static void main(String[] args) {
	
		
		for(int num=1;num<=500;num++) {
			int temp=num;
			int rev=0;
			int rem=0;
			while(temp>0) {
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(rev == num) {
				System.out.println(num);
			}
		}
	}
}
