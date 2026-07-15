//Question 1 : Write a Java program to get a number from the user and print whether it is
//positive or negative.

package practice_quenstion;
import java.util.*;

public class positive_or_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		
		//by if else
		if(a>0) {
			System.out.println("Given number are positive:"+a);
		}else {
			System.out.println("Geven number are negative:"+a);
		}
	sc.close();
	}

}
