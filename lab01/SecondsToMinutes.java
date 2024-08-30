//Cosme Boisset - Problem 6: SecondsToMinutes
import java.util.Scanner;

public class SecondsToMinutes {
	public static void main(String[] args) {
		//prompt users to enter an amount of seconds that they'd like to compute into minutes
		// System.out.println("Enter the amount of seconds you would like converted to minutes: ");
		
		//create scanner class to store user input
		Scanner input = new Scanner(System.in);

		//declare user input variable
		double amountOfSeconds = input.nextDouble();
		//declare results variable
		double amountOfMinutes = amountOfSeconds / 60.0;

		//console log results 
		System.out.println(amountOfMinutes);
	}

}