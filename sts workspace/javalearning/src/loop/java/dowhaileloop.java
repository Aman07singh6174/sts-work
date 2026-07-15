package loop.java;

import java.util.Scanner;

public class dowhaileloop {
	public static void main(String[] args) {
	//prime number
	Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		//dowhaileloop
		System.out.println(2);
		int k=3;
		do {
			boolean isPrime =true;
			int l=2;
			do {
				if( k%l ==0) {
					isPrime=false;
					break;
				}
				l++;
					}while(l<k);
		if (isPrime) {
			System.out.println(k);
			}
		k++;
			}while(k<=n);
		
			
			
			sc.close();
		}
	}
