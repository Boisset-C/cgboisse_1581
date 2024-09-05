
//Cosme Boisset - Lab02 - Problem 1: Leap Year
import java.util.Scanner;

//initialize class 
public class LeapYear {
	public static void main(String[] args) {

		//take user input
		Scanner input = new Scanner(System.in);

		//declare a variable to store user input
		int year = input.nextInt();

		//create if/else conditional statement
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			//console log if user input is a leap year
			System.out.println("Leap Year");
		}
		else {
			//console log if user input is not a leap year
			System.out.println("Not Leap Year");
		}
	}
}