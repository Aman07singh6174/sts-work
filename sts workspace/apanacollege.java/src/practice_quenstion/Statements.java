package practice_quenstion;
import java.util.*;
public class Statements {
	 static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter the income:");
		int income = sc.nextInt();
		int tax;
		if (income < 50000) {
			tax = 0;
			
		} else if (income >= 50000 && income <1000000 ) {
			tax = (int) (income * 0.2);
		} else {
			tax = (int) (income * 0.3);
		}
		System.out.println("your tax is :" + tax );
		sc.close();
}
}