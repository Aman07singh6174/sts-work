package loop;
import java.util.*;
public class starPatarn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	//	inrted star patrn
		for(int k=1;k<=n;k++) {
			for(int l=1;l<=(n-k+1);l++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		//half pyramid
		for(int h=1;h<=n;h++) {
			for(int g=1;g<=h;g++) {
				
				System.out.print(g);
			}
			System.out.println();
		}
		//half pyramid a to z
		char ch = 'A';
		for(int o=1;o<=n;o++) {
			for(int p=1;p<=o;p++) { 
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		sc.close();
	}

}
