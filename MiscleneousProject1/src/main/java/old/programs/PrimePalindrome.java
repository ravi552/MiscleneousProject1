package old.programs;

public class PrimePalindrome {

	public static void main(String[] args) {
		
		for(int i=1;i<=500;i++) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag!=1) {
				//System.out.println(i);
				int temp=i;
				int rem=0;
				int rev=0;
				while(temp>0) {
					rem=temp%10;
					rev=rev*10+rem;
					temp=temp/10;
				}
				if(rev==i) {
					System.out.println(i);
				}
			}
		}
	}

}
