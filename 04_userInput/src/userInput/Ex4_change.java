/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 4 - Change
 */


package userInput;

import java.util.Scanner;

public class Ex4_change {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Amount in cents: ");
			int cents = Input.nextInt();
			
			int quarters = cents / 25;
			int dimes = cents % 25 / 10;
			int nickels = cents % 25 % 10 / 5;
			int pennies = cents % 25 % 10 % 5;
			
			System.out.println("Change:");
			System.out.printf("\tQuarters: %d\n\tDimes %d\n\tNickels: %d\n\tPennies: %d", quarters, dimes, nickels, pennies);
		} finally {
			Input.close();
		}

	}

}
