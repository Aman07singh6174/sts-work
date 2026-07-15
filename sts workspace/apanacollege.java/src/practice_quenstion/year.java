//Question 5 : Write a Java program that takes a year from the user and print whether that
//year is a leap year or not
package practice_quenstion;
 import java.util.*;

public class year {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  year:");
		int Year=sc.nextInt();
		if(Year%4==0) {
			System.out.print("That year are leap year"+Year);
		}else if(Year%100==0) {
			System.out.print("That year are leap year"+Year);
			
		}
	else if(Year%400==0) {
		System.out.print("That year are leap year"+Year);
		
	}else {
		System.out.print("That year are not a leap year"+Year);
	}

		sc.close();
	}

}
