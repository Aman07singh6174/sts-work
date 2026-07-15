package learning.besics;

import java.util.Scanner;

public class min2number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the value .1:");
			int n = sc.nextInt();
			
			System.out.println("enter the value .2:");
			int m = sc.nextInt();
			if(n>m) {
				System.out.println("n is less then m.");
			}else {
				System.out.println("m is less then n.");
			}

	
			sc.close();
	}
}