package array;

import java.util.*;

public class input_print {
	
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

	public static void main(String[] args) {
		int arr[]=new int[15];
		input(arr);
		print(arr);

	}

}
