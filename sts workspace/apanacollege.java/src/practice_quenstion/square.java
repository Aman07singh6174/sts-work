
//Question 2: In a program, input the side of a square. You have to output the area of the
//square.

package practice_quenstion;

import java.util.*;

public class square {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the side of a square:");
		int side =sc.nextInt();
		 
		int area =side*side;
		System.out.println("Area of the square:"+area);
		
sc.close();
	}

}

