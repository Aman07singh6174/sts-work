package array;

import java.util.Scanner;

public class Replace_all_element_by_their_square {


	
	
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
			
			System.out.println("Value of index:"+arr[i]);
		}
	}
	public static void square(int[] arr) {
		System.out.println("\n-:============Replace all element by their square==========:-");
		int squ =arr[0];
		for(int i=0 ;i<arr.length;i++) {

			 System.out.println("Replace all element by their square:-  "+squ);
		}
		System.out.println("\n-:===========square==========:-");
		
		System.out.println("Square value:"+squ);
	}

	public static void main(String[] args) {
		int arr[]=new int[8];
		input(arr);
		print(arr);
		square(arr);

	}

}

