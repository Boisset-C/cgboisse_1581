//Cosme Boisset - Lab02 - Problem 6: Min/Max Search by Value
import java.util.Scanner;
import java.util.Arrays;

/*
Develop a program that, given a sequence S of integers as input, produces as two output
values, the first is the minimum value that appears in the sequence and the second is the
maximum value that appears in the sequence.

Facts
● Scanner has a method that returns a boolean indicating whether a next integer exists in
its input stream ( hasNextInt() )
● Scanner objects can be initialized to to scan String data as input.

Input
The input will begin with a single line containing T , the number of test cases to follow. The
remaining lines contain the T sequences, one line per sequence. Each of these lines contains
the values in the sequence. Each such value is separated from the next by at least one space.

Output
For each sequence given as input, there should be four lines of output. The first line echos the
given sequence. The second line indicates the minimum value that occurs. The third line
indicates the maximum value that occurs. The fourth line is blank. 

*/
//inputs
//T number of Test Cases
//Sequence S of intengers as input i.e 3 6 -1 4 6 5 3
//output
//min value and the second is max value

public class MinMaxSearchByValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int testCases = input.nextInt();
		input.nextLine();
		int counter = 0;
		

		while (counter < testCases) {
			//capture user input sequence
			String inputSequence = input.nextLine().trim();

			//convert user input into an array
			String[] arrayInputSequence = inputSequence.split(" ");
			String stringInputSequence = Arrays.toString(arrayInputSequence);

			int[] arrayInputSequenceNumbers = new int[arrayInputSequence.length];

			for (int i = 0; i < arrayInputSequence.length; i++) {
                arrayInputSequenceNumbers[i] = Integer.parseInt(arrayInputSequence[i]);
            }


			int min = arrayInputSequenceNumbers[0];
			int max = arrayInputSequenceNumbers[0];


			//Find Min/Max 
			for (int i = 1; i < arrayInputSequenceNumbers.length; i++) {
			

				if (arrayInputSequenceNumbers[i] <= min)

				{
					min = arrayInputSequenceNumbers[i];

				} 

				else if (arrayInputSequenceNumbers[i] >= max) 

				{
					max = arrayInputSequenceNumbers[i];
				}


			}

			// Output the results
            System.out.println(inputSequence);
            System.out.println(min);
            System.out.println(max);
            System.out.println();
			counter++;
		}

	}
}