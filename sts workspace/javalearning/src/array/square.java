package array;
import java.util.*;

public class square {

	public static void input(int[] arr) {
		Scanner sc =new Scanner(System.in);		
		System.out.println("-:================Input================:-");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the index:["+i+"]");
			arr[i]=sc.nextInt();
		}
		sc.close();
		
	}
		public static void print(int[] arr) {
			System.out.println("-:================Print================:-");
			for(int i=0;i<arr.length;i++) {
				System.out.println("Value of index:"+arr[i]);
				
			}
			
		}
			public static void Square(int[] arr) {
				System.out.println("-:================Square================:-");
				int squ=1;
				for(int i=0;i<arr.length;i++) {
					
					 squ=arr[i]*arr[i];
				}
				
					System.out.println("Value of Square"+squ);
				
			}
	public static void main(String[] args) {
		int arr[]=new int[8];
		input(arr);
		print(arr);
		Square(arr);
	}

}
