package array;
import java.util.*;

public class Replace_even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
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
	public static void even(int[] arr) {
		System.out.println("-:==========even odd===========:-");
		
		for(int i=0 ;i<arr.length;i++) {
			
			System.out.println("Value of index:"+arr[i]);
	

	}
	}}

