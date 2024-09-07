//Cosme Boisset - Lab02 - Problem 3: SummingItUp
import java.util.Scanner;

public class SummingItUp {
	public static void main(String[] args) {
		//prompt user to add two inputs
		// System.out.println("Add two inputs they should be intengers between -10,000 and 10,000 you will get the sum of each numbers between ");

		//create scanner to grab user input 
		Scanner input = new Scanner(System.in);

		//variable to store number of test cases from user input
		int numOfTestCases = input.nextInt();
		// will keep track of which test case we are on
		int counter = 1;
		
		//initialize variable to accumulate
		int sum = 0;

		//check number of test cases
		while(counter <= numOfTestCases) {
			//declare two variables of int type
			int firstInt = input.nextInt();
			int secondInt = input.nextInt();
			//check which number is bigger
			// if first input is less than second int sum from first input
			if (firstInt <= secondInt) {
			//iterate between every number 
			for (int i = firstInt; i <= secondInt; i++) {
				sum += i;
				// System.out.printf("sum: " + sum);
			}
		} 
		//if first input is less than second int sum from second input
		else {
			//iterate between every number 
			for (int i = secondInt; i <= firstInt; i++) {
				sum += i;
				//System.out.printf("sum: ", + sum);
			}

		}

		//assume that both numbers are between -10k && 10k
		//print result
		System.out.println(sum);
		counter++;
		sum = 0;
		}

	}
}