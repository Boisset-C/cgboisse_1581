//Cosme Boisset - Problem 2: MinutesToSeconds
import java.util.Scanner;

public class MinutesToSeconds {
	public static void main(String[] args) {
		//prompt user to input a number of minutes to be calculated into seconds
		// System.out.print("Please input a number of minutes to calculate into seconds: ");

		//create scanner class to store user input
		Scanner input = new Scanner(System.in);

		//create variable to store user input
		int userInputMinutes = input.nextInt();
		//create variable to store result
		int resultOfMinutestoSeconds = userInputMinutes * 60;

		//console log result aka output
		System.out.println(resultOfMinutestoSeconds);

	}
}