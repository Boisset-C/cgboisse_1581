//Cosme Boisset - Problem 7: FahrenheitToCelsius
import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		//prompt user to input a temp in fahrenheit to convert it to celsius
		System.out.println("Please input a temp in Fahrenheit that you would like to convert into celsius: ");

		//create scanner to retrieve user input
		Scanner input = new Scanner(System.in);

		//declare variable to store Fahrenheit temp
		double fahrenheitTemp = input.nextDouble();

		//declare variable to store results 
		double celsiusTemp = (fahrenheitTemp - 32) * (5.0/9.0);
		
		//console log as output results of temp conversion
		System.out.println(celsiusTemp);

	}

}