package learning.besics;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		try (Scanner var = new Scanner(System.in)) {
			System.out.println("enter the value:");
			int n = var.nextInt();
			if(n%2==0) {
				System.out.println("that a even number");
			}else {
				System.out.println("that a odd number");
			}
		}

	}

}
