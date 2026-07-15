package learning.besics;

import java.util.Scanner;

public class max2number {
public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the value .1:");
			int n = sc.nextInt();
			
			System.out.println("enter the value .2:");
			int m = sc.nextInt();
			if(n<m) {
				System.out.println("n is greter then m.");
			}else {
				System.out.println("m is greter then n.");
			}
		}
	}

}
