//Question 2 : Finish the following code so that it prints You have a fever if your temperature
//is above 100 and otherwise prints You don't have a fever.


package practice_quenstion;
import java.util.*;

public class fever {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the the temperature: ");
		int a=sc.nextInt();
		if(a>100) {
			System.out.println("You have a fever:"+a);
			
		}else {
			System.out.println("You don't have a fever:"+a);
			
		}
sc.close();
	}

}
