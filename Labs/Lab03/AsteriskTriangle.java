//Cosme Boisset - Lab03 - Problem 2: Asterisk Triangle
import java.util.Scanner;

/* 
Facts
• We want to take as an input the number of rows in our right triangle made of asterisks
and we want to output the right triangle.
Input
We must take the number of rows as an integer as our input.
2
Output
Your program must print the right triangle of asterisks.
*/

//input.sequence
//system 

public class AsteriskTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int triangleSize = input.nextInt();
		
		for (int i = 1; i <= triangleSize; i++) {

			for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}

		System.out.println();

		}
	}
}