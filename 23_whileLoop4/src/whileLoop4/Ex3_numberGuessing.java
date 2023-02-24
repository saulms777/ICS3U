/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 17 2022
 * Description: Exercise 3 - Number Guessing
 */

package whileLoop4;

import java.util.Scanner;
import java.util.Random;

public class Ex3_numberGuessing {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		try {
			int num = Rand.nextInt(101);
			System.out.println("The random number is a number between 0 and 100");
			while (true) {
				System.out.print("Guess: ");
				int guess = Input.nextInt();
				if (guess < num) {
					System.out.println("The number is higher");
				} else if (guess > num) {
					System.out.println("The number is lower");
				} else {
					break;
				}
			}
		} finally {
			Input.close();
		}

	}

}
