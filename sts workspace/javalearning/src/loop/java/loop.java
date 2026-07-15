package loop.java;
import java.util.Scanner;


public class loop {

	public static void main(String[] args) {
		//prime number
	Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		
   for(int i=2;i<=n;i++) {
			boolean isPrime =true;
			for(int j=2;j<i;j++) {
		if( i%j ==0) {
			isPrime=false;
			break;
		}
		}
			if (isPrime) {
			System.out.println(i);
			}

	sc.close();
}
     }
	}

	
	

