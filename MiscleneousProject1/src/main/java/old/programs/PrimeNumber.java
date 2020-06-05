package old.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		//int num =19;
		int flag=0;
		for(int i=1;i<=500;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag !=1) {
				System.out.println(i);
			}
			flag=0;
		}
	}

}
