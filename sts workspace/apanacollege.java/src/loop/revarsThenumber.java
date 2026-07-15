package loop;

public class revarsThenumber {

	public static void main(String[] args) {
		int n=3993847;
//		while(n>0) {
//		int	rev= n%10;
//			System.out.print(rev);
//		n=n/10;
//		}
		
		for(;n>0;n=n/10) {
			int rev=n%10;
			System.out.print(rev);
		}
		

	}

}
