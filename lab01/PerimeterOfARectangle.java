//Cosme Boisset - Problem 8: PerimeterOfARectangle
import java.util.Scanner;

public class PerimeterOfARectangle {
	public static void main(String[] args) {
		//prompt user to first input length and second input the width
		// System.out.println("Please first enter the length of the rectangle, second enter the width of the rectangle: ");

		//create scanner class to retrieve user input
		Scanner input = new Scanner(System.in);

		//declare length variable
		double length = input.nextDouble();
		//declare width variable
		double width = input.nextDouble();
		//declare perimeter result variable
		double perimeterResult = 2 * (length + width);

		//console log the results as output
		System.out.println(perimeterResult);
	}

}