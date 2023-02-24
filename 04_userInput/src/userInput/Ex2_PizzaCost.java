/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 2 - Pizza Cost
 */


package userInput;

import java.util.Scanner;
import java.text.NumberFormat;

public class Ex2_PizzaCost {
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		NumberFormat Money = NumberFormat.getCurrencyInstance();
		
		try {
			final double labor = 0.75;
			final double rent = 1.00;
			
			System.out.print("Size of pizza: ");
			double diameter = Input.nextDouble();
			double material = 0.05 * diameter * diameter;
			
			double cost = labor + rent + material;
			System.out.printf("Total cost: %s", Money.format(cost));
		} finally {
			Input.close();
		}
	
	}

}
