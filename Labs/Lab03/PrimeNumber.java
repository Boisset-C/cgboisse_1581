//Cosme Boisset - Lab03 - Problem 4: PrimeNumber
import java.util.Scanner;

/*
3
Problem 4: Prime Number (10 points)
(Cyber Security) A number is considered prime if its only divisible by itself and 1. Note that 1 is
not prime. Prime numbers are commonly used in many current encryption techniques. So it's
very important to be able to identify whether a number is prime or not. Write a program that if
given an integer number, will determine if it is prime.
Facts
● You must check the given number to every possible smaller number
● If no smaller factor divides wholly then that number must be prime
● If a smaller factor divides wholly then that number is not prime
Input
The first line will be the number of test cases. Each line afterwards, is a single integer input.
Output
Your program must print boolean result whether the number is prime or not
*/



public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		int counter = 1;

		//run program for duration of test cases 
		while (counter <= numCases) {
			int isPrimeInput = input.nextInt();
			boolean isPrime = true;

			//base case neither 0 or 1 can be a prime
			if (isPrimeInput <= 1) {	
				System.out.println("false");
				break;
			} else {
			 	isPrime = true;
			}

			//check to see if input is divisible by any of its divisor from 2 up to its number
			for (int i = 2; i < isPrimeInput; i++) {

				 if ( isPrimeInput % i == 0) {
					isPrime = false;
					break;
				} 
			}

			//print out result of false or true
			if (isPrime) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

			counter++;
		}

		
	}
}