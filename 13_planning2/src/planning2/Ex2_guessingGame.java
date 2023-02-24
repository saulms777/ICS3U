/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 2 - Guessing game
 */

package planning2;

import java.util.Scanner;
import java.util.Random;

public class Ex2_guessingGame {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		try {
			int userPoints = 0;
			while (true) {
				int number = 10 + Rand.nextInt(6);
				System.out.print("Guess number between 10 and 15: ");
				int guess = Input.nextInt();
				
				if (guess == number) {
					userPoints += 3;
				} else {
					userPoints--;
				}
				
				System.out.print("Enter 0 to exit: ");
				if (Input.nextInt() == 0) {
					break;
				}
			}
			
			System.out.printf("Points: %d", userPoints);
		} finally {
			Input.close();
		}

	}

}
