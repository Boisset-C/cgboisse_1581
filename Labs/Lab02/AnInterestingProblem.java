//Cosme Boisset - Lab02 - Problem 5: An Interesting Problem
import java.util.Scanner;
import java.lang.Math;

/*
Write a program that accepts two positive integers: a deposited amount of money and an
interest rate, as an annual percentage rate. Your program will calculate the number of years that
will take for the account balance to reach $1, 000,000. You can assume that the initial deposit is
less than $1,000,000

Input
The input will begin with a single line containing T , the number of test cases to follow. The
remaining lines contain the lines to be calculated. Each of these lines has two positive integers
separated by a single space. The first value is the deposited amount, the second is the interest
rate.

Output
The output should consist of the number of years.

Formula:
A = P + P × r 
AKA: A = P ×(1+r)
*/

public class AnInterestingProblem {
	public static void main(String[] args) {
		//capture user input
		Scanner input = new Scanner(System.in);

		//number of test cases to follow
		int numberOfTestCases = input.nextInt();
		int counter = 1; 
		double goal = 1_000_000.00;

	
		//run this program for the amount of test cases
		while (counter <= numberOfTestCases) {
			
			int years = 0;
			//accept two positive integers 1.a deposit amount 2.an interest rate, as an anual percentage rate
			double depositP = input.nextInt();
			double interestRateR = input.nextInt();
			double amountAccumulated = depositP;
						
			// A = P + P × (1 + r) 
			while(amountAccumulated < goal) {
				amountAccumulated += amountAccumulated * (interestRateR / 100);
				years++;

				}

			System.out.println(years + " years");
			// System.out.printf("This is the total: $%.2f%n", amountAccumulated);
			years = 1;
			counter++;


				}

			}
}
