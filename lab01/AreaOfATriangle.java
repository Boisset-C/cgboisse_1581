//Cosme Boisset - Problem 5: AreaOfATriangle
import java.util.Scanner;

public class AreaOfATriangle {
	public static void main(String[] args) {
		//prompt user to first enter the base number, then second the height of the triangle
		// System.out.println("First input the base of the triangle, second input the height of the triangle: ");
		
		//create scanner class which will be used to store user input
		Scanner input = new Scanner(System.in);
		
		//declare base variable
		double base = input.nextDouble();
		//declare height variable
		double height = input.nextDouble();
		//declare results variable
		double results = 0.5 * base * height;

		//console log the area of the triangle
		System.out.println(results);
	}
}

