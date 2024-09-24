//Cosme Boisset - Lab03 - Problem 3: TriangleSideLength
import java.util.Scanner;

/*
Write a program to check whether a triangle is Equilateral, Isosceles or Scalene.
Facts
• An equilateral triangle is one that has all three sides of the same length.
• An isosceles triangle has two sides of the same length.
• A scalene triangle has all three sides of different lengths.
Input
We will take as input a sequence of the three side lengths of the triangle.
Output
Your program must print whether the triangle is equilateral, isosceles, or scalene.
*/

public class TriangleSideLengths {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String userInput = input.nextLine();

		String[] userInputArray = userInput.split(" ");

		int firstSideLength = 0;
		int secondSideLength = 0;
		int thirdSideLength = 0;

		for (int i = 0; i < userInputArray.length;i++) {

			if (i == 0) {
				firstSideLength = Integer.parseInt(userInputArray[i]);

			} else if (i == 1) {
				secondSideLength =  Integer.parseInt(userInputArray[i]);

			} else if (i == 2) {
				thirdSideLength = Integer.parseInt(userInputArray[i]);
			}
		}

		
		// 1 == 2 && 2 == 3 && 3 == 1
		if (firstSideLength == secondSideLength && secondSideLength == thirdSideLength) {
			System.out.print("equilateral");
		// 1 == 2 && != 3 || 1 == 3 && !== 2
		} else if (firstSideLength == secondSideLength && firstSideLength != thirdSideLength || firstSideLength == thirdSideLength && firstSideLength != secondSideLength) {
			System.out.print("isosceles");
		//as long as user input is correct should all be scalene
		} else {
			System.out.print("scalene");
		}
	}
}