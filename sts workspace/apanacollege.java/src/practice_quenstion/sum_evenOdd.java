//loop
//Question 1 : Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.
package practice_quenstion;
 import java.util.*;
public class sum_evenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter how many numbers: ");
	        int n = sc.nextInt();
		int evenSum=0;
		int  oddSum=0;

        System.out.println("Enter " + n + " numbers:");

		for(int i=0;i<n;i++){
			 System.out.print("Enter the numbers: ");
			   int num = sc.nextInt();
			if(num%2==0) {
				evenSum+=num;
				
			}else {
				oddSum+=num;
				
			}
		
		
		  System.out.println("Sum of Even Numbers = " + evenSum);
	        System.out.println("Sum of Odd Numbers = " + oddSum);

		
	}
		sc.close();
	}

}
