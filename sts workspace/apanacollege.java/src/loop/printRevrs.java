package loop;

public class printRevrs {

	public static void main(String[] args) {
	int n=32890;
	int rev=0;
	for(;n>0;n=n/10) {
		int m=n%10;
		 rev=(rev*10)+m;
		
	}
	System.out.print(rev);
	}

}
