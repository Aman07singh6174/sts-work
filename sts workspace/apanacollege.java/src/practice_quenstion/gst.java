	//Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
	//an eraser. You have to output the total cost of the items back to the user as their bill.
	//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

	
package practice_quenstion;

	import java.util.*;
	public class gst {

	

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter the cost of pen:");
			float pen=sc.nextFloat();
			
			System.out.print("Enter the cost of pencil:");
			float pencil=sc.nextFloat();
			
			System.out.print("Enter the cost of Eraser:");
			float Eraser=sc.nextFloat();
			
			float total_cost =pen+pencil+Eraser;
			
		System.out.println("Total cost "+total_cost);
		float GST=18/100;
		System.out.print( "Total cost with inculded GST"+total_cost+GST);
		
			
			
	sc.close();
		}

	}


