//Cosme Boisset - Lab02 - Problem 2: Leap Year
import java.util.Scanner;

public class TestGrade {
	public static void main(String[] args){
		//prompt user to input a grade
		// System.out.println("Please input a grade");
		
		//create scanner object to store user grade input
		Scanner input = new Scanner(System.in);

		//declare a variable to store input 
		int grade = input.nextInt();

		//create conditional statement
		// if grade is 90 - 100 output A
		if (grade >= 90) {
			System.out.println("A");
		} 
		// if grade is 80 - 89 output B
		else if (grade < 90 && grade >= 80) {
			System.out.println("B");
		}
		// if grade is 70 - 79 output C
		else if (grade < 80 && grade >= 70) {
			System.out.println("C");
		}
		// if grade is 50 - 69 output D
		else if (grade < 70 && grade >= 60) {
			System.out.println("D");
		}
		// if grade is less than 50 output F
		else if (grade < 60) {
			System.out.println("F");
		}

	}
}