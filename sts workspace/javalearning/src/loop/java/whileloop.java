package loop.java;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
	//prime number
	Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter the number:");
		int n =sc.nextInt();
	
	//while loop
	int k=2;
while(k<=n) {
boolean isPrime =true;
int l=2;
while(l<k) {
if( k%l ==0) {
	isPrime=false;
	break;
}
l++;
}



if (isPrime) {
System.out.println(k);
}
k++;
}
sc.close();
}
	}

