/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 18 2022
 * Description: Programming Assessment 3 - Secret Number
 */


package programmingAssessment3;

// Import Scanner and Random classes
import java.util.Scanner;
import java.util.Random;

public class secretNumber {

	public static void main(String[] args) {
		
		// Create Scanner and Random objects
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		// Welcome
		System.out.println("Welcome\n");
		
		// Initialize variables
		int points = 0;
		int played = 0;
		int centre = 1;
		
		// Game loop, exits if user inputs 0
		while (centre != 0) {
			
			// Get number between 5 and 10 from user
			do {
				System.out.print("Enter a number between 5 and 10 (0 to exit game): ");
				centre = Input.nextInt();
			} while ((centre < 5 || centre > 10) && centre != 0);
			
			// If number is not 0 continue game
			if (centre != 0) {
				
				// Generate random number within 3 from centre
				int secret = centre - 3 + Rand.nextInt(7);
				
				// Guess loop
				int guesses = 3;
				while (guesses > 0) {
					
					// Get user guess
					System.out.print("Guess a random number between " + (centre - 3) + " and " + (centre + 3) + ": ");
					int input = Input.nextInt();
					
					// If guess is correct give user points and exit loop
					if (input == secret) {
						System.out.println("You guessed the correct secret number! You get " + guesses + " points.");
						points += guesses;
						guesses = 0;
					
					// If guess is wrong but within range continue loop and decrease guess count
					} else if (input <= centre + 3 && input >= centre - 3) {
						System.out.println("You didn't guess the secret number!");
						guesses--;
					
					// If guess is not within range continue loop
					} else {
						System.out.println("That number is not in the range");
					}
				}
				
				// Formatting and increase times played by 1
				System.out.println();
				played += 1;
			}
		}
		
		// Tell user how many times they played, points they earned, and goodbye
		System.out.println("You played " + played + " times. You have " + points + " points.");
		System.out.print("Goodbye");
		
		// Close Scanner object
		Input.close();

	}

}
