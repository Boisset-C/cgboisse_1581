//Cosme Boisset - Lab03 - Problem 1: TimesTable
import java.util.Scanner;
/*
Problem 1: Times Tables (10 points)
Write a program to display the multiplication table for a given integer.
Facts
• We want to take the number that we want the multiplication table of from the user as an
integer
• We also want to take the number that the multiplication table will go up to as an integer
• For example, if we take in 1 as the number we want the multiplication table of and 10 as
the number we want to go up to, we will calculate 1x1, 1x2, 1x3, …, 1x10.
Input
The first line will be the number that we want the multiplication table of. The second line will be
the number that we want to go up to.
Output
Your program must print the results of the multiplication table with each result on a new line.
*/

public class TimesTables {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int startNum = input.nextInt();
		input.nextLine();
		int endNum = input.nextInt();
	

		for (int i = 1; i <= endNum; i++) {
			int result = i * startNum;
			System.out.println(result);
		}


	}
}
