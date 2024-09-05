//Cosme Boisset - Lab02 - Problem 4: PointOfSaleSystem
import java.util.Scanner;
import java.util.Arrays;

/*
MENU:
1. Regular Hamburger $1.50
2. Regular Cheeseburger $1.75
3. Fish Sandwich $2.50
4. Half-pounder with cheese $2.75
5. French Fries $0.99
6. Large Soft Drink $1.25

The first line of input represents N, the number of test cases. The additional lines consists of a
sequence of integers scoped between 1 to 6. Each number should indicate a selection from the
above menu to be purchased. 
*/

public class PointOfSaleSystem {
	public static void main(String[] args) {
		//create Scanner to store user input
		Scanner input = new Scanner(System.in);

		//amount of orders
		int amountOfOrders = input.nextInt();
		int counter = 0;
		double tax = 0.065;
		double orderTotal = 0.000;
		double[] menu = {1.50, 1.75, 2.50, 2.75, 0.99, 1.25};
		


		//while this many orders keep calculating
		while (counter < amountOfOrders) {

			//take user order
			String userOrder = input.nextLine();

			//convert order into an array
			String[] orderTaken = userOrder.split(" ");
			String orderString = Arrays.toString(orderTaken);

			/*
			!!!Keeping this for debugging purposes!!!
			System.out.printf("The number is: %s%n", userOrder);
			System.out.printf("The order taken is: %s%n", orderString);
			*/


			
			// If the input is empty, skip this iteration
            if (userOrder.isEmpty()) {
                /*
				!!!Keeping this for debugging purposes!!!
				System.out.println("Empty order received, skipping.");
				*/
                continue;
            }


			//convert order elements back into intenger to be added
			int[] orderArray = new int[orderTaken.length];

			//store order in an array
			for(int i = 0; i < orderArray.length; i++) {

			orderArray[i] = Integer.parseInt(orderTaken[i]);
			/*
			!!!Keeping this for debugging purposes!!!
			System.out.printf("Each Item ordered: %d%n", orderArray[i]);
			*/
			
		}

			//calculate order total
			for (int j = 0; j < orderArray.length; j++) {
				int itemOrdered = orderArray[j];

				// 1 should be menu[0] = 1.50
				if (itemOrdered == 1) {
					orderTotal += menu[0];
				}
				else if (itemOrdered == 2) {
					orderTotal += menu[1];
				}
				else if (itemOrdered == 3) {
					orderTotal += menu[2];
				}
				else if (itemOrdered == 4) {
					orderTotal += menu[3];
				}
				else if (itemOrdered == 5) {
					orderTotal += menu[4];
				}
				else if (itemOrdered == 6) {
					orderTotal += menu[5];
				}

			}
			//output "Please pay $12.77" +  sum and on next line log the string "Thank you for eating at MacDowell's"
			double finalPriceWithTax = Math.ceil((orderTotal + (orderTotal * tax)) * 100.0) / 100.0;

			System.out.println(String.format("Please pay $%.2f%n", finalPriceWithTax));
			System.out.println("Thank you for eating at McDowell's!");
			

			orderTotal = 0;
			counter++;
			}
		
		}
	}

