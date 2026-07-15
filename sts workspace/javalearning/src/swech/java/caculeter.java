package swech.java;
import java.util.Scanner;

public class caculeter{

	public static void main(String[] args) {
	
		

				Scanner sc = new Scanner(System.in) ;

					System.out.println("enter the value:");
					int n = sc.nextInt();
					System.out.println("enter the value:");
					int n2 = sc.nextInt();
					System.out.println("enteran operaterb/w(+,-,*,/,%)");
					char operator = sc.next().charAt(0);
					switch(operator) {
					case '+' :
						System.out.println(n+n2);
					break;
					case '-' :
						System.out.println(n-n2);
						break;
					case '*' :
						System.out.println(n*n2);
						break;
					case '/' :
						System.out.println(n/n2);
						break;
					case '%' :
						System.out.println(n%n2);
						break;
						default:
							System.out.println("inveled input-----------!");
							
							sc.close();
							
			}

		}
		


	}


