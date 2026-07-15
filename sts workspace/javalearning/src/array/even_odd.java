package array;

import java.util.Scanner;

public class even_odd {

	
		
		public static void input(int[] arr) {
			
		Scanner sc=new Scanner(System.in);
			
			System.out.println("-:==========Input===========:-");
			for(int i=0 ;i<arr.length;i++) {
				System.out.print("Enter index["+i+"]");
				arr[i]=sc.nextInt();
				
			}
			sc.close();
		}
		
		public static void print(int[] arr) {
			System.out.println("-:==========print===========:-");
			
			for(int i=0 ;i<arr.length;i++) {
				
				System.out.print(arr[i]+",");
			}
		}
		public static void Even_Odd(int[] arr) {
			System.out.println("\n-:===========Even_Odd==========:-");
			
			for(int i=0 ;i<arr.length;i++) {
				if(arr[i]%2==0) {
					
					System.out.println("Even Number:"+arr[i]);
				}else {
					
					System.out.println("Odd Number:"+arr[i]);
				}
			}
		}

		public static void main(String[] args) {
			int arr[]=new int[8];
			input(arr);
			print(arr);
			Even_Odd(arr);

		}

	}


