package array;

import java.util.*;

public class sum {
	public static void input(int[]arr) {
		Scanner sc =new Scanner(System.in);
		System.out.println("!-----------------input------------------------!");
		
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter the value of arr["+i+"]");
			 arr[i]=sc.nextInt();
	}
		sc.close();
	
	}
		public static void Print(int[]arr) {
			System.out.println("!---------------print--------------------------!");
			for(int i =0;i<arr.length;i++) {
				System.out.print(  arr[i]+",");
			}
		}
		public static void Sum(int[]arr) {
			System.out.println("\n!--------------------Sum---------------------!");
			int sum =0;
			for(int i =0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			System.out.println("\n sum of arr"+sum);
		}
			
	public static void main(String[]args){
	int arr[] = new int[8];
		
	input(arr);
	Print(arr);
	Sum(arr);

	}
	
} 

