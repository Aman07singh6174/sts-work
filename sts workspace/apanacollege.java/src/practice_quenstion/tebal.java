//Question 4 : Write a program to print the multiplication table of a number N, entered by the
//
//user
package practice_quenstion;
import java.util.*;
public class tebal {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the number of table:");
 int n=sc.nextInt();
 for(int i =1;i<=10;i++) {
	 
	 System.out.println(n+"*"+i+"="+(n*i));
 }
 sc.close();

	}

}
