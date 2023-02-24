/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 14 2022
 * Description: Exercise 1 - Guessing Game
 */


package whileLoop2;

import java.util.Scanner;
import java.util.Random;

public class Ex1_guessingGame {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		try {
			int points = 0;
			int play = 1;
			while (play == 1) {
				int wrongs = 0;
				int min = 15 + Rand.nextInt(36);
				int max = 15 + Rand.nextInt(36);
				if (min > max) {
					min += max;
					max = min - max;
					min -= max;
				}
				int num = min + Rand.nextInt(max - min + 1);
				System.out.printf("Min: %d\nMax: %d\n", min, max);
				
				int correct = 0;
				while (correct == 0) {
					System.out.print("Your guess: ");
					int guess = Input.nextInt();
					if (guess == num) {
						correct = 1;
						points += 1;
						System.out.printf("Your points: %d\nNumber of wrong guesses: %d\n", points, wrongs);
						System.out.print("Enter 1 to play again: ");
						if (Input.nextInt() != 1) {
							play = 0;
						}
					} else {
						wrongs += 1;
						System.out.print("Wrong guess. Try again.\n");
					}
				}
			}
		} finally {
			Input.close();
		}

	}

}
