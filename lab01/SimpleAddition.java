//Cosme Boisset - Problem 4: SimpleAddition
import java.util.Scanner;

public class SimpleAddition {
	public static void main(String[] args) {
		//prompt user to input first number
		System.out.println("Input the number you'd like to add in succession: ");


		//create scanner class to receive user input
		Scanner input = new Scanner(System.in);

		//declare variable one to store first int
		int firstNum = input.nextInt();
		//declare variable two to store second int
		int secondNum = input.nextInt();
		//declare a sum variable to output 
		int sum = firstNum + secondNum;

		//console log the sum of the two arguments
		System.out.println(sum);
	}
}