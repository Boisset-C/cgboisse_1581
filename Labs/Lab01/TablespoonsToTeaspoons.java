//Cosme Boisset - Problem 3: TablespoonsToTeaspoons
import java.util.Scanner;

public class TablespoonsToTeaspoons {
	public static void main(String[] args) {
		//prompt user for input
		// System.out.print("Enter a Tablespoon number to convert to quantity of teaspoons: ");
		//create scanner class to store user input
		Scanner  input = new Scanner(System.in);

		//declare variable to store user tablespoon input
		int userInput = input.nextInt();
		//declare variable to store result 
		int result = userInput * 3;

		//output result in console	
		System.out.println(result);
	}
}
