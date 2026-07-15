package array;
import java.util.*;

public class multiply {


	public static void input(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-:================Input================:-");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the index:["+i+"]");
			arr[i]=sc.nextInt();
		}
		sc.close();
		
	}
		public static void print(int[] arr) {
			System.out.println("-:================print================:-");
			for(int i=0;i<arr.length;i++) {
				System.out.println("Value of index:"+arr[i]);
				
			}
			
		}
			public static void Multiply(int[] arr) {
				System.out.println("-:===============Multiply=================:-");
				int multiply1=1;
				for(int i=0;i<arr.length;i++) {
				multiply1=multiply1*arr[i];
			}
				System.out.println("Total value of this arr:"+multiply1);
			}
	
	public static void main(String[] args) {
		int arr[]=new int[12];
		input(arr);
		print(arr);
		Multiply(arr);

	}

}
