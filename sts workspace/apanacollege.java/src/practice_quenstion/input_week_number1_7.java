//Question 3 : Write a Java program to input week number(1-7) and print day of week name
//using switch case
package practice_quenstion;
import java.util.*;

public class input_week_number1_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("Input week number:");
	int number=sc.nextInt();
	
	switch(number){
		case 1:
			System.out.print("Sunday");
			break;
		case 2:
			System.out.print("Monday");
			break;
		case 3:
			System.out.print("Tuesday");
			break;
		case 4:
			System.out.print("wednesday");
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday");
			break;
		case 7:
			System.out.print("saturday");
			break;
			default:
				System.out.print("*Invaled input*");
				
	}
	sc.close();
	}

}
