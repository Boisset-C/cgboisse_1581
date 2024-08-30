//Cosme Boisset - Problem 1: AreaOfASquare
import java.util.Scanner;

public class AreaOfASquare {
	//method
	public static void main(String[] args) {
		//prompt user to input a length to calculate Area of square
		// System.out.print("Input a number to calculate the Area of a Square: ");
		
		// create scanner class to store user input
		Scanner input = new Scanner(System.in);

		//declare length variable to store user input 
		int length = input.nextInt();
		//declare area variable to store result of computation 
		int area = length * length;
		//console log result
		System.out.println(area);
	}

}